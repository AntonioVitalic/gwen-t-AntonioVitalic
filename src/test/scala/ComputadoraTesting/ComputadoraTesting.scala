package cl.uchile.dcc
package ComputadoraTesting

import gwent.{Carta, Computadora}


/** Una clase para testear la clase Computadora.
 *
 * La Computadora se define por su nombre, su seccion del tablero, su contador de gemas, su mazo de cartas
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
class ComputadoraTesting extends munit.FunSuite {
  var Windows: Computadora = _
  var Mac: Computadora = _

  // SeccionTablero no hay que testearlo en la entrega 1
  override def beforeEach(context: BeforeEach): Unit = {
    Windows = new Computadora(_Nombre = "Windows", _SeccionTablero = "Cuerpo a cuerpo",
      _ContadorGemas = 2, _MazoCartas = List[Carta](), _ManoCartas = List[Carta]())
    Mac = new Computadora(_Nombre = "Mac", _SeccionTablero = "Cuerpo a cuerpo",
      _ContadorGemas = 2, _MazoCartas = List[Carta](), _ManoCartas = List[Carta]())
  }

  test("Una Computadora debe tener nombre") {
    assertEquals(Windows._Nombre, "Windows")
    assertEquals(Mac._Nombre, "Mac")
  }

  test("Una Computadora debe tener ContadorGemas igual a 2") {
    assertEquals(Windows._ContadorGemas, 2)
    assertEquals(Mac._ContadorGemas, 2)
  }
  test("Computadora's con distinto nombre (resto de parámetros iguales) son distintos") {
    assert(!Windows.equals(Mac))
  }
}

