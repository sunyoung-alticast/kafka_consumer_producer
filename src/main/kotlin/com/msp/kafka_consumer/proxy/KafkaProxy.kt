package com.msp.kafka_consumer.proxy

import com.google.gson.GsonBuilder
import mu.KotlinLogging
import org.apache.kafka.clients.producer.internals.Sender
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Service

@Service
class KafkaProxy {

    private val logger = KotlinLogging.logger {}

    //@Value("\${spring.kafka.topic}")
    private val TOPIC:String = "obj-topic"

    @Autowired
    private val kafkaTemplate: KafkaTemplate<String, String>? = null

    fun sendMessage(payload: String) {
        logger.debug("sendMessage() - {}", TOPIC)
        logger.debug("Sending payload - \n{}", payload)
        kafkaTemplate!!.send(TOPIC, payload)
    }

    fun sendMessage(topic: String, payLoad: String){
        logger.debug("sendMessage() - {}", topic)
        logger.debug("Sending payload - \n{}", payLoad)
        kafkaTemplate!!.send(topic, payLoad)
    }

    // HOW TO USE
    // @Autowired
    // lateinit var kafkaProxy: KafkaProxy
    // kafkaProxy.sendMessage(JSONObject(data).toString())

}