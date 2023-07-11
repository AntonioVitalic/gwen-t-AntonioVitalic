package cl.uchile.dcc
package gwent.Efectos
import gwent.Cartas.Carta

import scala.collection.mutable.ListBuffer

class ClimaDespejado extends Habilidad {
  // Efecto para cartas de clima
  // Clima despejado: Elimina todos los efectos climáticos actualmente en efecto en el campo de batalla.
  override def apply(self: Carta, zona: ListBuffer[Carta]): Unit = {

  }
}
