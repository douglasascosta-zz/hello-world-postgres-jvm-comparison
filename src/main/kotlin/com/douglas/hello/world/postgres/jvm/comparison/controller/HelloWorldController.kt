package com.douglas.hello.world.postgres.jvm.comparison.controller

import com.douglas.hello.world.postgres.jvm.comparison.service.HelloWorldService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/hello-world")
class HelloWorldController(val helloWorldService: HelloWorldService) {

    @GetMapping
    fun helloWorld() = helloWorldService.helloWorld()
}