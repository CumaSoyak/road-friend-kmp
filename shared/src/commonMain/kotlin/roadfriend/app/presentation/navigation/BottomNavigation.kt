package roadfriend.app.presentation.navigation

import org.jetbrains.compose.resources.DrawableResource
import road_friend_kmp.shared.generated.resources.Res
import road_friend_kmp.shared.generated.resources.add_filled
import road_friend_kmp.shared.generated.resources.calendar_filled
import road_friend_kmp.shared.generated.resources.calendar_outlined
import road_friend_kmp.shared.generated.resources.home_filled
import road_friend_kmp.shared.generated.resources.home_outlined
import road_friend_kmp.shared.generated.resources.settings_filled
import road_friend_kmp.shared.generated.resources.settings_outlined
import road_friend_kmp.shared.generated.resources.statistics_filled
import road_friend_kmp.shared.generated.resources.statistics_outlined

enum class BottomNav(
    val label: String,
    val selectedIcon: DrawableResource,
    val unselectedIcon: DrawableResource,
    val index: Int,
    val route: Any,
) {
    Home(
        label = "Ara",
        selectedIcon = Res.drawable.home_filled,
        unselectedIcon = Res.drawable.home_outlined,
        route = Destinations.Home,
        index = 0,
    ),
    Calendar(
        label = "Yolculuklar",
        selectedIcon = Res.drawable.calendar_filled,
        unselectedIcon = Res.drawable.calendar_outlined,
        route = Destinations.MyTrips,
        index = 1,
    ),
    AddTask(
        label = "İlan ver",
        selectedIcon = Res.drawable.add_filled,
        unselectedIcon = Res.drawable.add_filled,
        route = Destinations.PostTrip,
        index = 2
    ),
    Statistics(
        label = "Mesajlar",
        selectedIcon = Res.drawable.statistics_filled,
        unselectedIcon = Res.drawable.statistics_outlined,
        route = Destinations.Messages,
        index = 3,
    ),
    Settings(
        label = "Hesap",
        selectedIcon = Res.drawable.settings_filled,
        unselectedIcon = Res.drawable.settings_outlined,
        route = Destinations.Account,
        index = 4,
    ),
}