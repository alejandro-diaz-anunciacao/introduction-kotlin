package org.ies.tierno.gemini.coleccionesYLambdas

data class Alumno(val nombre: String, val nota: Int)

fun aprobados(alumnos: List<Alumno>): List<String> = alumnos
    .filter { it.nota >= 5 }
    .map { it.nombre }

fun main() {
    val alumnos = listOf<Alumno>(
        Alumno("Alberto", 4),
        Alumno("Lucía", 6),
        Alumno("Ángela", 8),
        Alumno("Marcos", 2),
        Alumno("Raúl", 10),
    )

    println(aprobados(alumnos))

}