package com.douglas.helloworldpostgreskotlinspringboot.service

import com.douglas.helloworldpostgreskotlinspringboot.model.HelloWorld
import com.douglas.helloworldpostgreskotlinspringboot.repository.HelloWorldRepository
import org.springframework.stereotype.Service

@Service
class HelloWorldService(val helloWorldRepository: HelloWorldRepository) {

    fun helloWorld() = HelloWorld(helloWorldRepository.findNow())
}