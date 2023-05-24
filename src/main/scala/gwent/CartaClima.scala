package cl.uchile.dcc
package gwent

import java.util.Objects

/** Clase que representa una carta de clima en el juego Gwen't.
 *
 * Una `CartaClima` es un tipo de [[Carta]] que se puede colocar en la zona de clima.
 * Estas cartas tienen la capacidad de afectar el campo de batalla y proporcionar ventajas o
 * desventajas para los jugadores, según el tipo de clima que se haya elegido.
 *
 * @constructor Crea una nueva CartaClima con su efecto.
 * @param nombre: Nombre de la carta
 * @param efecto: Efecto de la carta
 * @example
 * {{{
 * val CartaClima = new CartaClima("Carta", "Escarcha mordiente")
 * val efecto = CartaClima.efecto()
 * println(s"La carta de clima tiene el efecto $efecto")
 * }}}
 * @author Antonio Vitalic
 */

class CartaClima (val nombre: String, val efecto: String) extends Carta{
  // Efecto puede ser "Escarcha mordiente", "Niebla impenetrable", "Lluvia torrencial" o "Clima despejado"

  /**
   * Método que permite comparar dos objetos de tipo CartaClima.
   * @return
   */
  override def hashCode: Int = Objects.hash(nombre, efecto)

  /**
   * Método que permite añadir una carta de clima al tablero de clima.
   * @param tablero
   */
  def anadirCartaClima(tablero: AbstractTablero): Unit = {
    tablero.anadirCarta(this)
    println("Se añadió una Carta de clima a la zona de clima.")
  }

}
