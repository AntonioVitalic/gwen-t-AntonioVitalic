package cl.uchile.dcc
package gwent.Tableros

import gwent.Cartas.{CartaClima, CartaUnidadAsedio, CartaUnidadCuerpo, CartaUnidadDistancia}

/**
 * Clase que representa el tablero de distancia.
 *
 * El tablero de distancia se define por ser un tablero que contiene cartas de tipo [[CartaUnidadDistancia]].
 *
 * @param conjuntoCartas : Conjunto de cartas de tipo CartaUnidadDistancia que contiene el tablero de distancia.
 * @constructor Crea un nuevo TableroDistancia con un conjunto de cartas de tipo [[CartaUnidadDistancia]].
 * @author Antonio Vitalic
 */
class ZonaDistancia(private var conjuntoCartas: List[CartaUnidadDistancia]) extends Tablero {
  override def agregarAAsedio(carta: CartaUnidadAsedio): Unit = ???

  override def agregarACuerpo(carta: CartaUnidadCuerpo): Unit = ???

  override def agregarADistancia(carta: CartaUnidadAsedio): Unit = ???

  override def agregarAClima(carta: CartaClima): Unit = ???
}
