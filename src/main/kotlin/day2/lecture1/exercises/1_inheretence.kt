package day2.lecture1.exercises

/**
 * Create a class, Book, with a title and an author.
 * Add a method, readPage(), that increases the value of a private variable, currentPage, by 1.
 *
 * Create a subclass of Book; name it eBook.
 * eBook also takes in a format, which defaults to "text".
 * In eBooks, counting words makes more sense than pages.
 * Override the readPage() method to increase the word count by 250, (the average number of words per page from typewriter days).
 */

//Modify the code below this line

//class Book
open class Book(val title: String,val author: String)
{
    private var currentPage=1;
    open fun readPage() { currentPage++; }
}
//class eBook
class EBook(title: String,author: String,val format: String="text"): Book(title,author)
{
    private var words=1;
    override fun readPage() { words+=250; }
}

