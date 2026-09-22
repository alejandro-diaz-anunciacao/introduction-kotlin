package org.ies.tierno.colections

fun filterByZipCode(students: List<Student>, zipCode: Int): List<Student> = students.filter { it.zipCode == zipCode }

fun main() {
    val students = listOf(
        Student("Ana", "García", "ana.garcia@example.com", 28001),
        Student("Carlos", "López", "carlos.lopez@example.com", 28002),
        Student("Lucía", "Martín", "lucia.martin@example.com", 28001)
    )

    val studentsByZipCode = filterByZipCode(students, 28001)

    studentsByZipCode.forEach { println(it) }
}