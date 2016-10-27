package com.adamnfish.number.spelling

import zillion.cardinal

object Puzzle extends App {
  println {
    Stream.range(0, 10000000).map(cardinal(_)).find(n => n == n.sorted)
  }
}
