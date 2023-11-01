package com.example.m202_coroutines_1

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking



fun main() {

    runBlocking {
        delay(10000L)
        println("Données reçues")
    }

    println("ok")

}