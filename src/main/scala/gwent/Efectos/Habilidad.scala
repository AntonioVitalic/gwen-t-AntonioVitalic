package cl.uchile.dcc
package gwent.Efectos

import gwent.Cartas.Carta

import cl.uchile.dcc.gwent.Tableros.Tablero

import scala.collection.mutable.ListBuffer

/**
 * Una interfaz que representa las habilidades de las cartas.
 */
trait Habilidad {

  /**
   * Método que permite aplicar el efecto de una carta.
   * @param self: Carta que aplica el efecto
   * @param zona: Zona en la que se aplica el efecto
   */
  def apply(self: Carta, zona: Tablero)
}
