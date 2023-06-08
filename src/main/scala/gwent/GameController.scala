package cl.uchile.dcc
package gwent

import gwent.Estados.{GameState, StartState}
import cl.uchile.dcc.gwent.Cartas.Carta

class GameController {
  private var player1 = List.empty[Jugador]
  private var player2 = List.empty[Jugador]

  // Estado actual del juego
  var state: GameState = new StartState(this)

  def startGame{
    state = new StartState(this)
  }

  def promptSelection(): Unit = {
    state.doAction()
  }
}
