package com.example.bbb

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class BbbApplication

fun main(args: Array<String>) {
    runApplication<BbbApplication>(*args)
}
