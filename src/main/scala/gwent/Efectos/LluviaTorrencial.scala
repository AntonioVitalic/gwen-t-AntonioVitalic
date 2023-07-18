package cl.uchile.dcc
package gwent.Efectos
import gwent.Cartas.Carta

import scala.collection.mutable.ListBuffer

/**
 * Una clase que representa un efecto de lluvia torrencial.
 * Se extiende de la interfaz Habilidad.
 * Se aplica a cartas de tipo clima.
 *
 * El efecto "Lluvia torrencial" consiste en establecer el valor de fuerza de todas
 * las cartas de combate a distancia en 1.
 *
 */

class LluviaTorrencial extends Habilidad {

  /**
   * Método que permite aplicar el efecto de lluvia torrencial.
   * El efecto "Lluvia torrencial" consiste en establecer el valor de fuerza de todas
   * las cartas de combate a distancia en 1.
   *
   * @param self
   * @param zona
   */
  override def apply(self: Carta, zona: ListBuffer[Carta]): Unit = ???
}
