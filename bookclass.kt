class Book(var title:String="Unknown",var author:String="Anonymous",var yearPublished:String="Current year")
{

}
fun main()
{
    var myBook=Book()
    println(myBook.title)
    println(myBook.author)
    print(myBook.yearPublished)
    println("\n")
    var customBook=Book("Power","Robert Greene","1996")
    println(customBook.title)
    println(customBook.author)
    println(customBook.yearPublished)
}