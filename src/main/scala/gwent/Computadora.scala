package cl.uchile.dcc
package gwent

import java.util.Objects

/** Una clase que representa un jugador (no humano) llamado Computadora.
 *
 * La Computadora se define por su nombre, su seccion del tablero, su contador de gemas, su mazo de cartas
 *
 * @param _Nombre: Nombre de la computadora
 * @param _SeccionTablero: Seccion del tablero en la que se encuentra la computadora
 * @param _ContadorGemas: Cantidad de gemas que tiene la computadora
 * @param _MazoCartas: Mazo de cartas que tiene la computadora
 * @param _ManoCartas: Cartas que tiene en la mano la computadora
 * @constructor Crea una nueva Computadora con su nombre, seccion del tablero, contador de gemas, mazo de cartas y mano de cartas.
 * @example
 * {{{
 * val Computadora = new Computadora("Computadora", "Cuerpo a cuerpo", 2, List[Carta](), List[Carta]())
 * val Computadora = Computadora.Nombre()
 * println(s"El nombre de la computadora es $Nombre")
 * }}}
 * @author Antonio Vitalic
 */

class Computadora (val _Nombre: String, var _SeccionTablero: String, var _ContadorGemas: Int = 2,
                   var _MazoCartas: List[Carta], var _ManoCartas: List[Carta]) extends Jugador with AccionesJugador{

  override def hashCode: Int = Objects.hash(_Nombre, _SeccionTablero, _ContadorGemas, _MazoCartas, _ManoCartas)


  // Selecciona una carta de su mano y la coloca en el tablero para realizar una acción
  // override def JugarCartaMano(): Unit = {} por implementar

  // Roba o toma una carta del mazo y la agrega en su mano
  override def RobarCartaMazo(): Unit = {
    _ManoCartas = _ManoCartas.::(_MazoCartas.head) // agrega la primera carta del mazo a la mano
    _MazoCartas = _MazoCartas.tail // elimina la primera carta del mazo
  }

  def Nombre(): String = _Nombre // getter para el nombre

  def SeccionTablero(): String = _SeccionTablero // getter para la seccion del tablero

  def ContadorGemas(): Int = _ContadorGemas // getter para el contador de gemas

  def MazoCartas(): List[Carta] = _MazoCartas // getter para el mazo de cartas

  def ManoCartas(): List[Carta] = _ManoCartas // getter para la mano de cartas


  def SeccionTablero_=(SeccionTablero: String): Unit = _SeccionTablero = SeccionTablero // setter para la seccion del tablero

  def ContadorGemas_=(ContadorGemas: Int): Unit = _ContadorGemas = ContadorGemas // setter para el contador de gemas

}
