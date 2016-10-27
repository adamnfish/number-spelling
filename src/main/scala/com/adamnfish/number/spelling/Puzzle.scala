package com.adamnfish.number.spelling

import zillion.cardinal

object Puzzle {
  def main(args: Array[String]): Unit = println(lowestAlphabeticalNumber)

  def lowestAlphabeticalNumber = {
    Stream.range(0, 10000000).map(cardinal(_)).find { name =>
      name.foldLeft("abcdefghijklmnopqrstuvwxyz" -> true) { case ((remainingLetters, valid), char) =>
        if (remainingLetters.contains(char)) remainingLetters.dropWhile(_ != char) -> true
        else "" -> false
      }._2
    }
  }
}
