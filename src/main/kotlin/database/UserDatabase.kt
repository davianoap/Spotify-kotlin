package database

import model.UserData

interface UserDatabase {
    //Select * from user_data
    fun findAllUser() : List<UserData>

    //Select * from user_data where username = ?
    fun findUser(username: String) : UserData?

    fun registerUser(data: UserData)

}