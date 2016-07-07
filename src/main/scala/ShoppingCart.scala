import scala.collection.mutable.ArrayBuffer

/**
  * Created by jaina01 on 07/07/2016.
  */
class ShoppingCart {
  var lineItems = new ArrayBuffer[LineItem]
  var sum = 0
  def AddLineItems(item: LineItem) = {
    lineItems += item
  }

  def TotalNoOffers(): Int = {
    lineItems.map(_.price).sum
  }

}
