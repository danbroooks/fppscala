package fppscala.recfun

import org.scalatest._
import CountingChange._

class CountingChangeSpec extends FreeSpec with Matchers {
  "Counting Change" - {
    "basic example" in {
      countChange(4, List(1, 2)) should be(3)
    }

    "sorted CHF" in {
      countChange(300, List(5, 10, 20, 50, 100, 200, 500)) should be(1022)
    }

    "no pennies" in {
      countChange(301, List(5, 10, 20, 50, 100, 200, 500)) should be (0)
    }

    "unsorted CHF" in {
      countChange(300, List(500, 5, 50, 100, 20, 200, 10)) should be(1022)
    }

    "should return number of ways you can make change for a given amount (GBP)" in {
      val gbp = List(1, 2, 5, 10, 20, 50, 100, 200)
      countChange(1, gbp) should be(1)
      countChange(2, gbp) should be(2)
      countChange(3, gbp) should be(2)
      countChange(4, gbp) should be(3)
      countChange(5, gbp) should be(4)
      countChange(6, gbp) should be(5)
      countChange(7, gbp) should be(6)
      countChange(8, gbp) should be(7)
      countChange(9, gbp) should be(8)
      countChange(10, gbp) should be(11)
      countChange(200, gbp) should be(73682)
    }
  }
}

