package org.example.lesson_14

class Chat {
    private val listOfMessages: MutableList<Message> = mutableListOf()
    private val listOfChildMessage: MutableList<ChildMessage> = mutableListOf()

    fun addMessage(message: Message) {
        listOfMessages.add(message)
    }

    fun addThreadMessage(childMessage: ChildMessage) {
        listOfChildMessage.add(childMessage)
    }

    fun printChat() {
        val groupedById = listOfMessages.groupBy { it.id }
        val groupedByParentMessageId = listOfChildMessage.groupBy { it.parentMessageId }

        for ((id, messages) in groupedById) {
            messages.forEach { println("Участник ${it.id}: ${it.textMessage}") }
            for ((parentMessageId, childMessages) in groupedByParentMessageId) {
                if (parentMessageId == id)
                    childMessages.forEach { println("   Участник ${it.id}: ${it.textMessage}") }
            }
        }
    }
}

data class Message(
    val id: Int,
    val textMessage: String,
)

data class ChildMessage(
    val id: Int,
    val textMessage: String,
    val parentMessageId: Int,
)

fun main() {

    val chat1 = Chat()

    val message1 = Message(
        1,
        "Обычное сообщение",
    )

    val message2 = Message(
        2,
        "Сообщение для обсуждения",
    )

    val message3 = Message(
        3,
        "Сообщение для обсуждения",
    )

    val childMessage1 = ChildMessage(
        1,
        "Тред к сообщению для обсуждения участника 2",
        2,
    )

    val childMessage2 = ChildMessage(
        1,
        "Тред к сообщению для обсуждения участника 3",
        3,
    )

    val childMessage3 = ChildMessage(
        2,
        "Тред к сообщению для обсуждения участника 3",
        3,
    )

    chat1.addMessage(message1)
    chat1.addMessage(message2)
    chat1.addMessage(message3)
    chat1.addThreadMessage(childMessage1)
    chat1.addThreadMessage(childMessage2)
    chat1.addThreadMessage(childMessage3)
    chat1.printChat()
}