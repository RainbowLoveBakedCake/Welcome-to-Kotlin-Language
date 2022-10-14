fun main() {
    val ecount: Int = 2
    println("You have $ecount missed calls.")
    val count: Int = 10
    println("You have $count unread messages.")
    
    val unreadCount = 5
    val readCount = 100
    println("You have ${unreadCount + readCount} total messages in your inbox ")
    
    val numberOfPhotos = 100
    val photosDeleted = 10
    println("$numberOfPhotos photos")
    println("$photosDeleted photos deleted")
    println("${numberOfPhotos - photosDeleted} photos left")
    
    var cartTotal = 0
    println("Total: $cartTotal")
    cartTotal = 20
    println("Total: $cartTotal")
    
    var recount = 10
    println("You have $recount unread messages.")
    recount = recount + 1
    println("You have $recount unread messages.")
    
    val trip1: Double = 3.20
    val trip2: Double = 4.10
    val trip3: Double = 1.72
    val totalTripLength: Double = trip1 + trip2 + trip3
    println("$totalTripLength miles left to destination")
    
    val nextMeeting = "Next meeting is:"
    val date = "January 1"
    val reminder = nextMeeting + date
    println(reminder)
    
    val notificationsEnabled: Boolean = false
    println("Are notifications enabled? " + notificationsEnabled)
    
    println("Say \"hello\"")
}