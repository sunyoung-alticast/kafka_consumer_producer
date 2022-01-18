package com.msp.kafka_consumer.receiver

import mu.KotlinLogging
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

@Component
class KotlinConsumer {
    private val logger = KotlinLogging.logger {}
    @KafkaListener(topics = ["obj-topic"], groupId = "object")

    fun processMessage(message: String) {
        logger.info("got message: {}", message)
    }
}