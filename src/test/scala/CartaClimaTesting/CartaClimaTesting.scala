package cl.uchile.dcc
package CartaClimaTesting

import gwent.CartaClima


/** Una clase para testear la clase CartaClima.
 *
 * La carta de clima se define por su efecto.
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
class CartaClimaTesting extends munit.FunSuite {
  var CartaClima1MismoNombre: CartaClima = _
  var CartaClima2MismoNombre: CartaClima = _


  var CartaClimaEscarcha: CartaClima = _ // CartaClima con SeccionTablero = "Clima" y Efecto = "Escarcha mordiente"
  var CartaClimaNiebla: CartaClima = _ // CartaClima con SeccionTablero = "Clima" y Efecto = "Niebla impenetrable"
  var CartaClimaLluvia: CartaClima = _ // CartaClima con SeccionTablero = "Clima" y Efecto = "Lluvia torrencial"
  var CartaClimaDespejado: CartaClima = _  // CartaClima con SeccionTablero = "Clima" y Efecto = "Clima despejado"

  // SeccionTablero no hay que testearlo en la entrega 1
  override def beforeEach(context: BeforeEach): Unit = {
    CartaClima1MismoNombre = new CartaClima(Nombre = "Mismo nombre",  SeccionTablero = "Clima", Efecto = "Escarcha mordiente")
    CartaClima2MismoNombre = new CartaClima(Nombre = "Mismo nombre",  SeccionTablero = "Clima", Efecto = "Escarcha mordiente")

    CartaClimaEscarcha = new CartaClima(Nombre = "Carta Escarcha",  SeccionTablero = "Clima", Efecto = "Escarcha mordiente")
    CartaClimaNiebla = new CartaClima(Nombre = "Carta Niebla",  SeccionTablero = "Clima", Efecto = "Niebla impenetrable")
    CartaClimaLluvia = new CartaClima(Nombre = "Carta Lluvia",  SeccionTablero = "Clima", Efecto = "Lluvia torrencial")
    CartaClimaDespejado = new CartaClima(Nombre = "Carta Despejado",  SeccionTablero = "Clima", Efecto = "Clima despejado")
  }

  test("Una CartaClima debe tener Efecto") {
    assertEquals(CartaClimaEscarcha.Efecto, "Escarcha mordiente")
    assertEquals(CartaClimaNiebla.Efecto, "Niebla impenetrable")
    assertEquals(CartaClimaLluvia.Efecto, "Lluvia torrencial")
    assertEquals(CartaClimaDespejado.Efecto, "Clima despejado")
  }
  test("CartaClima's con distinto Efecto son distintos") {
    assert(!CartaClimaNiebla.equals(CartaClimaLluvia))
  }

  test("Una CartaClima debe tener SeccionTablero") {
    assertEquals(CartaClimaEscarcha.SeccionTablero, "Clima")
    assertEquals(CartaClimaNiebla.SeccionTablero, "Clima")
    assertEquals(CartaClimaLluvia.SeccionTablero, "Clima")
    assertEquals(CartaClimaDespejado.SeccionTablero, "Clima")
  }

  test("CartaClima's con distinto SeccionTablero son distintos") {
    assert(!CartaClimaEscarcha.equals(CartaClimaDespejado))
  }

  test("Una CartaClima debe tener Nombre") {
    assertEquals(CartaClimaEscarcha.Nombre, "Carta Escarcha")
    assertEquals(CartaClimaNiebla.Nombre, "Carta Niebla")
    assertEquals(CartaClimaLluvia.Nombre, "Carta Lluvia")
    assertEquals(CartaClimaDespejado.Nombre, "Carta Despejado")
  }

  test("CartaClima's con distinto Nombre son distintos") {
    assert(!CartaClimaEscarcha.equals(CartaClimaNiebla))
  }

  test("Dos CartaClima con el mismo Nombre, SeccionTablero y Efecto, pero con distinto nombre de objeto, son iguales") {
    assertEquals(CartaClima1MismoNombre.##, CartaClima2MismoNombre.##)
  }

}