package org.example.actionstag

import jakarta.annotation.PostConstruct
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ActionsTagApplication {
    @Value("\${app.version}")
    lateinit var appVersion: String

    @PostConstruct
    fun postConstruct() {
        println("Application version: $appVersion")
    }
}

fun main(args: Array<String>) {
    runApplication<ActionsTagApplication>(*args)
}
