package cl.uchile.dcc
package gwent.Tableros

import gwent.Cartas.{Carta, CartaUnidadAsedio}

/**
 * Clase que representa el tablero de asedio.
 *
 * El tablero de asedio se define por ser un tablero que contiene cartas de tipo [[CartaUnidadAsedio]].
 *
 * @param conjuntoCartas : Conjunto de cartas de tipo CartaUnidadAsedio que contiene el tablero de asedio.
 * @constructor Crea un nuevo TableroAsedio con un conjunto de cartas de tipo [[CartaUnidadAsedio]].
 * @author Antonio Vitalic
 */
class TableroAsedio(private var conjuntoCartas: List[CartaUnidadAsedio]) extends AbstractTablero {

}
