package day1.lecture2.exercises

/**
 * Create two ranges
 *      numbers between 1 - 20
 *      letters between 'a' - 'q'
 *
 * Check if a number lies within a range.
 * Check if a letter lies within a range.
 *
 * Iterate over the ranges you created earlier and print the results
 *      extra: with jumps of 2
 *      extra: backwards
 */
fun main() {
    //Write your code below this line

    //Create the ranges below this line
    val numrange=1..4
    val strrange='a'..'q'
    //Use the ranges with an if statement below this line

    //Iterate over the ranges below this line
    for (num in numrange) print(num)
    for (str in strrange) print(str)
    for (num in numrange step 2) print(num)
    for (str in strrange.reversed()) print(str)
}