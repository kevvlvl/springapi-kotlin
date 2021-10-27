package com.kevvlvl.api.springapirql.controller

import com.kevvlvl.api.springapirql.model.Student
import com.kevvlvl.api.springapirql.repository.StudentRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/student")
class StudentController @Autowired constructor(private var studentRepository: StudentRepository) {

    @GetMapping("/{id}")
    fun getStudentById(@PathVariable id: Long): Mono<Student> {

        return Mono.just(studentRepository.findById(id).get())
    }

    @GetMapping("/all")
    fun getStudents(): Flux<List<Student>> {
        return Flux.just(studentRepository.findAllByOrderByLastNameAsc())
    }
}