package roadfriend.app.uikit

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform