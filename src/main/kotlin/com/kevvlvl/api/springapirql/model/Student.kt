package com.kevvlvl.api.springapirql.model

import javax.persistence.*

@Entity
class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long = 0

    @Column(name = "firstname", nullable = false)
    lateinit var firstName: String

    @Column(name = "lastname", nullable = false)
    lateinit var lastName: String

    @Column(name = "major", nullable = true)
    lateinit var major: String

}