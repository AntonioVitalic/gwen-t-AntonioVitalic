package cl.uchile.dcc
package gwent

import java.util.Objects
import scala.util.Random.shuffle
/** Una clase que representa un jugador (humano) llamado Usuario.
 *
 * El Usuario se define por su nombre, su seccion del tablero, su contador de gemas, su mazo de cartas
 *
 * @param _nombre: Nombre del usuario
 * @param _seccionTablero: Seccion del tablero en la que se encuentra el usuario
 * @param _contadorGemas: Cantidad de gemas que tiene el usuario
 * @param _mazoCartas: Mazo de cartas que tiene el usuario
 * @param _manoCartas: Cartas que tiene en la mano el usuario
 *
 * @constructor Crea un nuevo Usuario con su nombre, seccion del tablero, contador de gemas, mazo de cartas y mano de cartas.
 *
 * @example
 * {{{
 * val Usuario = new Usuario("Usuario", "Cuerpo a cuerpo", 2, List[Carta](), List[Carta]())
 * val Nombre = Usuario.Nombre()
 * println(s"El nombre del usuario es $Nombre")
 * }}}
 *
 * @author Antonio Vitalic
 */

class Usuario (val _nombre: String, var _seccionTablero: String,
               var _contadorGemas: Int = 2,
               private var _mazoCartas: List[Carta],
               private var _manoCartas: List[Carta])
  extends Jugador with AccionesJugador{

  override def hashCode: Int = Objects.hash(_nombre, _seccionTablero,
    _contadorGemas, _mazoCartas, _manoCartas)


  // Selecciona una carta de su mano y la coloca en el tablero para realizar una acción
  // override def JugarCartaMano(): Unit = {} por implementar

  // Roba o toma una carta del mazo y la agrega en su mano
  override def robarCartaMazo(): Carta = {
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

