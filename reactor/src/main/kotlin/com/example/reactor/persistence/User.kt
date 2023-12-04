package com.example.reactor.persistence

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("tbl_user")
data class User(
    @Id
    val id: Int,

    val accountId: String,

    val name: String,

    val age: Int
)
