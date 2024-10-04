package roadfriend.app.extension

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform