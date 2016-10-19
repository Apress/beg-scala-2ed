def readLines(br: BufferedReader) = {
var ret: List[String] = Nil
def readAll():Unit= br.readLine match {
case null =>
case s => ret ::= s ; readAll()
}
readAll()
ret.reverse
}