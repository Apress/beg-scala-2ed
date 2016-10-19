object Helper {
implicit class Greeting(val x: Int) {
def greet= "Hello " * x
}
}