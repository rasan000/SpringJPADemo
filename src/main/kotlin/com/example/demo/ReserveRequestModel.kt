package com.example.demo

import jakarta.persistence.*
import java.sql.Time
import java.util.*

@Entity
@Table(name = "reserve")
data class ReserveRequestModel (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id:Long,
    @Column(name = "departure_date")
    var departureDate: Date,
    @Column(name = "departure_time")
    var departureTime: String
)