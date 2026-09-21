package org.ies.tierno.colections

data class Student(
    val name: String,
    val surname: String,
    val email: String,
    val zipCode: Int
)

fun mapToEmails(students: List<Student>) = students.map { it.email }

fun main() {
    val students = listOf(
        Student("Ana", "García", "ana.garcia@example.com", 28001),
        Student("Carlos", "López", "carlos.lopez@example.com", 28002),
        Student("Lucía", "Martín", "lucia.martin@example.com", 28003)
    )

    val emails = mapToEmails(students)

    emails.forEach { println(it) }
}