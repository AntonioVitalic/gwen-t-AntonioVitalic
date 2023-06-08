package cl.uchile.dcc
package gwent.Estados

import gwent.GameController

import cl.uchile.dcc.gwent.Cartas.Carta

class StartState(context: GameController) extends GameState(context) {
  // equivalente a "Estado de la partida cuando se inicia un ronda"
  override def toSelectingTargetState(): Unit = {
    context.state =
      new SelectingTargetState(context)
    context.promptSelection()
  }
}

