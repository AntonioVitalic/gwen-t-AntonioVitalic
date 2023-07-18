package cl.uchile.dcc
package gwent.Estados

import gwent.GameController

/**
 * Clase que representa el estado en el que ningún jugador puede jugar cartas.
 * @param context: Controlador del juego.
 */
class NoPlayerCanPlayCardsState (context: GameController) extends GameState(context) {

  /**
   * Método que permite cambiar el estado del juego a "SelectingTargetState".
   */
  override def toSelectingTargetState(): Unit = {
    context.state =
      new SelectingTargetState(context)
    context.promptSelection()
  }
}
