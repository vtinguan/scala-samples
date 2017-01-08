/**
  * Created by tinguan on 04/01/17.
  */
object UpperNew {
    def upper(strings: String*) = strings.map(_.toUpperCase)
}

object Run {
  def main(args: Array[String]) {
    println(UpperNew.upper("A", "First", "Scala", "Program"))
  }
}
