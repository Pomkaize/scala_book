// in scala like in java all methods are defined inside classes

object MethodExamples {
  // name and signature on the left side of the =
  // body of the function on the right side
  def double(a: Int): Int = a * 2

  // multiline methods
  def addThenDouble(a: Int, b: Int): Unit = {
    val sum = a + b
    val doubled = sum * 2
    doubled
  }
}

MethodExamples.addThenDouble(1, 10)