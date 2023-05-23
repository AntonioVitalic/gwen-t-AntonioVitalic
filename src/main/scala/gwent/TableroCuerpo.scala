package cl.uchile.dcc
package gwent

/**
 * Clase que representa el tablero de cuerpo.
 *
 * El tablero de cuerpo se define por ser un tablero que contiene cartas de tipo [[CartaUnidadCuerpo]].
 *
 * @param conjuntoCartas : Conjunto de cartas de tipo CartaUnidadCuerpo que contiene el tablero de cuerpo.
 *
 * @constructor Crea un nuevo TableroCuerpo con un conjunto de cartas de tipo [[CartaUnidadCuerpo]].
 * @author Antonio Vitalic
 */
class TableroCuerpo(private var conjuntoCartas: List[CartaUnidadCuerpo]) extends AbstractTablero {
  /**
   * Método genérico que se overridea, el cual permite agregar una carta al tablero de cuerpo.
   * @param carta : Carta que se desea agregar al tablero de cuerpo.
   */
  override def anadirCarta(carta: Carta): Unit = {
    carta.anadirCartaCuerpo(this)
  }
}
