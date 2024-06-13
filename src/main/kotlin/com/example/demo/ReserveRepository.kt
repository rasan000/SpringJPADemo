package com.example.demo

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository

interface ReserveRepository: JpaRepository<ReserveModel, Long> {
    override fun findAll(): List<ReserveModel>
}