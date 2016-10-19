trait Container{
type A <: Number
def value: A
}
object AnyNumber extends Container {
def value = 2
}