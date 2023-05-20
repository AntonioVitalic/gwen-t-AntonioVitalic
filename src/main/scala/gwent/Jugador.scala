package cl.uchile.dcc
package gwent

import java.util.Objects
import scala.util.Random.shuffle

/** Una clase que representa un jugador genérico (un humano o una "computadora") .
 *
 * El Jugador se define por su nombre, su seccion del tablero, su contador de gemas, su mazo de cartas
 *
 * @param _nombre: Nombre del Jugador
 * @param _seccionTablero: Seccion del tablero en la que se encuentra el Jugador
 * @param _contadorGemas: Cantidad de gemas que tiene el Jugador
 * @param _mazoCartas: Mazo de cartas que tiene el Jugador
 * @param _manoCartas: Cartas que tiene en la mano el Jugador
 *
 * @constructor Crea un nuevo Jugador con su nombre, seccion del tablero, contador de gemas, mazo de cartas y mano de cartas.
 *
 * @example
 * {{{
 * val Jugador = new Jugador("Jugador", "Cuerpo a cuerpo", 2, List[Carta](), List[Carta]())
 * val Nombre = Jugador.nombre()
 * println(s"El nombre del Jugador es $nombre")
 * }}}
 *
 * @author Antonio Vitalic
 */

class Jugador (val _nombre: String, var _seccionTablero: String,
               var _contadorGemas: Int = 2,
               private var _mazoCartas: List[Carta],
               private var _manoCartas: List[Carta]) {

  override def hashCode: Int = Objects.hash(_nombre, _seccionTablero,
    _contadorGemas, _mazoCartas, _manoCartas)


  // Selecciona una carta de su mano y la coloca en el tablero para realizar una acción
  // def JugarCartaMano(): Unit = {} por implementar

  // Roba o toma una carta del mazo y la agrega en su mano
  def robarCartaMazo(): Carta = {
    val carta = _mazoCartas.head
    _mazoCartas = _mazoCartas.tail
    _manoCartas = carta :: _manoCartas
    carta
  }

  def barajaMazoCartas(): Unit = {
    _mazoCartas = shuffle(_mazoCartas)
  }

  def Nombre(): String = _nombre // getter para el nombre

  def SeccionTablero(): String = _seccionTablero // getter para la seccion del tablero

  def ContadorGemas(): Int = _contadorGemas  // getter para el contador de gemas

  def MazoCartas(): List[Carta] = _mazoCartas // getter para el mazo de cartas

  def ManoCartas(): List[Carta] = _manoCartas // getter para la mano de cartas


  def SeccionTablero_=(SeccionTablero: String): Unit = _seccionTablero = SeccionTablero // setter para la seccion del tablero

  def ContadorGemas_=(ContadorGemas: Int): Unit = _contadorGemas = ContadorGemas // setter para el contador de gemas

}