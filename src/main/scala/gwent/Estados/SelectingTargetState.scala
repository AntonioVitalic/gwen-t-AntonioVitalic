package cl.uchile.dcc
package gwent.Estados

import gwent.GameController

class SelectingTargetState(context: GameController)
  extends GameState(context) {

  override def toAnotherPlayerPlaysAsManyTurnsAsHeWishesState(): Unit = {
    context.state =
      new AnotherPlayerPlaysAsManyTurnsAsHeWishesState(context)
  }

  override def toGameOverState(): Unit = {
    context.state = new GameOverState(context)
  }

  override def toNoPlayerCanPlayCardsState(): Unit = {
    context.state = new NoPlayerCanPlayCardsState(context)
  }

  override def toPlayerEndsHisTurnState(): Unit = {
    context.state = new PlayerEndsHisTurnState(context)
  }

  override def toPlayerIsDecidingWhetherToPlayACardOrPassHisTurnState() : Unit = {
    context.state = new PlayerIsDecidingWhetherToPlayACardOrPassHisTurnState(context)
  }
}
