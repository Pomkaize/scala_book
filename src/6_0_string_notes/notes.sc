val firstName = "Ivan"
val secondName = "Ivanov"
val char = 'H'

val name = firstName + " " + secondName + " " + char

val name2 = s"$firstName $secondName $char"
val name3 = s"${firstName} ${secondName} ${char}"

val multiline =
  """
    | test test test test
    | test test test test
    | test test test test
    |""".stripMargin

val str = f"$firstName $secondName"