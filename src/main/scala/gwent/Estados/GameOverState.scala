package cl.uchile.dcc
package gwent.Estados

import gwent.GameController

class GameOverState (context: GameController) extends GameState(context) {
  override def toSelectingTargetState(): Unit = {
    context.state =
      new SelectingTargetState(context)
    context.promptSelection()
  }
}
