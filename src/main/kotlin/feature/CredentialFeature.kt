package feature

import model.UserData
import service.CredentialService
import service.CredentialServiceImpl
import java.util.*

class CredentialFeature(private val scanner: Scanner) {

    private val credentialService: CredentialService = CredentialServiceImpl()
    fun login(){
        println("Username: ")
        val inputUsername = scanner.nextLine()
        println("Password: ")
        val inputPassword = scanner.nextLine()

        val loggedInUser = credentialService.doLogin(inputUsername, inputPassword)?.let {
            printUserData(it)
        }
    }

    fun getProfile(){
        credentialService.getLoggedInUser()?.let {
            printUserData(it)
        } ?: print("anda belum login")
    }

    private fun printUserData(userData: UserData) {
        println("Username : ${userData.username}")
        println("Nama : ${userData.name}")
        println("Address: ${userData.address}")
    }
}