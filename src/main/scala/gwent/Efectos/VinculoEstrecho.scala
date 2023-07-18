package cl.uchile.dcc
package gwent.Efectos
import gwent.Cartas.{AbstractCartaUnidad, Carta}

import scala.collection.mutable.ListBuffer


/**
 * Una clase que representa un efecto de vínculo estrecho.
 * Se extiende de la interfaz Habilidad.
 * Se aplica a cartas de tipo unidad.
 *
 * El efecto "Vínculo estrecho" consiste en duplicar la fuerza de todas las cartas en su fila,
 * incluyéndose a sí misma.
 */
class VinculoEstrecho extends Habilidad {

  /**
   * Método que permite aplicar el efecto de vínculo estrecho.
   * El efecto "Vínculo estrecho" consiste en duplicar la fuerza de todas las cartas en su fila,
   * incluyéndose a sí misma.
   *
   * @param self
   * @param zona
   */
  override def apply(self: AbstractCartaUnidad, zona: ListBuffer[AbstractCartaUnidad]): Unit = {
    zona.filter(_.nombre == self.nombre).foreach(self => self.anadeFuerza(self.fuerza))
  }
}
