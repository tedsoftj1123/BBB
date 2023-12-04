package com.example.websocket

import org.springframework.stereotype.Service
import org.springframework.web.reactive.socket.WebSocketHandler
import org.springframework.web.reactive.socket.WebSocketSession
import reactor.core.publisher.Mono

@Service
class SocketHandler : WebSocketHandler {
    override fun handle(session: WebSocketSession): Mono<Void> {
        val output = session.receive()
            .map {
                session.textMessage(it.payloadAsText)
            }

        return session.send(output)
    }

}