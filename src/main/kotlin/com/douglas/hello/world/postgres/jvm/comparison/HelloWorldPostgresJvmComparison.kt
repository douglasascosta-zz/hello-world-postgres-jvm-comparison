package com.douglas.hello.world.postgres.jvm.comparison

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HelloWorldPostgresKotlinSpringBootApplication

fun main(args: Array<String>) {
    runApplication<HelloWorldPostgresKotlinSpringBootApplication>(*args)
}
