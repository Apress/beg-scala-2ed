class Book (var title :String, var ISBN: Int) {
def this(title: String) {
this(title, 2222)
}
def this() {
this("Beginning Erlang")
this.ISBN = 1111
}
override def toString = s"$title ISBN- $ISBN"
}