package com.indeas.kotlinjwt.model

import lombok.Data
import javax.persistence.*

@Entity
@Data
@Table(name = "users")
data class User (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    val fullname: String,
    val email: String,
    var password: String
        )