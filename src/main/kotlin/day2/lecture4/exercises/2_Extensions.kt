package day2.lecture4.exercises

import kotlin.random.Random

/**
 * It can be useful to know the weight of a book, for example, for shipping.
 * The weight of a book can change because sometimes pages get torn, and the page count changes.
 * While calculating the weight could be defined as a method, it’s more like a helper function.
 * Besides, it would hurt a book's feelings to have a method that tears up its pages.
 *
 *
 * 1. Add a mutable property [pages] to [Book].
 * 2. Create an extension function on [Book] that returns the weight of a book as the page count multiplied by 1.5 grams.
 * 3. Create another extension, [tornPages], that takes the number of torn pages as an argument and changes the page count of the book.
 * 4. Write a class [Puppy] with a method [playWithBook] that takes a book as an argument, and removes a random number of pages from the book.
 * 5. Create a puppy and give it a book to play with, until there are no more pages.
 *
 * Note: If you don’t want to give your puppy a book, then create a puzzle toy class and fill it with treats.
 */
fun Book.weight()=pages*1.5
fun Book.tornPages(numTorn: Int)
{
    when
    {
        numTorn<=0 -> throw IllegalArgumentException("Number of torn pages must be positive!")
        numTorn>pages -> pages=0
        else -> pages-=numTorn
    }
}

class Puppy
{
    companion object { const val MAX_TORN=50; }
    fun playWithBook(book: Book) { book.tornPages(Random.nextInt(MAX_TORN)+1) }
}

fun main() {
    //Write your code below this line
    val book=Book("IT","King",1986,1500)
    val puppy=Puppy()
    while (book.pages>0)
    {
        puppy.playWithBook(book)
        println("Now my book has only ${book.pages} pages...")
    }
}