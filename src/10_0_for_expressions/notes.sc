val nums = Seq(1,2,3)

val doubleNums = for (n <- nums) yield n * 2

val names = List("raz", "dva", "tri")

val ucNames = for (n <- names) yield n.capitalize

// ключевое слово yield позволяет создать новую коллекцию внутри for выражения

val underscoreNames = List("_adam", "_david", "_frank")

val capNames = for (name <- underscoreNames) yield {
  val dropped = name.drop(1)
  val capped = dropped.capitalize

  capped
}

val capNames = for (name <- names) yield name.drop(1).capitalize