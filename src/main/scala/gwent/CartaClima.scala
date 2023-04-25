package cl.uchile.dcc
package gwent

import java.util.Objects

/** Una clase que representa una carta de clima.
 *
 * La carta de clima se define por su efecto.
 *
 * @param Efecto: Efecto de la carta
 * @constructor Crea una nueva CartaClima con su efecto.
 * @example
 * {{{
 * val CartaClima = new CartaClima("Escarcha mordiente")
 * val Efecto = CartaClima.Efecto()
 * println(s"La carta de clima tiene el efecto $Efecto")
 * }}}
 * @author Antonio Vitalic
 */

class CartaClima (val Nombre: String, val SeccionTablero: String, val Efecto: String) extends Carta{
  // Efecto puede ser "Escarcha mordiente", "Niebla impenetrable", "Lluvia torrencial" o "Clima despejado"
  // SeccionTablero sólo es "Clima"
  override def hashCode: Int = Objects.hash(Nombre, SeccionTablero, Efecto)


}
