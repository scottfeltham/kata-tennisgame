package com.example

class TennisGame(player1: Player, player2: Player) {

  def score = {
    "love, love"
  }

}

class Player(val name: String) extends Ordered[Player] {

  def scoreDescription = {}
  def winBall {}

  override def compare(that: Player): Int = ???
}

object Player {
  def apply(name: String) = {new Player(name)}
}
