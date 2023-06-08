package cl.uchile.dcc
package gwent.Estados

import gwent.Cartas.Carta
import gwent.GameController

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

  def toAnotherPlayerPlaysAsManyTurnsAsHeWishesState(): Unit = {
    transitionError("AnotherPlayerPlaysAsManyTurnsAsHeWishesState")
  }

  def toGameOverState(): Unit = {
    transitionError("GameOverState")
  }

  def toNoPlayerCanPlayCardsState(): Unit = {
    transitionError("NoPlayerCanPlayCardsState")
  }

  def toPlayerEndsHisTurnState(): Unit = {
    transitionError("PlayerEndsHisTurnState")
  }

  def toPlayerIsDecidingWhetherToPlayACardOrPassHisTurnState(): Unit = {
    transitionError("PlayerIsDecidingWhetherToPlayACardOrPassHisTurnState")
  }

  def toPlayerPassesHisTurnState(): Unit = {
    transitionError("PlayerPassesHisTurnState")
  }

  def toPlayerPlaysHisCardState(): Unit = {
    transitionError("PlayerPlaysHisCardState")
  }

  def toRoundEndsState(): Unit = {
    transitionError("RoundEndsState")
  }

  def toSelectingTargetState(): Unit = {
    transitionError("SelectingTargetState")
  }

  def toStartState(): Unit = {
    transitionError("StartState")
  }

  private def transitionError(targetState: String): Unit = {
    throw new InvalidTransitionException(
      s"Cannot transition from ${getClass.getSimpleName} to $targetState"
    )
  }
}
