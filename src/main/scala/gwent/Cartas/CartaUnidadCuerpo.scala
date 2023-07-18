package cl.uchile.dcc
package gwent.Cartas

import cl.uchile.dcc.gwent.Jugadores.Jugador
import java.util.Objects

/** Clase que representa una carta de unidad de combate cuerpo a cuerpo en el juego Gwen't.
 *
 * Una `CartaUnidadCuerpo` es un tipo de [[AbstractCartaUnidad]].
 * Estas cartas representan tropas que participan en combate cuerpo a cuerpo en el campo de batalla.
 * Según las reglas del juego, estas cartas solo se pueden colocar en la zona de combate cuerpo a cuerpo.
 *
 * @constructor Crea una nueva `CartaUnidadCuerpo` con un nombre, descripción y fuerza.
 * @param nombre       el nombre de la carta.
 * @param efecto       el efecto de la carta.
 * @param fuerza       el valor de fuerza inicial de la carta, que también corresponde a la
 *                    fuerza de la tropa que representa.
 * {{{
 * val CartaUnidadCuerpo = new CartaUnidadCuerpo("Carta Cuerpo", "Refuerzo moral", 15)
 * val efecto = CartaUnidad.efecto()
 * println(s"La carta de unidad se encuentra en la seccion $efecto")
 * }}}
 * @author Antonio Vitalic
 */
class CartaUnidadCuerpo(nombre: String, efecto: String, fuerza: Int)
  extends AbstractCartaUnidad (nombre, efecto, fuerza) {
  /**
   * Metodo que permite comparar dos objetos de tipo CartaUnidadCuerpo.
   * @return
   */
  override def hashCode: Int = Objects.hash(nombre, efecto, fuerza)

  /**
   * Método que permite al jugador jugar una carta de unidad de combate cuerpo a cuerpo.
   * @param jugador: Jugador que juega la carta.
   */
  override def jugar(jugador: Jugador): Unit = {
    jugador.jugarEnCuerpo(this)
  }
}
