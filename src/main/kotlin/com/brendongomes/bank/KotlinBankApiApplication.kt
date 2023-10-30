package com.brendongomes.bank

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinBankApiApplication

fun main(args: Array<String>) {
	runApplication<KotlinBankApiApplication>(*args)
}
