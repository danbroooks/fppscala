package fppscala.week1

object Balance {
  def apply(str: String): Boolean =
    Balance(str.toList)

  def apply(chars: List[Char]): Boolean = {
    def f(c: List[Char], nOpenBraces: Int): Boolean = c match {
      case _ if nOpenBraces < 0 => false
      case '(' :: tail => f(tail, nOpenBraces + 1)
      case ')' :: tail => f(tail, nOpenBraces - 1)
      case _ :: tail  => f(tail, nOpenBraces)
      case _ => nOpenBraces == 0
    }

    f(chars, 0)
  }
}
