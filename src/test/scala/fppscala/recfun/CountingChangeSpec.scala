package fppscala.recfun

import org.scalatest._

class CountingChangeSpec extends FreeSpec with Matchers {
  "CountingChange" - {
    "basic example" in {
      CountingChange(4, List(1, 2)) should be(3)
    }

    "sorted CHF" in {
      CountingChange(300, List(5, 10, 20, 50, 100, 200, 500)) should be(1022)
    }

    "no pennies" in {
      CountingChange(301, List(5, 10, 20, 50, 100, 200, 500)) should be (0)
    }

    "unsorted CHF" in {
      CountingChange(300, List(500, 5, 50, 100, 20, 200, 10)) should be(1022)
    }

    "should return number of ways you can make change for a given amount (GBP)" in {
      val gbp = List(1, 2, 5, 10, 20, 50, 100, 200)
      CountingChange(1, gbp) should be(1)
      CountingChange(2, gbp) should be(2)
      CountingChange(3, gbp) should be(2)
      CountingChange(4, gbp) should be(3)
      CountingChange(5, gbp) should be(4)
      CountingChange(6, gbp) should be(5)
      CountingChange(7, gbp) should be(6)
      CountingChange(8, gbp) should be(7)
      CountingChange(9, gbp) should be(8)
      CountingChange(10, gbp) should be(11)
      CountingChange(200, gbp) should be(73682)
    }
  }
}

