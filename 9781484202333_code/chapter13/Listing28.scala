type Strategy = (Int, Int) => Int
class Context(operation: Strategy) {
def execute(a: Int, b: Int) { operation(a, b) }
}
val add: Strategy = _ + _
val multiply: Strategy = _ * _
new Context(multiply).execute(5, 5)