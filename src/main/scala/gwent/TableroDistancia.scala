package cl.uchile.dcc
package gwent

/**
 * Clase que representa el tablero de distancia.
 *
 * El tablero de distancia se define por ser un tablero que contiene cartas de tipo [[CartaUnidadDistancia]].
 *
 * @param conjuntoCartas : Conjunto de cartas de tipo CartaUnidadDistancia que contiene el tablero de distancia.
 *
 * @constructor Crea un nuevo TableroDistancia con un conjunto de cartas de tipo [[CartaUnidadDistancia]].
 * @author Antonio Vitalic
 */
class TableroDistancia(private var conjuntoCartas: List[CartaUnidadDistancia]) extends AbstractTablero{
  /**
   * Método genérico que se overridea, el cual permite agregar una carta al tablero de distancia.
   * @param carta : Carta que se desea agregar al tablero de distancia.
   */
  override def anadirCarta(carta: Carta): Unit = {
    carta.anadirCartaDistancia(this)
  }

  /**
   * Método específico que permite agregar una carta de tipo [[CartaUnidadDistancia]] al tablero de distancia.
   * @param cartaDistancia : Carta de tipo [[CartaUnidadDistancia]] que se desea agregar al tablero de distancia.
   */
  def anadirCartaDistancia(cartaDistancia: CartaUnidadDistancia): Unit = {
    conjuntoCartas = cartaDistancia :: conjuntoCartas
  }
}
