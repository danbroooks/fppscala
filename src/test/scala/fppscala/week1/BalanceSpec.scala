package fppscala.week1

import org.scalatest._

class BalanceSpec extends FreeSpec with Matchers {
  "Balance" - {
    "should return true when parens are balanced in string" in {
      Balance("(if (zero? x) max (/ 1 x))".toList) should be(true)
      Balance("I told him (that it's not (yet) done). (But he wasn't listening)".toList) should be(true)
    }

    "should return false when parens aren't balanced in string" in {
      Balance(":-)".toList) should be(false)
      Balance("())(".toList) should be(false)
    }
  }
}
