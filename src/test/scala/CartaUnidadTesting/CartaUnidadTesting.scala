package cl.uchile.dcc
package CartaUnidadTesting

import gwent.CartaUnidad


/** Una clase para testear la clase CartaUnidad.
 *
 * La carta de unidad se define por su seccion del tablero y su efecto.
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
class CartaUnidadTesting extends munit.FunSuite {
  var CartaUnidad1MismoNombre: CartaUnidad = _
  var CartaUnidad2MismoNombre: CartaUnidad = _


  var CartaCuerpoVinculo: CartaUnidad = _ // CartaUnidad con SeccionTablero = "Cuerpo a cuerpo" y Efecto = "Vinculo estrecho"
  var CartaCuerpoRefuerzo: CartaUnidad = _ // CartaUnidad con SeccionTablero = "Cuerpo a cuerpo" y Efecto = "Refuerzo moral"
  var CartaCuerpoAsedio: CartaUnidad = _ // CartaUnidad con SeccionTablero = "Cuerpo a cuerpo" y Efecto = "Refuerzo moral"
  // Notar que se están testeando CartaUnidad con misma sección del tablero y distinto efecto, por lo que
  // no se pierde generalidad al usar "Cuerpo a cuerpo" en todas las cartas definidas anteriormente

  var CartaDistanciaVinculo: CartaUnidad = _ // CartaUnidad con SeccionTablero = "Distancia" y Efecto = "Vinculo estrecho"
  var CartaAsedioVinculo: CartaUnidad = _ // CartaUnidad con SeccionTablero = "Distancia" y Efecto = "Refuerzo moral"
  // Similarmente, se están testeando CartaUnidad con distinta sección del tablero y mismo efecto, por lo que
  // no se pierde generalidad al usar "Asedio" en todas las cartas definidas anteriormente

  override def beforeEach(context: BeforeEach): Unit = {
    CartaUnidad1MismoNombre = new CartaUnidad(Nombre = "Mismo nombre", SeccionTablero = "Cuerpo a cuerpo",
      Efecto = "Refuerzo moral")
    CartaUnidad2MismoNombre = new CartaUnidad(Nombre = "Mismo nombre", SeccionTablero = "Cuerpo a cuerpo",
      Efecto = "Refuerzo moral")

    CartaCuerpoVinculo = new CartaUnidad(Nombre = "Carta Cuerpo Vinculo", SeccionTablero = "Cuerpo a cuerpo",
      Efecto = "Vinculo estrecho")

    CartaCuerpoRefuerzo = new CartaUnidad(Nombre = "Carta Cuerpo Refuerzo", SeccionTablero = "Cuerpo a cuerpo",
      Efecto = "Refuerzo moral")

    CartaCuerpoAsedio = new CartaUnidad(Nombre = "Carta Cuerpo Asedio", SeccionTablero = "Cuerpo a cuerpo",
      Efecto = "Refuerzo moral")

    CartaDistanciaVinculo = new CartaUnidad(Nombre = "Carta Distancia Vinculo", SeccionTablero = "Distancia",
      Efecto = "Vinculo estrecho")

    CartaAsedioVinculo = new CartaUnidad(Nombre = "Carta Asedio Vinculo", SeccionTablero = "Asedio",
      Efecto = "Vinculo estrecho")
  }

  test("Una CartaUnidad debe tener nombre") {
    assertEquals(CartaCuerpoVinculo.Nombre, "Carta Cuerpo Vinculo")
    assertEquals(CartaCuerpoRefuerzo.Nombre, "Carta Cuerpo Refuerzo")
    assertEquals(CartaCuerpoAsedio.Nombre, "Carta Cuerpo Asedio")
    assertEquals(CartaDistanciaVinculo.Nombre, "Carta Distancia Vinculo")
    assertEquals(CartaAsedioVinculo.Nombre, "Carta Asedio Vinculo")
  }

  test("Una CartaUnidad debe tener seccion del tablero") {
    assertEquals(CartaCuerpoVinculo.SeccionTablero, "Cuerpo a cuerpo")
    assertEquals(CartaCuerpoRefuerzo.SeccionTablero, "Cuerpo a cuerpo")
    assertEquals(CartaCuerpoAsedio.SeccionTablero, "Cuerpo a cuerpo")
    assertEquals(CartaDistanciaVinculo.SeccionTablero, "Distancia")
    assertEquals(CartaAsedioVinculo.SeccionTablero, "Asedio")
  }

  test("Una CartaUnidad debe tener efecto") {
    assertEquals(CartaCuerpoVinculo.Efecto, "Vinculo estrecho")
    assertEquals(CartaCuerpoRefuerzo.Efecto, "Refuerzo moral")
    assertEquals(CartaCuerpoAsedio.Efecto, "Refuerzo moral")
    assertEquals(CartaDistanciaVinculo.Efecto, "Vinculo estrecho")
    assertEquals(CartaAsedioVinculo.Efecto, "Vinculo estrecho")
  }

  test("Dos CartaUnidad con el mismo nombre, seccion del tablero y efecto, pero con distinto nombre de objeto,  son iguales") {
    assertEquals(CartaUnidad1MismoNombre.##, CartaUnidad2MismoNombre.##)
  }

}
