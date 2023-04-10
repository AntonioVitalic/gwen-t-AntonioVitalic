package cl.uchile.dcc
package JugadorTesting

import gwent.{Carta, Jugador, Usuario}

class UsuarioTesting(var Nombre: String, var SeccionTablero: String,
                     var ContadorGemas: Int = 2, var MazoCartas: List[Carta],
                     var ManoCartas: List[Carta]) extends munit.FunSuite with Jugador {
  var Mario: Usuario = null
  var Luigi: Usuario = null
  var Mario2: Usuario = new Usuario(Nombre = "Mario", SeccionTablero = "Cuerpo a cuerpo",
    ContadorGemas = 2, MazoCartas = List[Carta](), ManoCartas = List[Carta]())
  // SeccionTablero no hay que testearlo en la entrega 1
  override def beforeEach(context: BeforeEach): Unit = {
    Mario = new Usuario(Nombre = "Mario", SeccionTablero = "Cuerpo a cuerpo",
      ContadorGemas = 2, MazoCartas = List[Carta](), ManoCartas = List[Carta]())

    Luigi = new Usuario(Nombre = "Luigi", SeccionTablero = "Cuerpo a cuerpo",
      ContadorGemas = 2, MazoCartas = List[Carta](), ManoCartas = List[Carta]())
  }

  test("Usuarios con distinto nombre (resto de parámetros iguales) son distintos") {
    assertEquals(Mario, Luigi)
    assertEquals(Mario, Mario2)
    assert(!Mario.equals(Luigi))
  }
}
