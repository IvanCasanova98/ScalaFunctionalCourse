import scala.annotation.tailrec

object exercise2 {

  def balance(chars: List[Char]): Boolean = {
    @tailrec
    def loop(acc: Int, letters: List[Char]): Boolean ={
      if (acc == 0 && letters.isEmpty)
        true
      else if (acc < 0)
        false
      else {
        val h = letters.head
        if (h == '(') loop(acc + 1, letters.tail)
        else if (h == ')') loop(acc -1, letters.tail)
        else loop(acc, letters.tail)

      }

    }
    loop(0, chars)

  }


}
exercise2.balance("()()()".toList)