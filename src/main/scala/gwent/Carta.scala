package cl.uchile.dcc
package gwent


/** Trait (interfaz) que representa las cartas.
 *
 * Representa las cartas del juego Gwent. Son utilizadas por Usuario y Computadora.
 * Dado que se programa en Scala 2, no lleva parámetros.
 *
 * Se declaran los parámetros que debe tener una carta, los cuales son:
 * Nombre: Nombre de la carta
 * SeccionTablero: Seccion del tablero en la que se encuentra la carta
 * Efecto: Efecto de la carta
 *
 * Este trait luego de hereda en la clase CartaUnidad y en la clase CartaEspecial, donde
 * se implementan los métodos usando override.
 *
 * @author Antonio Vitalic
 */
trait Carta{
  def nombre(): String

  def efecto(): String
}
