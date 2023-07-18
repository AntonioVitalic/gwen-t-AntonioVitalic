package cl.uchile.dcc
package gwent.Estados

import gwent.GameController

import cl.uchile.dcc.gwent.Cartas.Carta

/**
 * Clase que representa el estado en el que se inicia una ronda del juego.
 * Equivalente a "Estado de la partida cuando se inicia un ronda"
 * @param context
 */
class StartState(context: GameController) extends GameState(context) {

  /**
   * Método que permite cambiar el estado del juego a "SelectingTargetState".
   */
  override def toSelectingTargetState(): Unit = {
    context.state =
      new SelectingTargetState(context)
    context.promptSelection()
  }
}

