package cl.uchile.dcc
package gwent.Efectos
import gwent.Cartas.{Carta, CartaUnidadCuerpo}

import scala.collection.mutable.ListBuffer

/**
 * Una clase que representa un efecto de escarcha mordiente.
 * Se extiende de la interfaz Habilidad.
 * Se aplica a cartas de tipo clima.
 *
 * El efecto "Escarcha mordiente" consiste en establecer el valor de fuerza de to
 * das las cartas de combate cuerpo a cuerpo en 1.
 *
 */

case class EscarchaMordiente() extends Habilidad {

  /**
   * Método que permite aplicar el efecto de escarcha mordiente.
   * El efecto "Escarcha mordiente" consiste en establecer el valor de fuerza de
   * todas las cartas de combate cuerpo a cuerpo en 1.
   *
   * @param self: Carta que aplica el efecto
   * @param zona: Zona en la que se aplica el efecto
   */
  def apply(self: Carta, zona: ListBuffer[CartaUnidadCuerpo]): Unit = {
    zona.foreach(_.setFuerza(1))
  }

}
