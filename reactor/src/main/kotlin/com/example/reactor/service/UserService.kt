package com.example.reactor.service

import com.example.reactor.persistence.repository.UserRepository
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux

@Service
class UserService(
    private val userRepository: UserRepository
) {

    fun queryUsers(): Flux<String> {
        return userRepository.findAll().map {
            "${it.accountId} ${it.name}, ${it.age}"
        }
    }
}