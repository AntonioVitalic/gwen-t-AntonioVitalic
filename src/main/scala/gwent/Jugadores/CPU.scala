package cl.uchile.dcc
package gwent.Jugadores

import gwent.Tableros.Tablero

import cl.uchile.dcc.gwent.Cartas.{Carta, CartaClima, CartaUnidadAsedio, CartaUnidadCuerpo, CartaUnidadDistancia}

import scala.collection.mutable.ListBuffer

/** Una clase que representa un jugador no humano manejado por la computadora "CPU" .
 *
 * La CPU se define por su nombre, su sección del tablero, su contador de gemas, su mazo de cartas
 * y su mano de cartas
 *
 * @param _nombre: Nombre de la CPU
 * @param _seccionTablero: Seccion del tablero en la que se encuentra la CPU
 * @param _contadorGemas: Cantidad de gemas que tiene la CPU
 * @param _mazoCartas: Mazo de cartas que tiene la CPU
 * @param _manoCartas: Cartas que tiene en la mano la CPU
 *
 * @constructor Crea una nueva CPU con su nombre, seccion del tablero, contador de gemas, mazo de cartas
 *              y mano de cartas.
 *
 * @example
 * {{{
 * val CPU = new CPU("CPU", "Cuerpo a cuerpo", 2, List[Carta](), List[Carta]())
 * val Nombre = CPU.nombre()
 * println(s"El nombre del CPU es $nombre")
 * }}}
 *
 * @author Antonio Vitalic
 */

class CPU (_nombre: String, _seccionTablero: Tablero, _mazoCartas: ListBuffer[Carta],
           _manoCartas: ListBuffer[Carta]) extends Jugador (_nombre, _seccionTablero,
  _mazoCartas, _manoCartas) {

  /**
   * Método que permite a la CPU jugar una carta de unidad de tipo Asedio.
   * @param carta: Carta de Unidad de tipo Asedio que se jugará.
   */
  override def jugarEnAsedio(carta: CartaUnidadAsedio): Unit = {
    _seccionTablero.agregarEnAsedioCPU(carta)
  }

  /**
   * Método que permite a la CPU jugar una carta de unidad de tipo Cuerpo.
   * @param carta: Carta de Unidad de tipo Cuerpo que se jugará.
   */
  override def jugarEnCuerpo(carta: CartaUnidadCuerpo): Unit = {
    _seccionTablero.agregarEnCuerpoCPU(carta)
  }

  /**
   * Método que permite a la CPU jugar una carta de unidad de tipo Distancia.
   * @param carta: Carta de Unidad de tipo Distancia que se jugará.
   */
  override def jugarEnDistancia(carta: CartaUnidadDistancia): Unit = {
    _seccionTablero.agregarEnDistanciaCPU(carta)
  }

  /**
   * Método que permite a la CPU jugar una carta de tipo Clima.
   * @param carta: Carta de tipo Clima que se jugará.
   */
  override def jugarEnClima(carta: CartaClima): Unit = {
    _seccionTablero.agregarEnClima(carta)
  }
}
