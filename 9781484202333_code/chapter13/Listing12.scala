def read2(in: java.io.BufferedReader): List[String] = {
def doRead(acc: List[String]):List[String] = in.readLine match{
case null=> acc
case s => doRead(s :: acc)
}
doRead(Nil).reverse
}