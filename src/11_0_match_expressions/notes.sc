val i = 8

// math return value
val month = i match {
  case 1 => "Jan"
  case 2 => "Feb"
  case 3 => "Mart"
  case 4 => "Apr"
  case 5 => "May"
  case _ => "Unknown"
}

// match as body of method
def convertBoolToString(value: Boolean) = value match {
  case true => "TRUE"
  case false => "FALSE"
}

convertBoolToString(false)

// case multiple values
def isTrue(a: Any) = a match {
  case 0 | "" => false
  case _ => true
}

// case if expressions
def getCrowd(count: Int) = count match {
  case 1 => println("one")
  case x if 2 to 10 contains x => println("from 2 to 10")
  case x if x > 10 => println("more than 10")
  case _ => println("unknown")
}

getCrowd(4)
