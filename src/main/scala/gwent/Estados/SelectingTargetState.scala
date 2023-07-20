package cl.uchile.dcc
package gwent.Estados

import gwent.GameController

/**
 * Clase que representa el estado en el que el jugador selecciona un objetivo.
 * @param context: Controlador del juego.
 */

class SelectingTargetState(context: GameController)
  extends GameState(context) {

  /**
   * Método que permite cambiar el estado del juego a "PlayerEndsHisTurnState".
   */
  override def toAnotherPlayerPlaysAsManyTurnsAsHeWishesState(): Unit = {
    context.state =
      new AnotherPlayerPlaysAsManyTurnsAsHeWishesState(context)
  }

  /**
   * Método que permite cambiar el estado del juego a "PlayerPlaysHisCardState".
   */
  override def toGameOverState(): Unit = {
    context.state = new GameOverState(context)
  }

  /**
   * Método que permite cambiar el estado del juego a "PlayerPlaysHisCardState".
   */
  override def toNoPlayerCanPlayCardsState(): Unit = {
    context.state = new NoPlayerCanPlayCardsState(context)
  }

  /**
   * Método que permite cambiar el estado del juego a "PlayerPlaysHisCardState".
   */
  override def toPlayerEndsHisTurnState(): Unit = {
    context.state = new PlayerEndsHisTurnState(context)
  }

  /**
   * Método que permite cambiar el estado del juego a "PlayerPlaysHisCardState".
   */
  override def toPlayerIsDecidingWhetherToPlayACardOrPassHisTurnState() : Unit = {
    context.state = new PlayerIsDecidingWhetherToPlayACardOrPassHisTurnState(context)
  }
}
