package com.example.reactor.persistence.repository

import com.example.reactor.persistence.User
import org.springframework.data.repository.reactive.ReactiveCrudRepository

interface UserRepository : ReactiveCrudRepository<User, Int> {
}