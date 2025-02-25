package org.example.lesson_11

class Room(
    val cover: String,
    val title: String,
    private val listOfParticipant: MutableList<Participant> = mutableListOf(),
) {

    fun addParticipant(participant: Participant) {
        listOfParticipant.add(participant)
    }

    fun setStatus(nickName: String, status: String) {
        for (i in listOfParticipant.indices) {
            if (listOfParticipant[i].nickName.indexOf(nickName) == 0) {
                listOfParticipant[i].status = status
                return
            }
        }
    }

    fun outputDataRoom() {
        println("""
            |Карточка комнаты:
            |$cover
            |$title
            |Участники
        """.trimMargin())

        for (i in listOfParticipant.indices) {
            println("${i+1}. ${listOfParticipant[i].avatar}, ${listOfParticipant[i].nickName}, ${listOfParticipant[i].status}")
        }
        println("")
    }
}

data class Participant(
    val avatar: String,
    val nickName: String,
    var status: String,
)

fun main() {

    val room1 = Room(
        cover = "Обложка1",
        title = "Сообщество1",
    )

    val participant1 = Participant(
        avatar = "Фото1",
        nickName = "Участник1",
        status = "Разговаривает",
    )

    val participant2 = Participant(
        avatar = "Фото2",
        nickName = "Участник2",
        status = "Микрофон выключен",
    )

    val participant3 = Participant(
        avatar = "Фото3",
        nickName = "Участник3",
        status = "Пользователь заглушен",
    )

    room1.addParticipant(participant1)
    room1.addParticipant(participant2)
    room1.addParticipant(participant3)
    room1.outputDataRoom()

    room1.setStatus(nickName = "Участник1", status = "Пользователь заглушен")
    room1.setStatus(nickName = "Участник2", status = "Разговаривает")
    room1.setStatus(nickName = "Участник3", status = "Микрофон выключен")
    room1.outputDataRoom()
}