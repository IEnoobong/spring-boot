package org.springframework.boot.docs.autoconfigure.kotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

/**
 * Sample using the [org.springframework.boot.autoconfigure.SpringBootApplication]
 *
 * @author Ibanga Enoobong Ime
 */
// tag::customizer[]
@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan @ConfigurationPropertiesScan
class Application

fun main(args: Array<String>) {
	runApplication<Application>(*args)
}
// end::customizer[]
