package cl.uchile.dcc
package gwent

/** Una clase que representa un jugador (humano) llamado Usuario.
 *
 * El Usuario se define por su nombre, su seccion del tablero, su contador de gemas, su mazo de cartas
 *
 * @param _Nombre: Nombre del usuario
 * @param _SeccionTablero: Seccion del tablero en la que se encuentra el usuario
 * @param _ContadorGemas: Cantidad de gemas que tiene el usuario
 * @param _MazoCartas: Mazo de cartas que tiene el usuario
 * @param _ManoCartas: Cartas que tiene en la mano el usuario
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

class Usuario (val _Nombre: String, var _SeccionTablero: String, var _ContadorGemas: Int = 2,
               var _MazoCartas: List[Carta], var _ManoCartas: List[Carta]) extends Jugador with AccionesJugador{

  // Selecciona una carta de su mano y la coloca en el tablero para realizar una acción
  override def JugarCartaMano(): Unit = {}

  // Roba o toma una carta del mazo y la agrega en su mano
  override def RobarCartaMazo(): Unit = {}

  def Nombre(): String = _Nombre // getter para el nombre

  def SeccionTablero(): String = _SeccionTablero // getter para la seccion del tablero

  def ContadorGemas(): Int = _ContadorGemas  // getter para el contador de gemas

  def MazoCartas(): List[Carta] = _MazoCartas // getter para el mazo de cartas

  def ManoCartas(): List[Carta] = _ManoCartas // getter para la mano de cartas


  def SeccionTablero_=(SeccionTablero: String): Unit = _SeccionTablero = SeccionTablero // setter para la seccion del tablero

  def ContadorGemas_=(ContadorGemas: Int): Unit = _ContadorGemas = ContadorGemas // setter para el contador de gemas

}

