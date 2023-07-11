package cl.uchile.dcc
package gwent.Efectos

import gwent.Cartas.Carta

import cl.uchile.dcc.gwent.Tableros.Tablero

import scala.collection.mutable.ListBuffer

trait Habilidad {
  def apply(self: Carta, zona: Tablero)
}
