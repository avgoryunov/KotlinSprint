package org.example.lesson_11

class Room(
    val cover: String,
    val title: String,
    private val listOfAvatar: MutableList<String> = mutableListOf(),
    private val listOfNickName: MutableList<String> = mutableListOf(),
    private val listOfStatus: MutableList<String> = mutableListOf(),
) {

    fun addParticipant(participant: Participant) {
        listOfAvatar.add(participant.avatar)
        listOfNickName.add(participant.nickName)
        listOfStatus.add(participant.status)
    }

    fun setStatusTalk(participant: Participant) {
        participant.status = "Разговаривает"
        listOfStatus[listOfNickName.indexOf(participant.nickName)] = participant.status
    }

    fun setStatusMicrophoneTurnedOff(participant: Participant) {
        participant.status = "Микрофон выключен"
        listOfStatus[listOfNickName.indexOf(participant.nickName)] = participant.status
    }

    fun setStatusUserIsMuted(participant: Participant) {
        participant.status = "Пользователь заглушен"
        listOfStatus[listOfNickName.indexOf(participant.nickName)] = participant.status
    }

    fun outputDataRoom() {
        println("""
        |
        |Карточка комнаты:
        |Обложка: $cover
        |Название: $title
        |Участники: 
    """.trimMargin())

        for (i in 0..<listOfAvatar.size) {
            println("${i+1}. Аватар - ${listOfAvatar[i]}, Псевдоним - ${listOfNickName[i]}, Статус - ${listOfStatus[i]}")
        }
    }
}

class Participant(
    val avatar: String,
    var nickName: String,
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

    room1.setStatusTalk(participant2)
    room1.setStatusMicrophoneTurnedOff(participant3)
    room1.setStatusUserIsMuted(participant1)
    room1.outputDataRoom()
}