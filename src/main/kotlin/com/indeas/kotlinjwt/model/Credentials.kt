package com.indeas.kotlinjwt.model

import lombok.Data

@Data
data class Credentials(
    val email: String,
    val password: String
)