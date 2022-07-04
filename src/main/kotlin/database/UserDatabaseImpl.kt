package database

import jdk.jshell.spi.ExecutionControl.StoppedException
import model.UserData

class UserDatabaseImpl : UserDatabase {

    private val userList = mutableListOf(
        UserData(1, "daviano", "davianoap", "prat", "semarang" ),
        UserData(2, "rudy", "rada", "rede", "solo"),
        UserData(3, "dodo", "dodi", "dada", "banjar"),
    )

    override fun findAllUser(): List<UserData> = userList

    override fun findUser(username: String): UserData? =userList.find {
        it.username.equals(username,true)
    }

    override fun registerUser(data: UserData) {
        userList.add(data)
    }
}