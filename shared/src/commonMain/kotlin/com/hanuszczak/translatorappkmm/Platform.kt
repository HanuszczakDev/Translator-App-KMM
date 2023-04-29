package com.hanuszczak.translatorappkmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform