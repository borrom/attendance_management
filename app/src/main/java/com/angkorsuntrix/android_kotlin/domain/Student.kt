package com.angkorsuntrix.android_kotlin.domain

/**
 * Created by borrom on 1/8/16.
 */
class Student {

    var id: String? = null
    var name: String? = null
    var grade: String? = null

    constructor(id: String, name: String) {
        this.id = id
        this.name = name
    }

    constructor(id: String, name: String, grade: String){
        this.id = id
        this.name = name
        this.grade = grade
    }
}
