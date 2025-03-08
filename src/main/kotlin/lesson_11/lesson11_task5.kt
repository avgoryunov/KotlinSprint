package org.example.lesson_11

data class Forum(
    val userList: MutableList<MemberOfTheForum> = mutableListOf(),
    var user: MutableList<MemberOfTheForum> = mutableListOf(),
    var userMessage: MutableList<ForumMessage> = mutableListOf(),

    ) {

    fun createNewUser(memberOfTheForum: MemberOfTheForum) {
        user.clear()
        user.add(memberOfTheForum)
        memberOfTheForum.userId = userList.size + 1
        userList.add(memberOfTheForum)
    }

    fun createNewMessage(forumMessage: ForumMessage) {
        val id: MutableList<String> = mutableListOf()
        for (i in userList.indices) id.add(userList[i].userId.toString())
        if (id.contains(forumMessage.authorId.toString())) {
            userMessage.add(forumMessage)
            printThread(forumMessage)
        }
        else println("Для отправки сообщений необходимо зарегистрироваться")
    }

    private fun printThread(forumMessage: ForumMessage) {
        println("Автор ${forumMessage.authorId}: ${forumMessage.message}")
    }
}

data class MemberOfTheForum(
    var userId: Int,
    val userName: String,
)

class MemberOfTheForumBuilder {
    private var userId: Int = 0
    private var userName: String = "User"

    fun setUserName(userName: String) = apply { this.userName = userName }

    fun build():MemberOfTheForum {
        return MemberOfTheForum(userId, userName)
    }
}

data class ForumMessage(
    var authorId: Int,
    var message: String,
)

class ForumMessageBuilder {
    private var authorId: Int = 0
    private var message: String = "Message"

    fun setAuthorId(authorId: Int) = apply { this.authorId = authorId }
    fun setMessage(message: String) = apply { this.message = message }

    fun build():ForumMessage {
        return ForumMessage(authorId, message)
    }
}

fun main() {

    val memberOfTheForum1 = MemberOfTheForumBuilder()
        .setUserName("User1")
        .build()

    val memberOfTheForum2 = MemberOfTheForumBuilder()
        .setUserName("User2")
        .build()

    val forumMessage1 = ForumMessageBuilder()
        .setAuthorId(1)
        .setMessage("Сообщение пользователя 1")
        .build()

    val forumMessage2 = ForumMessageBuilder()
        .setAuthorId(2)
        .setMessage("Сообщение пользователя 2")
        .build()

    val forumMessage3 = ForumMessageBuilder()
        .setAuthorId(1)
        .setMessage("Новое сообщение пользователя 1")
        .build()

    val forumMessage4 = ForumMessageBuilder()
        .setAuthorId(2)
        .setMessage("Новое сообщение пользователя 2")
        .build()

    val forumMessage5 = ForumMessageBuilder()
        .setAuthorId(3)
        .setMessage("Сообщение пользователя 3")
        .build()

    val forum1 = Forum()

    forum1.createNewUser(memberOfTheForum1)
    forum1.createNewUser(memberOfTheForum2)

    forum1.createNewMessage(forumMessage1)
    forum1.createNewMessage(forumMessage2)
    forum1.createNewMessage(forumMessage3)
    forum1.createNewMessage(forumMessage4)
    forum1.createNewMessage(forumMessage5)
}