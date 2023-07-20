package cl.uchile.dcc
package gwent.Efectos

import gwent.Cartas.Carta
import gwent.Tableros.Tablero

/**
 * Una clase que representa un efecto nulo.
 * Se extiende de la interfaz Habilidad.
 * Se aplica el patrón de diseño Null Object.
 */

case class EfectoNulo() extends Habilidad{

  /**
   * Método que permite aplicar el efecto de una carta.
   * Como se aplica el patrón de diseño Null Object, no hace nada.
   * @param self: Carta que aplica el efecto
   * @param zona: Zona en la que se aplica el efecto
   */
  override def apply(self: Carta, zona: Tablero): Unit = {
    // No hacer nada
  }
}
