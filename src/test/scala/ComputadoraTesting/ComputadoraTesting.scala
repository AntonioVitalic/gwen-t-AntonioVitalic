package cl.uchile.dcc
package ComputadoraTesting

import gwent.{Carta, Jugador, Computadora}


/** Una clase para testear la clase Computadora.
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
class ComputadoraTesting extends munit.FunSuite with Jugador {
  var Windows: Computadora = _
  var Mac: Computadora = _

  // SeccionTablero no hay que testearlo en la entrega 1
  override def beforeEach(context: BeforeEach): Unit = {
    Windows = new Computadora(Nombre = "Windows", SeccionTablero = "Cuerpo a cuerpo",
      ContadorGemas = 2, MazoCartas = List[Carta](), ManoCartas = List[Carta]())
    Mac = new Computadora(Nombre = "Mac", SeccionTablero = "Cuerpo a cuerpo",
      ContadorGemas = 2, MazoCartas = List[Carta](), ManoCartas = List[Carta]())
  }

  test("Una Computadora debe tener nombre") {
    assertEquals(Windows.Nombre, "Windows")
    assertEquals(Mac.Nombre, "Mac")
  }

  test("Una Computadora debe tener ContadorGemas igual a 2") {
    assertEquals(Windows.ContadorGemas, 2)
    assertEquals(Mac.ContadorGemas, 2)
  }
  test("Computadora's con distinto nombre (resto de parámetros iguales) son distintos") {
    assert(!Windows.equals(Mac))
  }
}

