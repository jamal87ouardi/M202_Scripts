package com.example.m202_coroutines_1

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {

    val job1 = GlobalScope.launch {
        println("Job 1: Started")
        for(i in 1..5) {
            println("job 1 : $i")
            delay(1000L)
        }
        println("Job 1: Finished")
    }


    val job2 = GlobalScope.launch {
        job1.join()
        println("Job 2: Started")
        for(i in 1..3) {
            println("job 2 : $i")
            delay(1000L)
        }

        //job1.cancel()

        println("Job 2: Finished")

    }

    runBlocking {
        delay(10000L)

    }

    println("main finished")

}
