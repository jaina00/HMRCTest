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

  def TotalWithOffers(): Int = {
    val groupItems = lineItems.groupBy(identity).mapValues(_.size)
    groupItems.foreach(x => {
      sum += ((x._2 / x._1.buyItems * x._1.freeItems) + x._2 % x._1.buyItems) * x._1.price
    })
    sum
  }

}
