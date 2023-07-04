package cl.uchile.dcc
package gwent.Tableros

import gwent.Cartas.{CartaClima, CartaUnidadAsedio, CartaUnidadCuerpo}

/**
 * Clase que representa el tablero de clima.
 *
 * El tablero de clima se define por ser un tablero que contiene cartas de tipo [[CartaClima]].
 *
 * @param conjuntoCartas : Conjunto de cartas de tipo CartaClima que contiene el tablero de clima.
 * @constructor Crea un nuevo TableroClima con un conjunto de cartas de tipo [[CartaClima]].
 * @author Antonio Vitalic
 */
class ZonaClima(private var conjuntoCartas: List[CartaClima]) extends Tablero{
  override def agregarAAsedio(carta: CartaUnidadAsedio): Unit = ???

  override def agregarACuerpo(carta: CartaUnidadCuerpo): Unit = ???

  override def agregarADistancia(carta: CartaUnidadAsedio): Unit = ???

  override def agregarAClima(carta: CartaClima): Unit = ???
}
