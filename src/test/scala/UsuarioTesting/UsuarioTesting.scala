package cl.uchile.dcc
package UsuarioTesting
import gwent.{Carta, Jugador, Usuario}


/** Una clase para testear la clase Usuario.
 *
 * El Usuario se define por su nombre, su seccion del tablero, su contador de gemas, su mazo de cartas
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
class UsuarioTesting extends munit.FunSuite{
  var Mario: Usuario = _
  var Luigi: Usuario = _

  // SeccionTablero no hay que testearlo en la entrega 1
  override def beforeEach(context: BeforeEach): Unit = {
    Mario = new Usuario(Nombre = "Mario", SeccionTablero = "Cuerpo a cuerpo",
      ContadorGemas = 2, MazoCartas = List[Carta](), ManoCartas = List[Carta]())
    Luigi = new Usuario(Nombre = "Luigi", SeccionTablero = "Cuerpo a cuerpo",
      ContadorGemas = 2, MazoCartas = List[Carta](), ManoCartas = List[Carta]())
  }

  test("Un Usuario debe tener nombre") {
    assertEquals(Mario.Nombre, "Mario")
    assertEquals(Luigi.Nombre, "Luigi")
  }

  test("Un Usuario debe tener ContadorGemas igual a 2") {
    assertEquals(Mario.ContadorGemas, 2)
    assertEquals(Luigi.ContadorGemas, 2)
  }
  test("Usuarios con distinto nombre (resto de parámetros iguales) son distintos") {
    assert(!Mario.equals(Luigi))
  }
}
