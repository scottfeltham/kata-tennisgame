package com.example

class TennisGame(player1: Player, player2: Player) {

  def score: String = {

    if(player1.scoreDescription == "forty" && player2.scoreDescription == "forty") {

      if(player1.compare(player2) == -2)
        return player2.name + " won"

      if(player1.compare(player2) == 2)
        return player1.name + " won"

      if (player1.compare(player2) == 0)
        return "deuce"

      if (player1.compare(player2) == 1)
        return "advantage " + player1.name

      if (player1.compare(player2) == -1)
        return "advantage " + player2.name

    }

    return player1.scoreDescription + ", " + player2.scoreDescription
  }

}

class Player(val name: String) extends Ordered[Player] {

  var score: Int = 0

  def scoreDescription: String = score match {
      case 0 => "love"
      case 1 => "fifteen"
      case 2 => "thirty"
      case _ => "forty"
  }

  def winBall: Unit = {
    score = score + 1
  }

  override def compare(that: Player): Int = {
    if (this.score > that.score + 1) return 2
    if (this.score + 1 < that.score) return -2
    if (this.score > that.score) return 1
    if (this.score < that.score) return -1
    return 0
  }
}

object Player {
  def apply(name: String) = {new Player(name)}
}
