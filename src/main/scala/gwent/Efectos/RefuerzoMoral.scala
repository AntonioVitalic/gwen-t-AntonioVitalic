package cl.uchile.dcc
package gwent.Efectos
import gwent.Cartas.{AbstractCartaUnidad, Carta}

import scala.collection.mutable.ListBuffer

/**
 * Una clase que representa un efecto de refuerzo moral.
 * Se extiende de la interfaz Habilidad.
 * Se aplica a cartas de tipo unidad.
 *
 * El efecto "Refuerzo moral" consiste en añadir +1 a la fuerza de todas las cartas en su fila,
 * excepto a sí misma.
 */

case class RefuerzoMoral() extends Habilidad {
  /**
   * Método que permite aplicar el efecto de refuerzo moral.
   * El efecto "Refuerzo moral" consiste en añadir +1 a la fuerza de todas las cartas en su fila,
   * excepto a sí misma.
   *
   * @param self
   * @param zona
   */
  def apply(self: AbstractCartaUnidad, zona: ListBuffer[AbstractCartaUnidad]): Unit = {
    zona.filterNot(_ == self).foreach(self => self.anadeFuerza(1))
  }
}
