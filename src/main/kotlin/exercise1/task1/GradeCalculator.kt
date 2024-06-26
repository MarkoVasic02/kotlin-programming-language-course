package org.jetbrains.exercise1.task1

import java.util.Scanner

/**
 * Task 1: Grade Calculator
 *
 * Write a Kotlin program that calculates the grade for a student based on their score according to the provided grading rules.
 * The grading rules are as follows:
 *
 * - Grade 10: 91-100 points
 * - Grade 9: 81-90 points
 * - Grade 8: 71-80 points
 * - Grade 7: 61-70 points
 * - Grade 6: 51-60 points
 *
 * The program should prompt the user to enter the student's score as an Integer.
 * Then, it should use `if` or `when` statements
 * to determine the corresponding grade based on the score and print the grade to the console.
 *
 * Additionally, the program should handle invalid inputs. If the user enters a score not in the range of 0 to 100,
 * the program should print an error message and prompt the user to enter a valid score.
 *
 * Example Output:
 *
 * ```
 * Enter student score: 93
 * Grade: 10
 * ```
 *
 * ```
 * Enter student score: 79
 * Grade: 8
 * ```
 *
 * ```
 * Enter student score: 105
 * Invalid score. Please enter a score between 0 and 100.
 * ```
 */

internal fun calculateGrade(score: Int): Int {
    val result = when (score) {
        in 51..60 -> 6
        in 61..70 -> 7
        in 71..80 -> 8
        in 81..90 -> 9
        in 91..100 -> 10
        else -> throw IllegalArgumentException()
    }

    return result
}

fun main() {
    var score: Int
    do {
        print("Enter student score: ")
        val scanner = Scanner(System.`in`)
        score = scanner.nextInt()
    } while (score < 0 || score > 100)

    println()

    calculateGrade(score)
}
