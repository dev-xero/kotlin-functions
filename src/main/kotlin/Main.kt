fun main(args: Array<String>) {
  logMessage("Hello World")
  logMessage("This is a function")
  showDetails("The Code Ninja", 15)
  returnMax(16, 15)
  sendMessage("SugoiAnimeAdmin", "This is awesome")
  sendMessage(message = "This is a custom message")
}

fun logMessage(msg: String): Unit {
  println(msg)
}

fun showDetails(name: String, age: Int): Unit {
  println("Hello, $name! You're currently $age years old!")
}

fun returnMax(a: Int, b: Int): Unit {
  if (a > b)
    println("$a is obviously greater than $b") // Notice we can skip parens
  else if(a == b)
    println("$a is equal in magnitude to $b")
  else
    println("$b is definitely larger than $a")
}

fun sendMessage(userName: String = "User", message: String = "your default message"): Unit {
  println("Hello, $userName: $message")
}