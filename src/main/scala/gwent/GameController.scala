package cl.uchile.dcc
package gwent

import gwent.Estados.{GameState, StartState}

import cl.uchile.dcc.gwent.Cartas.Carta
import cl.uchile.dcc.gwent.Jugadores.{Usuario, CPU}

class GameController {
  private var usuario = List.empty[Usuario]
  private var cpu = List.empty[CPU]

  // Estado actual del juego
  var state: GameState = new StartState(this)

  def startGame{
    state = new StartState(this)
  }

  def promptSelection(): Unit = {
    state.doAction()
  }
}
