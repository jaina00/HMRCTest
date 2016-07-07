/**
  * Created by jaina01 on 07/07/2016.
  */
trait LineItem {
  val name = ""
  val price = 0
  val buyItems = 0
  val freeItems = 0
}

object LineItem {
  def apply(s: String): LineItem = {
    if (s == "Apple") return new Apple
    else return new Orange
  }
}


