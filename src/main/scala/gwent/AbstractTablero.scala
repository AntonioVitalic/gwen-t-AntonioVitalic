package cl.uchile.dcc
package gwent

/**
 * Clase abstracta que representa un tablero.
 *
 * Un tablero se define por ser un conjunto de cartas de un tipo específico.
 *
 * @constructor Crea un nuevo tablero con un conjunto de cartas de un tipo específico.
 *
 * @author Antonio Vitalic
 */
abstract class AbstractTablero {
  val tableroAsedio : TableroAsedio = new TableroAsedio(List[CartaUnidadAsedio]())
  val tableroCuerpo: TableroCuerpo = new TableroCuerpo(List[CartaUnidadCuerpo]())
  val tableroDistancia: TableroDistancia = new TableroDistancia(List[CartaUnidadDistancia]())
  val tableroClima : TableroClima = new TableroClima(List[CartaClima]())

  /**
   * Método genérico que permite agregar una carta al tablero.
   * @param carta : Carta que se desea agregar al tablero.
   */
  def anadirCarta(carta : Carta) : Unit = {}

}