package cl.uchile.dcc
package gwent

/** Trait (interfaz) que representa un jugador.
 *
 * Representa a un jugador, que puede ser un usuario o una computadora.
 * Dado que se programa en Scala 2, no lleva parámetros.
 *
 * Se declaran los parámetros que debe tener un jugador, los cuales son:
 * Nombre: Nombre del jugador
 * SeccionTablero: Seccion del tablero en la que se encuentra el jugador
 * ContadorGemas: Cantidad de gemas que tiene el jugador
 * MazoCartas: Mazo de cartas que tiene el jugador
 * ManoCartas: Cartas que tiene en la mano el jugador
 *
 * Este trait luego de hereda en la clase Usuario y en la clase Computadora, donde
 * se implementan los métodos usando override.
 *
 * @author Antonio Vitalic
 */
trait Jugador{
  def Nombre(): String

  def SeccionTablero(): String

  def ContadorGemas(): Int

  def MazoCartas(): List[Carta]

  def ManoCartas(): List[Carta]
}

