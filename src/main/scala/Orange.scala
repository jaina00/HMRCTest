/**
  * Created by jaina01 on 07/07/2016.
  */
case class Orange(override val name: String = "Orange", override val price: Int = 25,
                  override val buyItems: Int = 3, override val freeItems: Int = 2)
  extends LineItem