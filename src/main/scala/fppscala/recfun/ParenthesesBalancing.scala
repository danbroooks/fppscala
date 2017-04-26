package fppscala.recfun

object ParenthesesBalancing {
  def balance(str: String): Boolean = balance(str.toList)

  def balance(chars: List[Char]): Boolean = {
    def f(c: List[Char], nOpenBraces: Int): Boolean = c match {
      case '(' :: tail => f(tail, nOpenBraces + 1)
      case ')' :: tail => nOpenBraces > 0 && f(tail, nOpenBraces - 1)
      case _ :: tail   => f(tail, nOpenBraces)
      case _           => nOpenBraces == 0
    }

    f(chars, 0)
  }
}
