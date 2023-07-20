package cl.uchile.dcc
package gwent.Estados

import gwent.GameController

/**
 * Clase que representa el estado en el que el jugador debe decidir si jugar una carta o pasar su turno.
 * @param context: Controlador del juego.
 */

class PlayerIsDecidingWhetherToPlayACardOrPassHisTurnState
(context: GameController) extends GameState(context){

  /**
   * Método que permite cambiar el estado del juego a "SelectingTargetState".
   */
  override def toSelectingTargetState(): Unit = {
    context.state =
      new SelectingTargetState(context)
    context.promptSelection()
  }
}
