package com.douglas.hello.world.postgres.jvm.comparison.service

import com.douglas.hello.world.postgres.jvm.comparison.model.HelloWorld
import com.douglas.hello.world.postgres.jvm.comparison.repository.HelloWorldRepository
import org.springframework.stereotype.Service

@Service
class HelloWorldService(val helloWorldRepository: HelloWorldRepository) {

    fun helloWorld() = HelloWorld(helloWorldRepository.findNow())
}