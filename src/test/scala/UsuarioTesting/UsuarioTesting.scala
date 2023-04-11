package cl.uchile.dcc
package UsuarioTesting
import gwent.{Carta, Jugador, Usuario}

class UsuarioTesting(var Nombre: String, var SeccionTablero: String,
                     var ContadorGemas : Int, var MazoCartas: List[Carta],
                     var ManoCartas: List[Carta]) extends munit.FunSuite with Jugador {
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
