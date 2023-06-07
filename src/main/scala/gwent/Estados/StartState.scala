package cl.uchile.dcc
package gwent.Estados

import gwent.GameController

import cl.uchile.dcc.gwent.Cartas.Carta

class StartState(controller: GameController) extends GameState {
  // equivalente a "Estado de la partida cuando se inicia un ronda"
  override def startGame(): Unit = {
    /* ... */
    controller.state = new /* ... */
  }
  override def playCard(card: Carta): Unit = {
    /* ... */
    controller.state = new /* ... */
  }
  override def endTurn(): Unit = {
    /* ... */
    controller.state = new /* ... */
  }
}

