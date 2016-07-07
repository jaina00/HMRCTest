import org.scalatest.{BeforeAndAfter, FunSuite}

/**
  * Created by jaina01 on 07/07/2016.
  */
class ShoppingCartTest extends FunSuite with BeforeAndAfter {

  test("Cart can add an item") {
    var cart = new ShoppingCart
    val fruitBasket = List("Apple")
    for (fruit <- fruitBasket) {
      cart.AddLineItems(LineItem(fruit))
    }
    assert(cart.lineItems.size === 1)
  }

  test("Cart can give total cost") {
    var cart = new ShoppingCart
    val fruitBasket = List("Apple", "Apple", "Orange", "Apple")
    for (fruit <- fruitBasket) {
      cart.AddLineItems(LineItem(fruit))
    }
    assert(cart.TotalNoOffers === 205)
  }

}
