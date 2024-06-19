package com.example.demo

import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.constraints.*


data class TestModel (
    val name: String?,
    val age: Int
)