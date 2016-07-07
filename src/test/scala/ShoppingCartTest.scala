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

  test("Cart can give total cost including offers") {
    var cart = new ShoppingCart
    val fruitBasket = List("Apple", "Apple", "Orange", "Orange", "Orange")
    for (fruit <- fruitBasket) {
      var f = LineItem(fruit)
      cart.AddLineItems(f)
    }
    assert(cart.TotalWithOffers === 110)
  }

  test("Cart can giving discounts on offer but charging for extra items") {
    var cart = new ShoppingCart
    val fruitBasket = List("Apple", "Apple", "Apple", "Orange", "Orange", "Orange", "Orange", "Orange")
    for (fruit <- fruitBasket) {
      cart.AddLineItems(LineItem(fruit))
    }
    assert(cart.TotalWithOffers === 220)
  }
}
