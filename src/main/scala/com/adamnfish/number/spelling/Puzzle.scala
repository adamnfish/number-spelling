package com.adamnfish.number.spelling

import zillion.cardinal

object Puzzle extends App {
  println {
    Stream.range(0, 10000000).map(cardinal(_)).find {
      _.foldLeft("abcdefghijklmnopqrstuvwxyz|")((r, c) => if (r.contains(c)) r.dropWhile(_ != c) else "").nonEmpty
    }
  }
}
