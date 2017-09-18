package net.zoneland.kotlin.action

import net.zoneland.kotlin.repository.Student
import net.zoneland.kotlin.repository.StudentRepository
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/students")
class StudentController(val repository: StudentRepository) {


    @GetMapping
    fun findAll() = repository.findAll()

    @PostMapping
    fun addStudent(@RequestBody student:Student) = repository.save(student)

    @PutMapping("/{id}")
    fun updateStudent(@PathVariable id: Long, @RequestBody student: Student) {
        assert(id == student.id)
        repository.save(student)
    }

    @GetMapping("/name/{name}")
    fun findByName(@PathVariable name:String) = repository.findByName(name)

    @GetMapping("/{id}")
    fun findOne(@PathVariable id: Long) = repository.findOne(id)

    @DeleteMapping("/{id}")
    fun deleteById(@PathVariable id: Long) = repository.delete(id)


}