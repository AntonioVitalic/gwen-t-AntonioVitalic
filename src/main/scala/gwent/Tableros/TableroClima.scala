package cl.uchile.dcc
package gwent.Tableros

import gwent.Cartas.{Carta, CartaClima}

/**
 * Clase que representa el tablero de clima.
 *
 * El tablero de clima se define por ser un tablero que contiene cartas de tipo [[CartaClima]].
 *
 * @param conjuntoCartas : Conjunto de cartas de tipo CartaClima que contiene el tablero de clima.
 * @constructor Crea un nuevo TableroClima con un conjunto de cartas de tipo [[CartaClima]].
 * @author Antonio Vitalic
 */
class TableroClima(private var conjuntoCartas: List[CartaClima]) extends AbstractTablero{
  /**
   * Método genérico que se overridea, el cual permite agregar una carta al tablero de clima.
   * @param carta : Carta que se desea agregar al tablero de clima.
   */
  override def anadirCarta(carta: Carta): Unit = {
    carta.anadirCartaClima(this)
  }
}
