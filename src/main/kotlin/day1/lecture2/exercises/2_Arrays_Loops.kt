package day1.lecture2.exercises

/**
 * Create an integer array of numbers called "numbers" with 6 cells, that each cell contains the index number multiply 10.
 *
 * Create an empty mutable list for Strings.
 *
 * Write a for loop that loops over the array and adds the string representation of each number to the list.
 *
 */

fun main() {
    //Write your code below this line
    val numbers=Array(6) { i->i*10 }

    //uncomment the next line when you done "numbers" array
    println(numbers.toList())
    val strings= mutableListOf<String>()
    for (num in numbers)
        strings.add(num.toString())
    //uncomment the next line after you made the loop
    println(strings)
}