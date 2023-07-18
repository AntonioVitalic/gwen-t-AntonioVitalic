package cl.uchile.dcc
package gwent.Cartas

import cl.uchile.dcc.gwent.Jugadores.Jugador
import java.util.Objects

/** Clase que representa una carta de unidad de combate a distancia en el juego Gwen't.
 *
 * Una `CartaUnidadDistancia` es un tipo de [[AbstractCartaUnidad]].
 * Estas cartas representan tropas que participan en combates a distancia en el campo de batalla.
 * Según las reglas del juego, estas cartas solo se pueden colocar en la zona de combate a distancia.
 *
 * @constructor crea una nueva carta de combate a distancia con nombre, descripción y poder.
 * @param nombre       el nombre de la carta.
 * @param efecto       el efecto de la carta.
 * @param fuerza       el valor de fuerza inicial de la carta, que también corresponde a la
 *                    fuerza de la tropa que representa.
 *                    fuerza de la tropa que representa.
 * @example
 * {{{
 * val CartaUnidadDistancia = new CartaUnidadDistancia("Carta Distancia", "Refuerzo moral", 5)
 * val efecto = CartaUnidadDistancia.efecto()
 * println(s"La carta de unidad tiene efecto $efecto")
 * }}}
 * @author Antonio Vitalic
 */
class CartaUnidadDistancia (nombre: String, efecto: String, fuerza: Int)
  extends AbstractCartaUnidad (nombre, efecto, fuerza) {
  // Efecto puede ser "Refuerzo moral" o "Vínculo estrecho"

  /**
   * Método que permite comparar dos objetos de tipo CartaUnidadDistancia.
   *
   * @return
   */
  override def hashCode: Int = Objects.hash(nombre, efecto, fuerza)

  /**
   * Método que permite al jugador jugar una carta de unidad de combate a distancia.
   *
   * @param jugador: Jugador que juega la carta.
   */
  override def jugar(jugador: Jugador): Unit = {
    jugador.jugarEnDistancia(this)
  }
}
