package com.kevvlvl.api.springapirql.repository

import com.kevvlvl.api.springapirql.model.Student
import org.springframework.data.repository.CrudRepository

interface StudentRepository: CrudRepository<Student, Long> {

    fun findAllByOrderByLastNameAsc(): List<Student>

}