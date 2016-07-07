/**
  * Created by jaina01 on 07/07/2016.
  */
case class Apple(override val name: String = "Apple", override val price: Int = 60,
                 override val buyItems: Int = 2, override val freeItems: Int = 1)
  extends LineItem