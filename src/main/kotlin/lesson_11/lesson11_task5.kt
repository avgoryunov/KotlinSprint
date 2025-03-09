package org.example.lesson_11

data class Forum(
    val userList: MutableList<MemberOfTheForum> = mutableListOf(),
    val userMessage: MutableList<ForumMessage> = mutableListOf(),
) {

    fun createNewUser(memberOfTheForum: MemberOfTheForum) {
        memberOfTheForum.userId = userList.size + 1
        userList.add(memberOfTheForum)
    }

    fun createNewMessage(forumMessage: ForumMessage) {
        for (i in userList.indices) {
            if (userList[i].userId == forumMessage.authorId) {
                userMessage.add(forumMessage)
                printThread(forumMessage)
                return
            }
        }
        println("Для отправки сообщений необходимо зарегистрироваться")
    }

    private fun printThread(forumMessage: ForumMessage) {
        println("Автор ${forumMessage.authorId}: ${forumMessage.message}")
    }
}

data class MemberOfTheForum(
    var userId: Int = 0,
    val userName: String,
)

data class ForumMessage(
    var authorId: Int,
    var message: String,
)

fun main() {

    val memberOfTheForum1 = MemberOfTheForum(userName = "User1")
    val memberOfTheForum2 = MemberOfTheForum(userName = "User2")

    val forumMessage1 = ForumMessage(authorId = 1, message = "Сообщение пользователя 1")
    val forumMessage2 = ForumMessage(authorId = 2, message = "Сообщение пользователя 2")
    val forumMessage3 = ForumMessage(authorId = 1, message = "Новое сообщение пользователя 1")
    val forumMessage4 = ForumMessage(authorId = 2, message = "Новое сообщение пользователя 2")
    val forumMessage5 = ForumMessage(authorId = 3, message = "Сообщение пользователя 3")

    val forum1 = Forum()

    forum1.createNewUser(memberOfTheForum1)
    forum1.createNewUser(memberOfTheForum2)

    forum1.createNewMessage(forumMessage1)
    forum1.createNewMessage(forumMessage2)
    forum1.createNewMessage(forumMessage3)
    forum1.createNewMessage(forumMessage4)
    forum1.createNewMessage(forumMessage5)
}