package cl.uchile.dcc
package gwent.Efectos
import gwent.Cartas.{AbstractCartaUnidad, Carta}

import scala.collection.mutable.ListBuffer

class VinculoEstrecho extends Habilidad {
  // Efecto para cartas de Unidad
  // Vínculo estrecho: Si ya existe una carta con el mismo nombre en la fila, duplica la fuerza de esa(s) carta(s),
  // incluyéndose a sí misma
  override def apply(self: AbstractCartaUnidad, zona: ListBuffer[AbstractCartaUnidad]): Unit = {
    zona.filter(_.nombre == self.nombre).foreach(self => self.anadeFuerza(self.fuerza))
  }
}
