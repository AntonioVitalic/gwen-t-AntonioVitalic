package cl.uchile.dcc
package gwent.Estados

import gwent.Cartas.Carta
import gwent.GameController

class GameState(val context: GameController) {
  context.state = this

  def startGame(): Unit = {
    /* ... */
  }

  def playCard(carta: Carta): Unit = {
    /* ... */
  }

  def endTurn(): Unit = {
    /* ... */
  }
}
