package com.library.system.model

import jakarta.persistence.*
import jakarta.validation.constraints.NotEmpty
import java.time.LocalDate
import java.util.UUID

@Entity
@Table(name = "books")
data class Book(
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    val id: UUID? = null,
    @field:NotEmpty(message = "Book title cannot be empty")
    @Column(nullable = false)
    var title: String,
    @field:NotEmpty(message = "Book author cannot be empty")
    @Column(nullable = false)
    var author: String,
    @Column(nullable = false)
    var available: Boolean = true,
    var borrowedByUserId: UUID? = null,
    var dueDate: LocalDate? = null,
)
