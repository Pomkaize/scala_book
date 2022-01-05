val nums = Seq(1,2,3,4)

for (n <- nums) println(n)

val people = List("Ivan", "Ignat", "Ibrashka", "Leha")

people.foreach(println)

val map = Map("keyOne" -> 1, "keTwo" -> 2, "keyThree" -> 3)

for ((key, value) <- map) println(s"${key} ${value}")


map.foreach {
  // hueta v scale
  // https://stackoverflow.com/questions/19478244/how-does-a-case-anonymous-function-really-work-in-scala
  case(key, value) => println(s"${key} ${value}")
}