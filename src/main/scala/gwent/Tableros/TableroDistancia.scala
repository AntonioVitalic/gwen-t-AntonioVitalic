package cl.uchile.dcc
package gwent.Tableros

import gwent.Cartas.{Carta, CartaClima, CartaUnidadAsedio, CartaUnidadCuerpo, CartaUnidadDistancia}

/**
 * Clase que representa el tablero de distancia.
 *
 * El tablero de distancia se define por ser un tablero que contiene cartas de tipo [[CartaUnidadDistancia]].
 *
 * @param conjuntoCartas : Conjunto de cartas de tipo CartaUnidadDistancia que contiene el tablero de distancia.
 * @constructor Crea un nuevo TableroDistancia con un conjunto de cartas de tipo [[CartaUnidadDistancia]].
 * @author Antonio Vitalic
 */
class TableroDistancia(private var conjuntoCartas: List[CartaUnidadDistancia]) extends AbstractTablero {

}
