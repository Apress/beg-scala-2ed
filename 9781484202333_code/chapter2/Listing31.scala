var scalabooks = for{
book <-books
if book.contains("Scala")
}yield book