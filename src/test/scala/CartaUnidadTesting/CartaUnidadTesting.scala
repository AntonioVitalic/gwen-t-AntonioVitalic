package cl.uchile.dcc
package CartaUnidadTesting

import gwent.{Carta, CartaUnidad, Usuario}


/** Una clase para testear la clase CartaUnidad.
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
