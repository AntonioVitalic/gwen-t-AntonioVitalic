package cl.uchile.dcc
package gwent.Cartas

import cl.uchile.dcc.gwent.Jugadores.Jugador

/** Trait (interfaz) que representa las cartas.
 *
 * Una carta se caracteriza por su [[nombre]] y [[efecto]].
 * Esta interfaz sirve como una interfaz común para todos los tipos de cartas y asegura que cada carta,
 * independientemente de su subtipo específico, tendrá estas propiedades básicas.
 *
 * La palabra clave ``val`` en las declaraciones de propiedades indica que estas propiedades son
 * inmutables: una vez que se ha creado una carta con un nombre y una descripción determinados, estas
 * no puede ser cambiado.
 * Esto refleja el comportamiento real de las cartas de juego, que tienen nombres fijos y
 * efectos impresas en ellos.
 *
 * El contenido real de estas propiedades, así como cualquier propiedad adicional o
 * comportamientos, se definirán en las clases concretas que amplían esta interfaz.
 *
 * @author Antonio Vitalic
 */
trait Carta {
  def eliminaEfectoClima(): U_ = ???

  /** El nombre de la carta.
   * Es una propiedad inmutable.
   */
  def nombre(): String

  /** Una descripción del efecto de la carta.
   * Es una propiedad inmutable.
   */
  def efecto(): String

  /** Método que permite jugar una carta.
   * @param jugador: Jugador que jugará la carta.
   */
  def jugar(jugador: Jugador): Unit

}
