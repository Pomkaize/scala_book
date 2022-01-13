class Socket(val timeout: Int = 2000, var linger: Int = 3000) {
  override def toString: String = s"timeout $timeout linger $linger"
}

new Socket()
new Socket(3000)
new Socket(1000, 4000)

// named constructor parameters, handy with list of one type parameters
new Socket(timeout = 3000, linger = 4000)