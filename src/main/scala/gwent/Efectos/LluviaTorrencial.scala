package cl.uchile.dcc
package gwent.Efectos
import gwent.Cartas.{Carta, CartaUnidadAsedio}

import scala.collection.mutable.ListBuffer

/**
 * Una clase que representa un efecto de lluvia torrencial.
 * Se extiende de la interfaz Habilidad.
 * Se aplica a cartas de tipo clima.
 *
 * El efecto "Lluvia torrencial" consiste en establecer el valor de todas las cartas de asedio a 1.

 *
 */

case class LluviaTorrencial() extends Habilidad {

  /**
   * Método que permite aplicar el efecto de lluvia torrencial.
   * El efecto "Lluvia torrencial" consiste en establecer el valor de todas las cartas de asedio a 1.
   *
   * @param self
   * @param zona
   */
  def apply(self: Carta, zona: ListBuffer[CartaUnidadAsedio]): Unit = {
    zona.foreach(_.setFuerza(1))
  }
}
