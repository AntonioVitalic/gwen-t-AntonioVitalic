package cl.uchile.dcc
package gwent.Tableros

import gwent.Cartas.{Carta, CartaClima, CartaUnidadAsedio, CartaUnidadCuerpo}

/**
 * Clase abstracta que representa un tablero.
 *
 * @author Antonio Vitalic
 */


abstract class AbstractTablero {
  def agregarAAsedio(carta: CartaUnidadAsedio): Unit

  def agregarACuerpo(carta: CartaUnidadCuerpo): Unit

  def agregarADistancia(carta: CartaUnidadAsedio): Unit

  def agregarAClima(carta: CartaClima): Unit

}