package org.example.lesson_11

class Room(
    val cover: String,
    val title: String,
    private val listOfParticipant: MutableList<Any> = mutableListOf(),
    ) {

    fun addParticipant(participant: Participant) {
        listOfParticipant.add(participant.listOfProperties)
    }

    fun setStatusTalk(participant: Participant) {
        participant.status = "Разговаривает"
        participant.listOfProperties[2] = participant.status
        listOfParticipant[listOfParticipant.indexOf(participant.listOfProperties)]
    }

    fun setStatusMicrophoneTurnedOff(participant: Participant) {
        participant.status = "Микрофон выключен"
        participant.listOfProperties[2] = participant.status
        listOfParticipant[listOfParticipant.indexOf(participant.listOfProperties)]
    }

    fun setStatusUserIsMuted(participant: Participant) {
        participant.status = "Пользователь заглушен"
        participant.listOfProperties[2] = participant.status
        listOfParticipant[listOfParticipant.indexOf(participant.listOfProperties)]
    }

    fun outputDataRoom() {
        println(
            """
        |
        |Карточка комнаты:
        |Обложка: $cover
        |Название: $title
        |Участники: 
    """.trimMargin()
        )

        for (i in listOfParticipant.indices) {
            println("${i+1}. ${listOfParticipant[i]}")
        }
    }
}

class Participant(
    val avatar: String,
    val nickName: String,
    var status: String,
    var listOfProperties: MutableList<String> = mutableListOf(avatar, nickName, status)
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

    room1.setStatusTalk(participant2)
    room1.setStatusMicrophoneTurnedOff(participant3)
    room1.setStatusUserIsMuted(participant1)
    room1.outputDataRoom()
}