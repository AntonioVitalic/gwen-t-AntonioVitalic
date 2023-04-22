package cl.uchile.dcc
package gwent

/** Trait (interfaz) que representa un jugador.
 *
 * Representa a un jugador, que puede ser un usuario o una computadora.
 * Dado que se programa en Scala 2, no lleva parámetros.
 *
 * Se declaran los parámetros que debe tener un jugador, los cuales son:
 * Nombre: Nombre del jugador
 * SeccionTablero: Seccion del tablero en la que se encuentra el jugador
 * ContadorGemas: Cantidad de gemas que tiene el jugador
 * MazoCartas: Mazo de cartas que tiene el jugador
 * ManoCartas: Cartas que tiene en la mano el jugador
 *
 * Este trait luego de hereda en la clase Usuario y en la clase Computadora, donde
 * se implementan los métodos usando override.
 *
 * @author Antonio Vitalic
 */
trait Jugador{
  def Nombre(): String

  def SeccionTablero(): String

  def ContadorGemas(): Int

  def MazoCartas(): List[Carta]

  def ManoCartas(): List[Carta]
}




/** Trait (interfaz) que representa las acciones que puede realizar un jugador.
 *
 * Representa las acciones que puede hacer un  jugador, como jugar una carta de su mano o
 * robar una carta del mazo.
 * Dado que se programa en Scala 2, no lleva parámetros.
 *
 * Se declaran los métodos que debe tener un jugador, los cuales son:
 * JugarCartaMano: Juega una carta de la mano del jugador
 * RobarCartaMazo: Roba una carta del mazo del jugador
 *
 * Este trait luego de hereda en la clase Usuario y en la clase Computadora, donde
 * se implementan los métodos usando override.
 *
 * @author Antonio Vitalic
 */
trait AccionesJugador {
  def JugarCartaMano(): Unit

  def RobarCartaMazo(): Unit
}

// Para la Tarea 1, solo se pide la seccion 1.1 Jugador y 1.3 Cartas, a excepción
// de las funcionalidades que involucren al Tablero y/o las Clasificaciones de las Cartas

/** Trait (interfaz) que representa las cartas.
 *
 * Representa las cartas del juego Gwent. Son utilizadas por Usuario y Computadora.
 * Dado que se programa en Scala 2, no lleva parámetros.
 *
 * Se declaran los parámetros que debe tener una carta, los cuales son:
 * Nombre: Nombre de la carta
 * SeccionTablero: Seccion del tablero en la que se encuentra la carta
 * Efecto: Efecto de la carta
 *
 * Este trait luego de hereda en la clase CartaUnidad y en la clase CartaEspecial, donde
 * se implementan los métodos usando override.
 *
 * @author Antonio Vitalic
 */
trait Carta{
  def Nombre(): String

  def SeccionTablero(): String

  def Efecto(): String
}

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

  override def JugarCartaMano(): Unit = {}

  override def RobarCartaMazo(): Unit = {}

  def Nombre(): String = _Nombre // getter para el nombre

  def SeccionTablero(): String = _SeccionTablero // getter para la seccion del tablero

  def ContadorGemas(): Int = _ContadorGemas  // getter para el contador de gemas

  def MazoCartas(): List[Carta] = _MazoCartas // getter para el mazo de cartas

  def ManoCartas(): List[Carta] = _ManoCartas // getter para la mano de cartas


  def SeccionTablero_=(SeccionTablero: String): Unit = _SeccionTablero = SeccionTablero // setter para la seccion del tablero

  def ContadorGemas_=(ContadorGemas: Int): Unit = _ContadorGemas = ContadorGemas // setter para el contador de gemas


}


/** Una clase que representa un jugador (no humano) llamado Computadora.
 *
 * La Computadora se define por su nombre, su seccion del tablero, su contador de gemas, su mazo de cartas
 *
 * @param _Nombre: Nombre de la computadora
 * @param _SeccionTablero: Seccion del tablero en la que se encuentra la computadora
 * @param _ContadorGemas: Cantidad de gemas que tiene la computadora
 * @param _MazoCartas: Mazo de cartas que tiene la computadora
 * @param _ManoCartas: Cartas que tiene en la mano la computadora
 *
 * @constructor Crea una nueva Computadora con su nombre, seccion del tablero, contador de gemas, mazo de cartas y mano de cartas.
 *
 * @example
 * {{{
 * val Computadora = new Computadora("Computadora", "Cuerpo a cuerpo", 2, List[Carta](), List[Carta]())
 * val Computadora = Computadora.Nombre()
 * println(s"El nombre de la computadora es $Nombre")
 * }}}
 *
 * @author Antonio Vitalic
 */
class Computadora (val _Nombre: String, var _SeccionTablero: String, var _ContadorGemas: Int,
                   var _MazoCartas: List[Carta], var _ManoCartas: List[Carta]) extends Jugador with AccionesJugador{

  override def JugarCartaMano(): Unit = {}

  override def RobarCartaMazo(): Unit = {}

  def Nombre(): String = _Nombre // getter para el nombre

  def SeccionTablero(): String = _SeccionTablero // getter para la seccion del tablero

  def ContadorGemas(): Int = _ContadorGemas // getter para el contador de gemas

  def MazoCartas(): List[Carta] = _MazoCartas // getter para el mazo de cartas

  def ManoCartas(): List[Carta] = _ManoCartas // getter para la mano de cartas


  def SeccionTablero_=(SeccionTablero: String): Unit = _SeccionTablero = SeccionTablero // setter para la seccion del tablero

  def ContadorGemas_=(ContadorGemas: Int): Unit = _ContadorGemas = ContadorGemas // setter para el contador de gemas

}

/** Una clase que representa una carta de unidad.
 *
 * La carta de unidad se define por su seccion del tablero y su efecto.
 *
 * @param Nombre: Nombre de la carta
 * @param SeccionTablero: Seccion del tablero en la que se encuentra la carta
 * @param Efecto: Efecto de la carta
 *
 * @constructor Crea una nueva CartaUnidad con su seccion del tablero y su efecto.
 *
 * @example
 * {{{
 * val CartaUnidad = new CartaUnidad("Zona de combate cuerpo a cuerpo", "Refuerzo moral")
 * val CuerpoACuerpo = CartaUnidad.SeccionTablero()
 * println(s"La carta de unidad se encuentra en la seccion $CuerpoACuerpo")
 * }}}
 *
 * @author Antonio Vitalic
 */
class CartaUnidad (val Nombre: String, val SeccionTablero: String, val Efecto: String) extends Carta{
  // SeccionTablero puede ser "Zona de combate cuerpo a cuerpo", "Zona de combate distancia" o "Zona de asedio"
  // Efecto puede ser "Refuerzo moral" o "Vinculo estrecho"

}

/** Una clase que representa una carta de clima.
 *
 * La carta de clima se define por su efecto.
 *
 * @param Efecto: Efecto de la carta
 *
 * @constructor Crea una nueva CartaClima con su efecto.
 *
 * @example
 * {{{
 * val CartaClima = new CartaClima("Escarcha mordiente")
 * val Efecto = CartaClima.Efecto()
 * println(s"La carta de clima tiene el efecto $Efecto")
 * }}}
 *
 * @author Antonio Vitalic
 */
class CartaClima (val Nombre: String, val SeccionTablero: String, val Efecto: String) extends Carta{
  // Efecto puede ser "Escarcha mordiente", "Niebla impenetrable", "Lluvia torrencial" o "Clima despejado"
  // SeccionTablero sólo es "Clima"

}
