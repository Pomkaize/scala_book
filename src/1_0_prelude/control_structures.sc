val test1 = true;

val doSomething = () => {}

// if else
if (test1) {
  doSomething()
} else {
  println("123")
}

val a = 1;
val b = 5

// ternary operator
val x = if (a < b) a else b

// match expression
val i = 0;

val result = i match {
  case 1 => "one"
  case 2 => "two"
  case _ => "Unknown"
}

// try catch
try {
  doSomething()
} catch {
  case runtime: RuntimeException => println(runtime)
  case other: Exception => println(other)
}

// for operator
val items = List(1,2,3)

for (item <- items) {
  println(item)
}

for (i <- 3 to 5) {
  println(i)
}

for (i <-0 to 10 by 2) {
  println(i)
}

// yield when need return value from iteration
val x = for (i <- 1 to 5) yield i * 2

val fruits = List("apple", "banana")

for {
  fruit <- fruits
  if fruit.length > 5
} yield fruit

// while
// while loop
while(test1) {
  doSomething()
}