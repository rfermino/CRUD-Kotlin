package br.com.hurg.Lumus

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LumusApplication

fun main(args: Array<String>) {
	runApplication<LumusApplication>(*args)
}
