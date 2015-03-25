import com.example.{Player, TennisGame}
import org.scalatest._
import org.scalatest.matchers.ShouldMatchers

class TennisGameTest extends FlatSpec with Matchers {
  "Hello" should "have tests" in {
    true should be === true
  }

  "A Tennis game" should "have score love love when game starts" in {
    val player1 = new Player("Mike")
    val player2 = new Player("Roman")

    val tennisGame = new TennisGame(player1, player2)
    tennisGame.score should be ("love, love")
  }

  "both players" should "at the start of the game have a score of zero" in {
    val player1 = new Player("Mike")
    val player2 = new Player("Roman")

    val tennisGame = new TennisGame(player1, player2)
    player1.scoreDescription should be ("love")
    player2.scoreDescription should be ("love")
  }

  "a player" should "have a score of 1 when they win their first point" in {
    val player1 = new Player("Mike")
    val player2 = new Player("Roman")

    val tennisGame = new TennisGame(player1, player2)
    player1.winBall
    player1.scoreDescription should be ("fifteen")
    player2.scoreDescription should be ("love")
  }

  "A Tennis game" should "have score fifteen, love when player one scores" in {
    val player1 = new Player("Mike")
    val player2 = new Player("Roman")

    val tennisGame = new TennisGame(player1, player2)
    player1.winBall
    tennisGame.score should be ("fifteen, love")
  }

  "A Tennis game" should "have score thirty, love when player one scores again" in {
    val player1 = new Player("Mike")
    val player2 = new Player("Roman")

    val tennisGame = new TennisGame(player1, player2)
    player1.winBall
    player1.winBall
    tennisGame.score should be ("thirty, love")
  }

  "A Tennis game" should "have score forty, love when player one scores again" in {
    val player1 = new Player("Mike")
    val player2 = new Player("Roman")

    val tennisGame = new TennisGame(player1, player2)
    player1.winBall
    player1.winBall
    player1.winBall
    tennisGame.score should be ("forty, love")
  }

  "A Tennis game" should "have score forty, fifteen when player two scores their first point" in {
    val player1 = new Player("Mike")
    val player2 = new Player("Roman")

    val tennisGame = new TennisGame(player1, player2)
    player1.winBall
    player1.winBall
    player1.winBall
    player2.winBall
    tennisGame.score should be ("forty, fifteen")
  }

  "A Tennis game" should "have score forty, thirty when player two scores their second point" in {
    val player1 = new Player("Mike")
    val player2 = new Player("Roman")

    val tennisGame = new TennisGame(player1, player2)
    player1.winBall
    player1.winBall
    player1.winBall
    player2.winBall
    player2.winBall
    tennisGame.score should be ("forty, thirty")
  }

  "A Tennis game" should "have score deuce when player two scores their third point" in {
    val player1 = new Player("Mike")
    val player2 = new Player("Roman")

    val tennisGame = new TennisGame(player1, player2)
    player1.winBall
    player1.winBall
    player1.winBall
    player2.winBall
    player2.winBall
    player2.winBall
    tennisGame.score should be ("deuce")
  }

  "A Tennis game" should "have score advantage Mike when player one scores their fourth point" in {
    val player1 = new Player("Mike")
    val player2 = new Player("Roman")

    val tennisGame = new TennisGame(player1, player2)
    player1.winBall
    player1.winBall
    player1.winBall
    player2.winBall
    player2.winBall
    player2.winBall
    player1.winBall
    tennisGame.score should be ("advantage Mike")
  }

  "A Tennis game" should "have score deuce when player two scores their fourth point" in {
    val player1 = new Player("Mike")
    val player2 = new Player("Roman")

    val tennisGame = new TennisGame(player1, player2)
    player1.winBall
    player1.winBall
    player1.winBall
    player2.winBall
    player2.winBall
    player2.winBall
    player1.winBall
    player2.winBall
    tennisGame.score should be ("deuce")
  }

  "A Tennis game" should "have score advantage Roman when player two scores their fifth point" in {
    val player1 = new Player("Mike")
    val player2 = new Player("Roman")

    val tennisGame = new TennisGame(player1, player2)
    player1.winBall
    player1.winBall
    player1.winBall
    player2.winBall
    player2.winBall
    player2.winBall
    player1.winBall
    player2.winBall
    player2.winBall
    tennisGame.score should be ("advantage Roman")
  }

  "A Tennis game" should "have a winner called Roman when player two scores their sixth point" in {
    val player1 = new Player("Mike")
    val player2 = new Player("Roman")

    val tennisGame = new TennisGame(player1, player2)
    player1.winBall
    player1.winBall
    player1.winBall
    player2.winBall
    player2.winBall
    player2.winBall
    player1.winBall
    player2.winBall
    player2.winBall
    player2.winBall
    tennisGame.score should be ("Roman won")
  }

  "A Tennis game" should "have a winner called Mike when player one scores their sixth point" in {
    val player1 = new Player("Mike")
    val player2 = new Player("Roman")

    val tennisGame = new TennisGame(player1, player2)
    player1.winBall
    player1.winBall
    player1.winBall
    player2.winBall
    player2.winBall
    player2.winBall
    player1.winBall
    player1.winBall
    tennisGame.score should be ("Mike won")
  }


}