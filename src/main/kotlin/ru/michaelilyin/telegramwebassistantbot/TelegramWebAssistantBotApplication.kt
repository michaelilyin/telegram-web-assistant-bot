package ru.michaelilyin.telegramwebassistantbot

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class TelegramWebAssistantBotApplication

fun main(args: Array<String>) {
    SpringApplication.run(TelegramWebAssistantBotApplication::class.java, *args)
}
