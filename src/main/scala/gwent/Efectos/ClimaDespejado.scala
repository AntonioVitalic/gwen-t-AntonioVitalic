package cl.uchile.dcc
package gwent.Efectos
import gwent.Cartas.Carta

import scala.collection.mutable.ListBuffer

/**
 * Una clase que representa un efecto de clima despejado.
 * Se extiende de la interfaz Habilidad.
 * Se aplica a cartas de tipo clima.
 *
 * El efecto "Clima despejado" consiste en eliminar todos los efectos climáticos
 * actualmente en efecto en el campo de batalla.
 *
 * @constructor Crea un objeto con el que se implementa el efecto de clima despejado,
 *              asociado a una carta de tipo Clima.
 */
class ClimaDespejado extends Habilidad {

  /**
   * Método que permite aplicar el efecto de clima despejado.
   * El efecto "Clima despejado" consiste en eliminar todos los efectos climáticos
   * actualmente en efecto en el campo de batalla.
   *
   * @param self: Carta que aplica el efecto
   * @param zona: Zona en la que se aplica el efecto
   */
  override def apply(self: Carta, zona: ListBuffer[Carta]): Unit = {}
}
