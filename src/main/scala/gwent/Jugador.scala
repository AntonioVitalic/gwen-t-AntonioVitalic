package cl.uchile.dcc
package gwent

import java.util.Objects
import scala.util.Random.shuffle

/** Una clase que representa un jugador genérico (un humano o una "computadora") .
 *
 * El Jugador se define por su nombre, su sección del tablero, su contador de gemas, su mazo de cartas
 * y su mano de cartas
 *
 * @param _nombre: Nombre del Jugador
 * @param _seccionTablero: Seccion del tablero en la que se encuentra el Jugador
 * @param _contadorGemas: Cantidad de gemas que tiene el Jugador
 * @param _mazoCartas: Mazo de cartas que tiene el Jugador
 * @param _manoCartas: Cartas que tiene en la mano el Jugador
 *
 * @constructor Crea un nuevo Jugador con su nombre, seccion del tablero, contador de gemas, mazo de cartas
 *              y mano de cartas.
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

class Jugador (val _nombre: String, var _seccionTablero: AbstractTablero,
               var _contadorGemas: Int = 2,
               var _mazoCartas: List[Carta],
               var _manoCartas: List[Carta]) {
  assert(_contadorGemas >= 0, "La cantidad de gemas debe ser mayor o igual a 0")

  /**
   * Metodo que permite comparar dos objetos de tipo Jugador.
   * @return
   */
  override def hashCode: Int = Objects.hash(_nombre, _seccionTablero,
    _contadorGemas, _mazoCartas, _manoCartas)

  // Roba o toma una carta del mazo y la agrega en su mano
  //def robarCartaMazo(): Carta = { // solucion T1 ucursos
  //  val carta = _mazoCartas.head
  //  _mazoCartas = _mazoCartas.tail
  //  _manoCartas = carta :: _manoCartas
  //  carta
  //}

  /**
   * Método que permite al jugador robar una carta del mazo y agregarla a la mano.
   */
  def robarCartaMazo(): Unit = {
    if (MazoCartas().isEmpty) {
      _manoCartas = _manoCartas // no hace nada si el mazo esta vacio
      _mazoCartas = _mazoCartas // no hace nada si el mazo esta vacio
    }
    else {
      println("Robando carta del mazo")
      _manoCartas = _manoCartas.::(_mazoCartas.head) // agrega la primera carta del mazo a la mano
      _mazoCartas = _mazoCartas.tail // elimina la primera carta del mazo
    }
  }

  /**
   * Método que permite al jugador barajar su mazo de cartas.
   */
  def barajaMazoCartas(): Unit = {
    _mazoCartas = shuffle(_mazoCartas)
  }

  /**
   * Método que permite al jugador jugar una carta de su mano,
   * considerando el tablero en que jugará.
   * @param carta : Carta que se jugará.
   */
  def jugarCartaMano(carta : Carta): Unit = {
    val carta = _manoCartas.head
    _manoCartas = _manoCartas.tail
    _seccionTablero.anadirCarta(carta)
  }

  /**
   * Método getter para el nombre del jugador.
   * @return Nombre del jugador.
   */
  def Nombre(): String = _nombre

  /**
   * Método getter para la sección del tablero.
   * @return Sección del tablero.
   */
  def SeccionTablero(): AbstractTablero = _seccionTablero // getter para la seccion del tablero

  /**
   * Método getter para el contador de gemas.
   * @return Contador de gemas.
   */
  def ContadorGemas(): Int = _contadorGemas

  /**
   * Método getter para el mazo de cartas.
   * @return Mazo de cartas.
   */
  def MazoCartas(): List[Carta] = _mazoCartas

  /**
   * Método getter para la mano de cartas.
   * @return Mano de cartas.
   */
  def ManoCartas(): List[Carta] = _manoCartas

  /**
   *  Método setter para la sección del tablero.
   * @param ContadorGemas : Contador de gemas.
   */
  def ContadorGemas_=(ContadorGemas: Int): Unit = _contadorGemas = ContadorGemas
}