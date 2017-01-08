/**
  * Created by tinguan on 04/01/17.
  */
class Upper {
  def upper(strings: String*): Seq[String] = {
    strings.map((s:String) => s.toUpperCase())
  }
}

object Running {
  def main(args: Array[String]) {
    val up = new Upper
    Console.println(up.upper("A", "First", "Scala", "Program"))
  }
}

//val up = new Upper
//Console.println(up.upper("A", "First", "Scala", "Program"))
