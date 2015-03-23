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

  /*
  it should "have score love, fifteen when player two scores" in {
    val player1 = new Player("Mike")
    val player2 = new Player("Roman")

    val tennisGame = new TennisGame(player1, player2)
    player2.winBall
    tennisGame.score should be ("love, fifteen")
  }*/

  "a player" should "at the start of the game have a score of zero" in {
    val player1 = new Player("Mike")
    val player2 = new Player("Roman")

    val tennisGame = new TennisGame(player1, player2)
    player1.scoreDescription should be ("love")
    player2.scoreDescription should be ("love")

  }

}