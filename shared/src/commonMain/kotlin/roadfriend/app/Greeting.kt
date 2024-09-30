package roadfriend.app

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "Hello cuma soyak, ${platform.name}!"
    }
}