package cl.uchile.dcc
package CartaClimaTesting

import gwent.{Carta, CartaClima}

class CartaClimaTesting(val Efecto: String) extends munit.FunSuite with Carta {
  var Escarcha: CartaClima = _
  var Niebla: CartaClima = _

  // SeccionTablero no hay que testearlo en la entrega 1
  override def beforeEach(context: BeforeEach): Unit = {
    Escarcha = new CartaClima(Efecto = "Escarcha mordiente")
    Niebla = new CartaClima(Efecto = "Niebla impenetrable")
  }

  test("Una CartaClima debe tener Efecto") {
    assertEquals(Escarcha.Efecto, "Refuerzo moral")
    assertEquals(Niebla.Efecto, "Refuerzo moral")
  }
  test("CartaClima's con distinto Efecto son distintos") {
    assert(!Escarcha.equals(Niebla))
  }
}