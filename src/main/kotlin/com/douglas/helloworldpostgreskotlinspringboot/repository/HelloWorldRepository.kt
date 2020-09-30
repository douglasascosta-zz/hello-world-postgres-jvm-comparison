package com.douglas.helloworldpostgreskotlinspringboot.repository

import org.springframework.stereotype.Component
import java.sql.Timestamp
import javax.persistence.EntityManager

@Component
class HelloWorldRepository(val entityManager: EntityManager) {

    fun findNow() = entityManager.createNativeQuery("SELECT now()")
            .singleResult as Timestamp
}