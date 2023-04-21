package cl.uchile.dcc
package CartaClimaTesting

import gwent.{Carta, CartaClima}


/** Una clase para testear la clase CartaClima.
 *
 * La carta de clima se define por su efecto.
 *
 * @param Efecto: Efecto de la carta
 *
 * @constructor Crea una nueva CartaClima con su efecto.
 *
 * @example
 * {{{
 * val CartaClima = new CartaClima("Escarcha mordiente")
 * val Efecto = CartaClima.Efecto()
 * println(s"La carta de clima tiene el efecto $Efecto")
 * }}}
 *
 * @author Antonio Vitalic
 */
class CartaClimaTesting extends munit.FunSuite with Carta {
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