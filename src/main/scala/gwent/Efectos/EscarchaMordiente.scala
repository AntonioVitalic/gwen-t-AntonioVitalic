package cl.uchile.dcc
package gwent.Efectos
import gwent.Cartas.Carta

import scala.collection.mutable.ListBuffer

class EscarchaMordiente extends Habilidad {
  // Efecto para cartas de clima
  // Escarcha mordiente: Establece el valor de fuerza de todas las cartas de combate cuerpo a cuerpo en 1.
  override def apply(self: Carta, zona: ListBuffer[Carta]): Unit = {
    zona.foreach(_.anadeFuerza(1))
  }

}
