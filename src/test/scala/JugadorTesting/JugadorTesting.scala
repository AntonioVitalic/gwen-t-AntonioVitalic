package cl.uchile.dcc
package JugadorTesting

class JugadorTesting(val Nombre: String, var SeccionTablero: String,
                     var ContadorGemas: int = 2, var MazoCartas: List[Carta],
                     var ManoCartas: List[Carta]) extends munit.FunSuite {
  // SeccionTablero no hay que testearlo en la entrega 1
  override def beforeEach(context: BeforeEach): Unit = {
    Mario = new JugadorTesting(Nombre = "Mario", SeccionTablero = "Cuerpo a cuerpo",
      ContadorGemas = 2, MazoCartas = List[Carta](), ManoCartas = List[Carta]())

    Luigi = new JugadorTesting(Nombre = "Luigi", SeccionTablero = "Cuerpo a cuerpo",
      ContadorGemas = 2, MazoCartas = List[Carta](), ManoCartas = List[Carta]())
  }

  test("equals") {
    assertEquals(Mario, Luigi)
    assertEquals(Mario, new JugadorTesting(Nombre = "Mario", SeccionTablero = "Cuerpo a cuerpo",
      ContadorGemas = 2, MazoCartas = List[Carta](), ManoCartas = List[Carta]()))
    assert(!Mario.equals(Luigi))
  }
}
