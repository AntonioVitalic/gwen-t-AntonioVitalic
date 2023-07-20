package cl.uchile.dcc
package gwent.Estados

import gwent.Cartas.Carta
import gwent.GameController

/**
 * Clase que representa el estado del juego.
 * @param context
 */
class GameState(val context: GameController) {
  context.state = this

  /**
  def playCard(carta: Carta): Unit = { // se estuvo intentando implementar lo del enunciado, por eso se importaba Carta
    /* ... */
  }

  def endTurn(): Unit = {
    /* ... */
  }
  */

  def doAction(): Unit = {
    // do nothing
  }

  /**
   * Método que permite cambiar el estado del juego a "AnotherPlayerPlaysAsManyTurnsAsHeWishesState".
   * Por defecto, se lanzará un error.
   */
  def toAnotherPlayerPlaysAsManyTurnsAsHeWishesState(): Unit = {
    transitionError("AnotherPlayerPlaysAsManyTurnsAsHeWishesState")
  }

  /**
   * Método que permite cambiar el estado del juego a "AnotherPlayerPlaysHisCardState".
   * Por defecto, se lanzará un error.
   */
  def toGameOverState(): Unit = {
    transitionError("GameOverState")
  }

  /**
   * Método que permite cambiar el estado del juego a "AnotherPlayerPlaysHisCardState".
   * Por defecto, se lanzará un error.
   */
  def toNoPlayerCanPlayCardsState(): Unit = {
    transitionError("NoPlayerCanPlayCardsState")
  }

  /**
   * Método que permite cambiar el estado del juego a "PlayerEndsHisTurnState".
   * Por defecto, se lanzará un error.
   */
  def toPlayerEndsHisTurnState(): Unit = {
    transitionError("PlayerEndsHisTurnState")
  }

  /**
   * Método que permite cambiar el estado del juego a "PlayerIsDecidingWhetherToPlayACardOrPassHisTurnState".
   * Por defecto, se lanzará un error.
   */
  def toPlayerIsDecidingWhetherToPlayACardOrPassHisTurnState(): Unit = {
    transitionError("PlayerIsDecidingWhetherToPlayACardOrPassHisTurnState")
  }

  /**
   * Método que permite cambiar el estado del juego a "PlayerPassesHisTurnState".
   * Por defecto, se lanzará un error.
   */
  def toPlayerPassesHisTurnState(): Unit = {
    transitionError("PlayerPassesHisTurnState")
  }

  /**
   * Método que permite cambiar el estado del juego a "PlayerPlaysHisCardState".
   * Por defecto, se lanzará un error.
   */
  def toPlayerPlaysHisCardState(): Unit = {
    transitionError("PlayerPlaysHisCardState")
  }

  /**
   * Método que permite cambiar el estado del juego a "RoundEndsState".
   * Por defecto, se lanzará un error.
   */
  def toRoundEndsState(): Unit = {
    transitionError("RoundEndsState")
  }

  /**
   * Método que permite cambiar el estado del juego a "SelectingTargetState".
   * Por defecto, se lanzará un error.
   */
  def toSelectingTargetState(): Unit = {
    transitionError("SelectingTargetState")
  }

  /**
   * Método que permite cambiar el estado del juego a "StartState".
   * Por defecto, se lanzará un error.
   */
  def toStartState(): Unit = {
    transitionError("StartState")
  }

  /**
   * Método que permite lanzar una excepción cuando se intenta cambiar el estado del juego a un estado inválido.
   */
  private def transitionError(targetState: String): Unit = {
    throw new InvalidTransitionException(
      s"Cannot transition from ${getClass.getSimpleName} to $targetState"
    )
  }
}
