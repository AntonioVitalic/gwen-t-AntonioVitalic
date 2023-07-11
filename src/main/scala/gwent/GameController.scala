package cl.uchile.dcc
package gwent

import gwent.Estados.{GameState, StartState}

import cl.uchile.dcc.gwent.Cartas.Carta
import cl.uchile.dcc.gwent.Jugadores.{CPU, Jugador, Usuario}
import cl.uchile.dcc.gwent.Observer.{Observer, Subject}

import scala.collection.mutable.ListBuffer

class GameController (private var jugadores: ListBuffer[Jugador])
  extends Observer[LoseCondition]{

  private var usuario = List.empty[Usuario]
  private var cpu = List.empty[CPU]

  for (jugador <- jugadores) {
    jugador.addObserver(this)
  }

  // Estado actual del juego
  var state: GameState = new StartState(this)

  def startGame{
    state = new StartState(this)
  }

  def promptSelection(): Unit = {
    state.doAction()
  }

  override def update(subject: Subject[LoseCondition],
                      value: LoseCondition
                     ): Unit = {
    val winCondition = value.asInstanceOf[LoseCondition]
    println(s"Jugador $subject perdió el juego, ${winCondition.name}")
  }
}
