// add readLine method to scope
import scala.io.StdIn.readLine

object Sum extends App {
  println("first number");
  val first: Int = readLine().toInt

  println("second number");
  val second: Int = readLine().toInt

  println("result")

  println(first + second)
}