package cl.uchile.dcc
package gwent

/** Trait (interfaz) que representa un jugador.
 *
 * Representa a un jugador, que puede ser un usuario o una computadora.
 * Dado que se programa en Scala 2, no lleva parámetros.
 *
 * Se declaran los parámetros que debe tener un jugador, los cuales son:
 * Nombre: Nombre del jugador. Tipo: String
 * SeccionTablero: Seccion del tablero en la que se encuentra el jugador. Tipo: String
 * Sólo puede ser el String "Cuerpo a cuerpo", "Distancia", "Asedio" o "Clima"
 * ContadorGemas: Cantidad de gemas que tiene el jugador. Tipo: Int
 * MazoCartas: Mazo de cartas que tiene el jugador. Tipo: List[Carta]
 * ManoCartas: Cartas que tiene en la mano el jugador. Tipo: List[Carta]
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

