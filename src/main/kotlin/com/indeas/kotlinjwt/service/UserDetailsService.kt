package com.indeas.kotlinjwt.service

import com.indeas.kotlinjwt.reposiroty.UserRepository
import com.indeas.kotlinjwt.security.UserDetailsImpl
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.stereotype.Service

@Service
class UserDetailsService {

    @Autowired
    private lateinit var userRepository: UserRepository


    fun loadUserByUsername(email: String?): UserDetails {
        val user = userRepository.findByEmail(email) ?: throw UsernameNotFoundException(email)

        return UserDetailsImpl(user)
    }
}