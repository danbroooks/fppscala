package fppscala.recfun

import org.scalatest._
import PascalsTriangle._

class PascalsTriangleSpec extends FreeSpec with Matchers {

  "Pascal's Triangle" - {
    "first row" in {
      pascal(0, 0) should be(1)
    }

    "second row" in {
      pascal(0, 1) should be(1)
      pascal(1, 1) should be(1)
    }

    "third row" in {
      pascal(0, 2) should be(1)
      pascal(1, 2) should be(2)
      pascal(2, 2) should be(1)
    }

    "fourth row" in {
      pascal(0, 3) should be(1)
      pascal(1, 3) should be(3)
      pascal(2, 3) should be(3)
      pascal(3, 3) should be(1)
    }

    "fifth row" in {
      pascal(0, 4) should be(1)
      pascal(1, 4) should be(4)
      pascal(2, 4) should be(6)
      pascal(3, 4) should be(4)
      pascal(4, 4) should be(1)
    }

    "sixth row" in {
      pascal(0, 5) should be(1)
      pascal(1, 5) should be(5)
      pascal(2, 5) should be(10)
      pascal(3, 5) should be(10)
      pascal(4, 5) should be(5)
      pascal(5, 5) should be(1)
    }

    "seventh row" in {
      pascal(0, 6) should be(1)
      pascal(1, 6) should be(6)
      pascal(2, 6) should be(15)
      pascal(3, 6) should be(20)
      pascal(4, 6) should be(15)
      pascal(5, 6) should be(6)
      pascal(6, 6) should be(1)
    }

    "eighth row" in {
      pascal(0, 7) should be(1)
      pascal(1, 7) should be(7)
      pascal(2, 7) should be(21)
      pascal(3, 7) should be(35)
      pascal(4, 7) should be(35)
      pascal(5, 7) should be(21)
      pascal(6, 7) should be(7)
      pascal(7, 7) should be(1)
    }

    "nineth row" in {
      pascal(0, 8) should be(1)
      pascal(1, 8) should be(8)
      pascal(2, 8) should be(28)
      pascal(3, 8) should be(56)
      pascal(4, 8) should be(70)
      pascal(5, 8) should be(56)
      pascal(6, 8) should be(28)
      pascal(7, 8) should be(8)
      pascal(8, 8) should be(1)
    }

    "tenth row" in {
      pascal(0, 9) should be(1)
      pascal(1, 9) should be(9)
      pascal(2, 9) should be(36)
      pascal(3, 9) should be(84)
      pascal(4, 9) should be(126)
      pascal(5, 9) should be(126)
      pascal(6, 9) should be(84)
      pascal(7, 9) should be(36)
      pascal(8, 9) should be(9)
      pascal(9, 9) should be(1)
    }
  }
}
