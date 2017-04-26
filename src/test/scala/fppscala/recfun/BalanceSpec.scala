package fppscala.recfun

import org.scalatest._
import ParenthesesBalancing._

class ParenthesesBalancingSpec extends FreeSpec with Matchers {
  "Parentheses Balancing" - {
    "should return true when parens are balanced in string" in {
      balance("(if (zero? x) max (/ 1 x))") should be(true)
      balance("I told him (that it's not (yet) done). (But he wasn't listening)") should be(true)
    }

    "should return false when parens aren't balanced in string" in {
      balance(":-)") should be(false)
      balance("())(") should be(false)
    }
  }
}
