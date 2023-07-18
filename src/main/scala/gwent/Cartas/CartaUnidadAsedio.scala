package cl.uchile.dcc
package gwent.Cartas

import cl.uchile.dcc.gwent.Jugadores.Jugador
import java.util.Objects

/** Clase que representa una carta de unidad de combate de asedio en el juego Gwen't.
 *
 * Una `CartaUnidadAsedio` es un tipo de [[AbstractCartaUnidad]].
 * Estas cartas representan maquinaria de asedio usada en el campo de batalla.
 * Según las reglas del juego, estas cartas solo se pueden colocar en la zona de combate de asedio.
 *
 * @constructor crea una nueva carta de combate de asedio con nombre, descripción y fuerza.
 * @param nombre       el nombre de la carta.
 * @param efecto       el efecto de la carta.
 * @param fuerza       el valor de fuerza inicial de la carta, que también corresponde al asedio
 *                    fuerza de la maquinaria.
 * @example
 * {{{
 * val CartaUnidadAsedio = new CartaUnidadAsedio("Carta Asedio", "Refuerzo moral", 10)
 * val efecto = CartaUnidad.efecto()
 * println(s"La carta de unidad se encuentra en la seccion $CuerpoACuerpo")
 * }}}
 * @author Antonio Vitalic
 */
class CartaUnidadAsedio (nombre : String, efecto : String, fuerza : Int)
  extends AbstractCartaUnidad (nombre, efecto, fuerza) {
  // Efecto puede ser "Refuerzo moral" o "Vínculo estrecho"

  /**
   * Metodo que permite comparar dos objetos de tipo CartaUnidadAsedio.
   * @return
   */
  override def hashCode: Int = Objects.hash(nombre, efecto, fuerza)

  /**
   * Método que permite al jugador jugar una carta de unidad de combate de asedio.
   * @param jugador: Jugador que juega la carta.
   */
  override def jugar(jugador: Jugador): Unit = {
    jugador.jugarEnAsedio(this)
  }
}
