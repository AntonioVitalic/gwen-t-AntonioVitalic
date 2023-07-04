package cl.uchile.dcc
package gwent

import cl.uchile.dcc.gwent.Cartas.{Carta, CartaClima, CartaUnidadAsedio, CartaUnidadCuerpo, CartaUnidadDistancia}
import cl.uchile.dcc.gwent.Tableros.AbstractTablero

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
               private var _mazoCartas: List[Carta],
               private var _manoCartas: List[Carta]) {
  assert(_contadorGemas >= 0, "La cantidad de gemas debe ser mayor o igual a 0")

  /**
   * Metodo que permite comparar dos objetos de tipo Jugador.
   * @return
   */
  override def hashCode: Int = Objects.hash(_nombre, _seccionTablero,
    _contadorGemas, _mazoCartas, _manoCartas)

  /**
   * Método que permite al jugador robar una carta del mazo y agregarla a la mano.
   */
  def robarCartaMazo(): Carta = {
      println("Robando carta del mazo")
      val carta = _mazoCartas.head
      _mazoCartas = _mazoCartas.tail
      _manoCartas = carta :: _manoCartas
      carta
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
    carta.jugar(this)
  }

  def jugarEnAsedio(carta: CartaUnidadAsedio): Unit = {
    _seccionTablero.agregarAAsedio(carta)
  }

  def jugarEnCuerpo(carta: CartaUnidadCuerpo): Unit = {
    _seccionTablero.agregarACuerpo(carta)
  }

  def jugarEnDistancia(carta: CartaUnidadDistancia): Unit = {
    _seccionTablero.agregarADistancia(carta)
  }

  def jugarEnClima(carta: CartaClima): Unit = {
    _seccionTablero.agregarAClima(carta)
  }

  // Getters

  /**
   * Método getter para el nombre del jugador.
   * @return Nombre del jugador.
   */
  def Nombre(): String = _nombre

  /**
   * Método getter para la sección del tablero.
   * @return Sección del tablero.
   */
  def SeccionTablero(): AbstractTablero = _seccionTablero

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

  // Setters

  /**
   * Método setter para la sección del tablero.
   * @param SeccionTablero : Sección del tablero.
   */
  def SeccionTablero_=(SeccionTablero: AbstractTablero): Unit = _seccionTablero = SeccionTablero

  /**
   * Método setter para la el contador de gemas.
   *
   * @param ContadorGemas : Contador de gemas.
   */
  def ContadorGemas_=(ContadorGemas: Int): Unit = _contadorGemas = ContadorGemas

  /**
   * Método setter para el mazo de cartas.
   * @param MazoCartas : Mazo de cartas.
   */
  def MazoCartas_=(MazoCartas: List[Carta]): Unit = _mazoCartas = MazoCartas

  /**
   * Método setter para la mano de cartas.
   * @param ManoCartas : Mano de cartas.
   */
  def ManoCartas_=(ManoCartas: List[Carta]): Unit = _manoCartas = ManoCartas
}