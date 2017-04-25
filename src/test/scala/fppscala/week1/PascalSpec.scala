package fppscala.week1

import org.scalatest._

class PascalSpec extends FreeSpec with Matchers {
  "Pascal's triangle" - {
    "first row" in {
      Pascal(0, 0) should be(1)
    }

    "second row" in {
      Pascal(0, 1) should be(1)
      Pascal(1, 1) should be(1)
    }

    "third row" in {
      Pascal(0, 2) should be(1)
      Pascal(1, 2) should be(2)
      Pascal(2, 2) should be(1)
    }

    "fourth row" in {
      Pascal(0, 3) should be(1)
      Pascal(1, 3) should be(3)
      Pascal(2, 3) should be(3)
      Pascal(3, 3) should be(1)
    }

    "fifth row" in {
      Pascal(0, 4) should be(1)
      Pascal(1, 4) should be(4)
      Pascal(2, 4) should be(6)
      Pascal(3, 4) should be(4)
      Pascal(4, 4) should be(1)
    }

    "sixth row" in {
      Pascal(0, 5) should be(1)
      Pascal(1, 5) should be(5)
      Pascal(2, 5) should be(10)
      Pascal(3, 5) should be(10)
      Pascal(4, 5) should be(5)
      Pascal(5, 5) should be(1)
    }

    "seventh row" in {
      Pascal(0, 6) should be(1)
      Pascal(1, 6) should be(6)
      Pascal(2, 6) should be(15)
      Pascal(3, 6) should be(20)
      Pascal(4, 6) should be(15)
      Pascal(5, 6) should be(6)
      Pascal(6, 6) should be(1)
    }

    "eighth row" in {
      Pascal(0, 7) should be(1)
      Pascal(1, 7) should be(7)
      Pascal(2, 7) should be(21)
      Pascal(3, 7) should be(35)
      Pascal(4, 7) should be(35)
      Pascal(5, 7) should be(21)
      Pascal(6, 7) should be(7)
      Pascal(7, 7) should be(1)
    }

    "nineth row" in {
      Pascal(0, 8) should be(1)
      Pascal(1, 8) should be(8)
      Pascal(2, 8) should be(28)
      Pascal(3, 8) should be(56)
      Pascal(4, 8) should be(70)
      Pascal(5, 8) should be(56)
      Pascal(6, 8) should be(28)
      Pascal(7, 8) should be(8)
      Pascal(8, 8) should be(1)
    }

    "tenth row" in {
      Pascal(0, 9) should be(1)
      Pascal(1, 9) should be(9)
      Pascal(2, 9) should be(36)
      Pascal(3, 9) should be(84)
      Pascal(4, 9) should be(126)
      Pascal(5, 9) should be(126)
      Pascal(6, 9) should be(84)
      Pascal(7, 9) should be(36)
      Pascal(8, 9) should be(9)
      Pascal(9, 9) should be(1)
    }
  }
}
