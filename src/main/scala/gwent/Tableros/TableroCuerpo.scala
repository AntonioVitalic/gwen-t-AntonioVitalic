package cl.uchile.dcc
package gwent.Tableros

import gwent.Cartas.{Carta, CartaUnidadCuerpo}

/**
 * Clase que representa el tablero de cuerpo.
 *
 * El tablero de cuerpo se define por ser un tablero que contiene cartas de tipo [[CartaUnidadCuerpo]].
 *
 * @param conjuntoCartas : Conjunto de cartas de tipo CartaUnidadCuerpo que contiene el tablero de cuerpo.
 * @constructor Crea un nuevo TableroCuerpo con un conjunto de cartas de tipo [[CartaUnidadCuerpo]].
 * @author Antonio Vitalic
 */
class TableroCuerpo(private var conjuntoCartas: List[CartaUnidadCuerpo]) extends AbstractTablero {

}
