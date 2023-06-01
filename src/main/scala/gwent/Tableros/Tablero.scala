package cl.uchile.dcc
package gwent.Tableros

import gwent.Cartas.Carta

/**
 * Interfaz que representa un tablero de juego.
 *
 * @author Antonio Vitalic
 */
trait Tablero{
  /**
   * Método genérico que permite jugar una carta en el tablero.
   * @param carta : Carta que se desea jugar en el tablero.
   */
  def jugar(carta : Carta): Unit // inspirado en el hint del foro de ucursos
}
