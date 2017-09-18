package net.zoneland.kotlin

import net.zoneland.kotlin.repository.Student
import net.zoneland.kotlin.repository.StudentRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean


@SpringBootApplication
open class SpringKotlinApplication {

    @Bean
    open fun init(repository: StudentRepository) = CommandLineRunner {
        repository.save(Student("Fancy","man"))
        repository.save(Student("Lily","women"))
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(SpringKotlinApplication::class.java, *args)
}