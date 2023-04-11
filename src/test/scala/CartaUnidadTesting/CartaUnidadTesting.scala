package cl.uchile.dcc
package CartaUnidadTesting

import gwent.{Carta, CartaUnidad, Usuario}

class CartaUnidadTesting(val SeccionTablero: String, val Efecto: String) extends munit.FunSuite with Carta {
  var Refuerzo1: CartaUnidad = _
  var Refuerzo2: CartaUnidad = _

  var Cuerpo1: CartaUnidad = _
  var Cuerpo2: CartaUnidad = _

  // SeccionTablero no hay que testearlo en la entrega 1
  override def beforeEach(context: BeforeEach): Unit = {
    Refuerzo1 = new CartaUnidad(SeccionTablero = "Zona de combate cuerpo a cuerpo", Efecto = "Refuerzo moral")
    Refuerzo2 = new CartaUnidad(SeccionTablero = "Zona de combate distancia", Efecto = "Refuerzo moral")
    Cuerpo1 = new CartaUnidad(SeccionTablero = "Zona de combate cuerpo a cuerpo", Efecto = "Refuerzo moral")
    Cuerpo2 = new CartaUnidad(SeccionTablero = "Zona de combate cuerpo a cuerpo", Efecto = "Escarcha mordiente")
  }

  test("Una CartaUnidad debe tener SeccionTablero") {
    assertEquals(Refuerzo1.SeccionTablero, "Zona de combate cuerpo a cuerpo")
    assertEquals(Refuerzo2.SeccionTablero, "Zona de combate distancia")
  }

  test("Una CartaUnidad debe tener Efecto") {
    assertEquals(Cuerpo1.SeccionTablero, "Refuerzo moral")
    assertEquals(Cuerpo2.SeccionTablero, "Escarcha mordiente")
  }

  test("CartaUnidad's con distinto SeccionTablero  son distintos") {
    assert(!Refuerzo1.equals(Refuerzo2))
  }
  test("CartaUnidad's con distinto Efecto  son distintos") {
    assert(!Cuerpo1.equals(Cuerpo2))
  }
}
