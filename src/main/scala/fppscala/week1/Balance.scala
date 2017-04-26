package fppscala.week1

object Balance {
  def apply(str: String): Boolean =
    Balance(str.toList)

  def apply(chars: List[Char]): Boolean = {
    def f(c: List[Char], nOpenBraces: Int): Boolean = {
      if (c.isEmpty) true
      else if (nOpenBraces < 0) false
      else {
        val n =
          if (c.head == '(') nOpenBraces + 1
          else if (c.head == ')') nOpenBraces - 1
          else nOpenBraces

        if (c.tail.isEmpty) n == 0
        else f(c.tail, n)
      }
    }

    f(chars, 0)
  }
}
