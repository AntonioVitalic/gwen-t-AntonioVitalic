package cl.uchile.dcc
package gwent.Jugadores

import gwent.Cartas.{Carta, CartaClima, CartaUnidadAsedio, CartaUnidadCuerpo, CartaUnidadDistancia}
import gwent.Tableros.Tablero

import scala.collection.mutable.ListBuffer

/** Una clase que representa un jugador humano "Usuario" .
 *
 * El Usuario se define por su nombre, su sección del tablero, su contador de gemas, su mazo de cartas
 * y su mano de cartas
 *
 * @param _nombre: Nombre del Usuario
 * @param _seccionTablero: Seccion del tablero en la que se encuentra el Usuario
 * @param _contadorGemas: Cantidad de gemas que tiene el Usuario
 * @param _mazoCartas: Mazo de cartas que tiene el Usuario
 * @param _manoCartas: Cartas que tiene en la mano el Usuario
 *
 * @constructor Crea un nuevo Usuario con su nombre, seccion del tablero, contador de gemas, mazo de cartas
 *              y mano de cartas.
 *
 * @example
 * {{{
 * val Usuario = new Usuario("Usuario", "Cuerpo a cuerpo", 2, List[Carta](), List[Carta]())
 * val Nombre = Usuario.nombre()
 * println(s"El nombre del Usuario es $nombre")
 * }}}
 *
 * @author Antonio Vitalic
 */

class Usuario (_nombre: String, _seccionTablero: Tablero, _contadorGemas: Int, _mazoCartas: ListBuffer[Carta],
               _manoCartas: ListBuffer[Carta]) extends Jugador (_nombre, _seccionTablero, _contadorGemas,
  _mazoCartas, _manoCartas) {

  /**
   * Método que permite al usuario jugar una carta de unidad de tipo Asedio.
   * @param carta: Carta de Unidad de tipo Asedio que se jugará.
   */
  override def jugarEnAsedio(carta: CartaUnidadAsedio): Unit = {
    _seccionTablero.agregarEnAsedioUsuario(carta)
  }

  /**
   * Método que permite al usuario jugar una carta de unidad de tipo Cuerpo.
   * @param carta: Carta de Unidad de tipo Cuerpo que se jugará.
   */
  override def jugarEnCuerpo(carta: CartaUnidadCuerpo): Unit = {
    _seccionTablero.agregarEnCuerpoUsuario(carta)
  }

  /**
   * Método que permite al usuario jugar una carta de unidad de tipo Distancia.
   * @param carta: Carta de Unidad de tipo Distancia que se jugará.
   */
  override def jugarEnDistancia(carta: CartaUnidadDistancia): Unit = {
    _seccionTablero.agregarEnDistanciaUsuario(carta)
  }

  /**
   * Método que permite al usuario jugar una carta de clima.
   * @param carta: Carta de Clima que se jugará.
   */
  override def jugarEnClima(carta: CartaClima): Unit = {
    _seccionTablero.agregarEnClima(carta)
  }

}
