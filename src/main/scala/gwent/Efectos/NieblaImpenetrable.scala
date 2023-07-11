package cl.uchile.dcc
package gwent.Efectos
import gwent.Cartas.Carta

import scala.collection.mutable.ListBuffer

class NieblaImpenetrable extends Habilidad {
  // Efecto para cartas de clima
  // Niebla impenetrable: Establece el valor de fuerza de todas las cartas de combate a distancia en 1.
  override def apply(self: Carta, zona: ListBuffer[Carta]): Unit = ???
}
