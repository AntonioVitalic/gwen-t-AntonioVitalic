package cl.uchile.dcc
package gwent



/** Trait (interfaz) que representa las acciones que puede realizar un jugador.
 *
 * Representa las acciones que puede hacer un  jugador, como jugar una carta de su mano o
 * robar una carta del mazo.
 * Dado que se programa en Scala 2, no lleva parámetros.
 *
 * Se declaran los métodos que debe tener un jugador, los cuales son:
 * JugarCartaMano: Juega una carta de la mano del jugador
 * RobarCartaMazo: Roba una carta del mazo del jugador
 *
 * Este trait luego de hereda en la clase Usuario y en la clase Computadora, donde
 * se implementan los métodos usando override.
 *
 * @author Antonio Vitalic
 */
trait AccionesJugador {
  def JugarCartaMano(): Unit

  def RobarCartaMazo(): Unit
}
