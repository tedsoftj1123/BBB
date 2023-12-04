package com.example.reactor.presentation

import com.example.reactor.service.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@RestController
class ReactorController(
    private val userService: UserService
) {

    @GetMapping("/mono")
    fun mono(): Mono<String> {
        return Mono.just("!rotcaer olleh")
            .map {
                it.reversed()
            }
    }

    @GetMapping("/flux")
    fun flux(): Flux<String> {
        return Flux.just("hello", "reactor", "!")
    }

    @GetMapping("/users")
    fun queryUsers(): Flux<String> {
        return userService.queryUsers()
    }
}