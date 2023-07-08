package cl.uchile.dcc
package gwent.Efectos

import gwent.Cartas.Carta

import scala.collection.mutable.ListBuffer

trait Habilidad {
  def apply(self: Carta, zona: ListBuffer[Carta])
}
