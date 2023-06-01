package cl.uchile.dcc
package gwent.Tableros

import gwent.Cartas.Carta

/**
 * Clase abstracta que representa un tablero.
 *
 * @author Antonio Vitalic
 */


abstract class AbstractTablero extends Tablero{
  /**
   * Método genérico que permite agregar una carta al tablero.
   * @param carta : Carta que se desea agregar al tablero.
   */
  def anadirCarta(carta : Carta) : Unit = {}

  /**
   * Método genérico que se sobreescribe y permite jugar una carta en el tablero.
   * @param carta : Carta que se desea jugar en el tablero.
   */
  override def jugar(carta : Carta) : Unit = anadirCarta(carta)

}