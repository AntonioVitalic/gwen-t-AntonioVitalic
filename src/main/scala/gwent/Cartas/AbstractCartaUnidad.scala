package cl.uchile.dcc
package gwent.Cartas

/** Clase abstracta que representa una carta de unidad en el juego Gwen't.
 *
 * Una `AbstractCartaUnidad` es un tipo de [[Carta]] que tiene un valor de fuerza que contribuye a
 * la fuerza total del jugador en el juego.
 * Cada carta de unidad comienza con su fuerza actual igual a su fuerza base.
 *
 * @constructor Crea una nueva `AbstractCartaUnidad` con un nombre, efecto y
 *              fuerza.
 * @param nombre      El nombre de la carta.
 * @param efecto      El efecto de la carta, explicando sus efectos en el juego.
 * @param fuerza       La potencia base de la carta, indicando la contribución de esta carta a
 *                    la potencia total del jugador cuando no se ve afectado por ninguna condición especial.
 * @author Antonio Vitalic
 */
abstract class AbstractCartaUnidad protected(val nombre: String, val efecto: String,
                                             var fuerza: Int) extends Carta {

  /** La fuerza actual de la carta, que puede verse afectada por diversas condiciones durante
   * el desarrollo del juego.
   * Establecido inicialmente en la [[fuerza]] base de la carta.
   */
  var fuerzaActual: Int = fuerza

  def anadeFuerza (n: Int): Unit = fuerzaActual += n

  def setFuerza (n: Int): Unit = fuerzaActual = n
}


