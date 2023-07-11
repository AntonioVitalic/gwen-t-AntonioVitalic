package cl.uchile.dcc
package gwent.Efectos
import gwent.Cartas.{AbstractCartaUnidad, Carta}

import scala.collection.mutable.ListBuffer

class RefuerzoMoral extends Habilidad {
  // Efecto para cartas de Unidad
  // Refuerzo moral: Cuando la carta entra en el campo, añade +1 a la fuerza de todas las cartas en su fila,
  // excepto a sí misma.
  override def apply(self: AbstractCartaUnidad, zona: ListBuffer[AbstractCartaUnidad]): Unit = {
    zona.filterNot(_ == self).foreach(self => self.anadeFuerza(1))
  }
}
