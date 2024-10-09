package roadfriend.app.core

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform