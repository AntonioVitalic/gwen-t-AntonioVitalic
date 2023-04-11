package cl.uchile.dcc
package ComputadoraTesting

import gwent.{Carta, Jugador, Computadora}

class ComputadoraTesting(var Nombre: String, var SeccionTablero: String,
                         var ContadorGemas : Int, var MazoCartas: List[Carta],
                         var ManoCartas: List[Carta]) extends munit.FunSuite with Jugador {
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

