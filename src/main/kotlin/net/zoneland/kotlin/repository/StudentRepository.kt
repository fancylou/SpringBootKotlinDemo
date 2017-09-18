package net.zoneland.kotlin.repository

import org.springframework.data.repository.CrudRepository


interface StudentRepository : CrudRepository<Student, Long> {

    fun findByName(name: String): List<Student>
}