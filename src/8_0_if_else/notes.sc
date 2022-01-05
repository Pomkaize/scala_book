val a = 4
val b = 5

// if statements always return value!
val minValue = if (a < b) a else b

def doSomething = () => println("doSomething")

// performing side effect "statements"
if (a < b) doSomething()