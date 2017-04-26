package fppscala.week1

object Balance {
  def apply(str: String): Boolean =
    Balance(str.toList)

  def apply(chars: List[Char]): Boolean = {
    def f(c: List[Char], nOpenBraces: Int): Boolean = {
      if (c.isEmpty) nOpenBraces == 0
      else if (nOpenBraces < 0) false
      else c.head match {
        case '(' => f(c.tail, nOpenBraces + 1)
        case ')' => f(c.tail, nOpenBraces - 1)
        case _   => f(c.tail, nOpenBraces)
      }
    }

    f(chars, 0)
  }
}
