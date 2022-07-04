import enums.SpotifyMenu
import feature.CredentialFeature
import java.util.*

private val scanner = Scanner(System.`in`)
private lateinit var credentialFeature: CredentialFeature

fun main() {

    setup()
    welcome()
}

fun welcome() {
    println("Selamat Datand di Spotify")
    println("1. Login")
    println("2. Profile")
    print("Pilih menu: ")

    val selectedMenu = scanner.nextLine()

    when (selectedMenu) {
        SpotifyMenu.LOGIN.id -> {
            println(SpotifyMenu.LOGIN.desc)
            credentialFeature.login()
        }
        SpotifyMenu.PROFILE.id -> {
            println(SpotifyMenu.PROFILE.desc)
            credentialFeature.getProfile()
        }
        else -> println("Input Tidak Valid !!")
    }
    welcome()
}

fun setup(){
    credentialFeature = CredentialFeature(scanner)
}