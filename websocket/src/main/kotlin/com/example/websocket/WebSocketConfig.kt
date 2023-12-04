package com.example.websocket

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.HandlerMapping
import org.springframework.web.reactive.handler.SimpleUrlHandlerMapping
import org.springframework.web.reactive.socket.WebSocketHandler
import org.springframework.web.reactive.socket.server.support.WebSocketHandlerAdapter


@Configuration
class WebSocketConfig(
    private val webSocketHandler: WebSocketHandler
) {

    @Bean
    fun handlerMapping(): HandlerMapping {
        val map: MutableMap<String, WebSocketHandler?> = HashMap()
        map["/event-emitter"] = webSocketHandler

        val handlerMapping = SimpleUrlHandlerMapping()
        handlerMapping.order = 1
        handlerMapping.urlMap = map
        return handlerMapping
    }

    @Bean
    fun handlerAdapter() =  WebSocketHandlerAdapter()
}