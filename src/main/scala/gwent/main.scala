package cl.uchile.dcc
package gwent

/** Trait (interfaz) que representa un jugador.
 *
 * Representa a un jugador, que puede ser un usuario o una computadora.
 * Dado que se programa en Scala 2, no lleva parámetros.
 *
 *
 * @author Antonio Vitalic
 */
trait Jugador{
}


/** Trait (interfaz) que representa las acciones que puede realizar un jugador.
 *
 * Representa las acciones que puede hacer un  jugador, como jugar una carta de su mano o
 * robar una carta del mazo.
 * Dado que se programa en Scala 2, no lleva parámetros.
 *
 *
 * @author Antonio Vitalic
 */
trait AccionesJugador {
  def JugarCartaMano(): Unit = {}

  def RobarCartaMazo(): Unit = {}
}

/** Una clase que representa un jugador (humano) llamado Usuario.
 *
 * El Usuario se define por su nombre, su seccion del tablero, su contador de gemas, su mazo de cartas
 *
 * @param Nombre: Nombre del usuario
 * @param SeccionTablero: Seccion del tablero en la que se encuentra el usuario
 * @param ContadorGemas: Cantidad de gemas que tiene el usuario
 * @param MazoCartas: Mazo de cartas que tiene el usuario
 * @param ManoCartas: Cartas que tiene en la mano el usuario
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
class Usuario(val Nombre: String, var SeccionTablero: String,
              var ContadorGemas: Int, var MazoCartas: List[Carta],
              var ManoCartas: List[Carta]) extends Jugador with AccionesJugador{
}


/** Una clase que representa un jugador (no humano) llamado Computadora.
 *
 * La Computadora se define por su nombre, su seccion del tablero, su contador de gemas, su mazo de cartas
 *
 * @param Nombre: Nombre de la computadora
 * @param SeccionTablero: Seccion del tablero en la que se encuentra la computadora
 * @param ContadorGemas: Cantidad de gemas que tiene la computadora
 * @param MazoCartas: Mazo de cartas que tiene la computadora
 * @param ManoCartas: Cartas que tiene en la mano la computadora
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
class Computadora(val Nombre: String, var SeccionTablero: String,
                  var ContadorGemas: Int, var MazoCartas: List[Carta],
                  var ManoCartas: List[Carta]) extends Jugador with AccionesJugador{
}

// Para la entrega 1, solo se pide la seccion 1.1 Jugador y 1.3 Cartas, por lo que
// no se implementarán los efectos de las cartas

/** Trait (interfaz) que representa las cartas.
 *
 * Representa las cartas del juego Gwent. Son utilizadas por Usuario y Computadora.
 * Dado que se programa en Scala 2, no lleva parámetros.
 *
 *
 * @author Antonio Vitalic
 */
trait Carta{
}

/** Una clase que representa una carta de unidad.
 *
 * La carta de unidad se define por su seccion del tablero y su efecto.
 *
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
class CartaUnidad(val SeccionTablero: String, val Efecto: String) extends Carta{
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
class CartaClima(val Efecto: String) extends Carta{
  // Efecto puede ser "Escarcha mordiente", "Niebla impenetrable", "Lluvia torrencial" o "Clima despejado"
}
