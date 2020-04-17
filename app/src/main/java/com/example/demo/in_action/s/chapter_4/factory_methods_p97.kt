package com.example.demo.in_action.s.chapter_4

/*
interface User {
    val email: String
    val nickname: String
    get() = email.substringBefore('@')
}
*/
/*class User private constructor(val nickname: String) {
    companion object {
        fun newSubscribingUser(email: String) =
            User(email.substringBefore('@'))

        fun newFacebookName(account: Int) =
            User(getFacebookName(accountId))
    }
}*/
/*
class SubscribingUser(val email: String) : User {
    val nickname: String
    get() = email.substringBefore('@')
}

class FacebookUser(val accountId: Int) : User {
    override val nickname = getFacebookName(accountId)
}
*/
/*
fun main() {
    val subscribingUser = User.newSubscribingUser("bob@gmail.com")
    val facebookUser = User.newFacebookUser(4)
    println(subscribingUser.nickname)
}*/
