package cl.uchile.dcc
package gwent

import java.util.Objects

/** Una clase que representa una carta de unidad.
 *
 * La carta de unidad se define por su seccion del tablero y su efecto.
 *
 * @param Nombre: Nombre de la carta
 * @param SeccionTablero: Seccion del tablero en la que se encuentra la carta
 * @param Efecto: Efecto de la carta
 * @constructor Crea una nueva CartaUnidad con su seccion del tablero y su efecto.
 * @example
 * {{{
 * val CartaUnidad = new CartaUnidad("Zona de combate cuerpo a cuerpo", "Refuerzo moral")
 * val CuerpoACuerpo = CartaUnidad.SeccionTablero()
 * println(s"La carta de unidad se encuentra en la seccion $CuerpoACuerpo")
 * }}}
 * @author Antonio Vitalic
 */

class CartaUnidad (val Nombre: String, val SeccionTablero: String, val Efecto: String) extends Carta{
  // SeccionTablero puede ser "Zona de combate cuerpo a cuerpo", "Zona de combate distancia" o "Zona de asedio"
  // Efecto puede ser "Refuerzo moral" o "Vinculo estrecho"
  override def hashCode: Int = Objects.hash(Nombre, SeccionTablero, Efecto)


}
