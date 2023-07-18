package cl.uchile.dcc
package gwent

import gwent.Estados.{GameState, StartState}

import cl.uchile.dcc.gwent.Cartas.Carta
import cl.uchile.dcc.gwent.Jugadores.{CPU, Jugador, Usuario}
import cl.uchile.dcc.gwent.Observer.{Observer, Subject}
import scala.collection.mutable.ListBuffer

/**
 * Clase que representa el controlador del juego.
 * @param jugadores: Lista de jugadores que participan en el juego.
 */
class GameController (private var jugadores: ListBuffer[Jugador])
  extends Observer[LoseCondition]{

  private var usuario = List.empty[Usuario]
  private var cpu = List.empty[CPU]

  for (jugador <- jugadores) {
    jugador.addObserver(this)
  }

  // Estado actual del juego
  var state: GameState = new StartState(this)

  /**
   * Método que permite al juego iniciarse, en el estado "StartState".
   */
  def startGame{
    state = new StartState(this)
  }

  /**
   * Método que permite al juego cambiar de estado.
   */
  def promptSelection(): Unit = {
    state.doAction()
  }

  /**
   * Método que permite al juego actualizar su estado.
   */
  override def update(subject: Subject[LoseCondition],
                      value: LoseCondition
                     ): Unit = {
    val winCondition = value.asInstanceOf[LoseCondition]
    println(s"Jugador $subject perdió el juego, ${winCondition.name}")
  }
}
