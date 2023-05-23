package cl.uchile.dcc
package gwent

/**
 * Clase que representa el tablero de asedio.
 *
 * El tablero de asedio se define por ser un tablero que contiene cartas de tipo [[CartaUnidadAsedio]].
 *
 * @param conjuntoCartas : Conjunto de cartas de tipo CartaUnidadAsedio que contiene el tablero de asedio.
 *
 * @constructor Crea un nuevo TableroAsedio con un conjunto de cartas de tipo [[CartaUnidadAsedio]].
 * @author Antonio Vitalic
 */
class TableroAsedio(private var conjuntoCartas: List[CartaUnidadAsedio]) extends AbstractTablero {
  /**
   * Método genérico que se overridea, el cual permite agregar una carta al tablero de asedio.
   * @param carta : Carta que se desea agregar al tablero de asedio.
   */
  override def anadirCarta(carta : Carta): Unit = {
    carta.anadirCartaAsedio(this)
  }

  /**
   * Método específico que permite agregar una carta de tipo [[CartaUnidadAsedio]] al tablero de asedio.
   * @param cartaAsedio : Carta de tipo [[CartaUnidadAsedio]] que se desea agregar al tablero de asedio.
   */
  def anadirCartaAsedio(cartaAsedio: CartaUnidadAsedio): Unit = {
    conjuntoCartas = cartaAsedio :: conjuntoCartas
  }
}
