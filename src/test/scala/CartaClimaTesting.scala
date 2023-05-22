package cl.uchile.dcc

import gwent._


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

  var CartaClima1: CartaClima = _
  var CartaClima2: CartaClima = _

  var CartaClima1MismoNombre: CartaClima = _
  var CartaClima2MismoNombre: CartaClima = _

  var CartaClima1MismoEfecto: CartaClima = _
  var CartaClima2MismoEfecto: CartaClima = _


  var CartaClimaEscarcha: CartaClima = _ // Efecto = "Escarcha mordiente"
  var CartaClimaNiebla: CartaClima = _ //  Efecto = "Niebla impenetrable"
  var CartaClimaLluvia: CartaClima = _ // Efecto = "Lluvia torrencial"
  var CartaClimaDespejado: CartaClima = _  // Efecto = "Clima despejado"
  var CartaUnidadAsedio: CartaUnidadAsedio = _ // Fuerza = 10

  var JugadorEquals: Jugador = _
  var CartaUnidadAsedio : CartaUnidadAsedio = _
  var CartaUnidadCuerpo : CartaUnidadCuerpo = _
  var CartaUnidadDistancia : CartaUnidadDistancia = _
  var CartaClimaEquals: CartaClima = _
  var tableroAsedio: TableroAsedio = _

  // SeccionTablero no hay que testearlo en la entrega 1
  override def beforeEach(context: BeforeEach): Unit = {
    CartaClima1 = new CartaClima(nombre = "Mismo nombre", efecto = "Escarcha mordiente")
    CartaClima2 = new CartaClima(nombre = "Mismo nombre", efecto = "Escarcha mordiente")

    CartaClima1MismoNombre = new CartaClima(nombre = "Mismo nombre", efecto = "Escarcha mordiente")
    CartaClima2MismoNombre = new CartaClima(nombre = "Mismo nombre", efecto = "Niebla impenetrable")

    CartaClima1MismoEfecto = new CartaClima(nombre = "CartaClima1", efecto = "Mismo efecto")
    CartaClima2MismoEfecto = new CartaClima(nombre = "CartaClima2", efecto = "Mismo efecto")

    CartaClimaEscarcha = new CartaClima(nombre = "Carta Escarcha", efecto = "Escarcha mordiente")
    CartaClimaNiebla = new CartaClima(nombre = "Carta Niebla", efecto = "Niebla impenetrable")
    CartaClimaLluvia = new CartaClima(nombre = "Carta Lluvia", efecto = "Lluvia torrencial")
    CartaClimaDespejado = new CartaClima(nombre = "Carta Despejado", efecto = "Clima despejado")

    JugadorEquals = new Jugador(_nombre = "Jugador", _seccionTablero = tableroAsedio, _contadorGemas = 2,
      _mazoCartas = List[Carta], _manoCartas = List[Carta])
    CartaUnidadAsedio = new CartaUnidadAsedio(nombre = "Carta1", efecto = "Refuerzo moral", fuerza = 10)
    CartaUnidadCuerpo = new CartaUnidadCuerpo(nombre = "Carta2", efecto = "Vínculo estrecho", fuerza = 10)
    CartaUnidadDistancia = new CartaUnidadDistancia(nombre = "Carta3", efecto = "Vínculo estrecho", fuerza = 10)
    CartaClimaEquals = new CartaClima("Carta4","Escarcha mordiente")

  }

  test("Una CartaClima debe tener Efecto") {
    assertEquals(CartaClimaEscarcha.efecto, "Escarcha mordiente")
    assertEquals(CartaClimaNiebla.efecto, "Niebla impenetrable")
    assertEquals(CartaClimaLluvia.efecto, "Lluvia torrencial")
    assertEquals(CartaClimaDespejado.efecto, "Clima despejado")
  }
  test("CartaClima's con distinto Efecto son distintos") {
    assert(!CartaClimaNiebla.equals(CartaClimaLluvia))
  }

  test("CartaClima's con distinto nombre son distintos") {

  }

  test("Una CartaClima debe tener Nombre") {
    assertEquals(CartaClimaEscarcha.nombre, "Carta Escarcha")
    assertEquals(CartaClimaNiebla.nombre, "Carta Niebla")
    assertEquals(CartaClimaLluvia.nombre, "Carta Lluvia")
    assertEquals(CartaClimaDespejado.nombre, "Carta Despejado")
  }

  test("CartaClima's con distinto Nombre son distintos") {
    assert(!CartaClimaEscarcha.equals(CartaClimaNiebla))
  }

  test("Dos CartaClima con el mismo Nombre, SeccionTablero y Efecto, pero con distinto nombre de objeto, son iguales") {
    assertEquals(CartaClima1MismoNombre.##, CartaClima2MismoNombre.##)
  }

  test("Una CartaClima no es un Jugador") {
    assert(!CartaClimaEquals.equals(JugadorEquals))
  }

  test("Un CartaClima no es una CartaUnidadAsedio") {
    assert(!CartaClimaEquals.equals(CartaUnidadAsedio))
  }

  test("Un CartaClima no es una CartaUnidadCuerpo") {
    assert(!CartaClimaEquals.equals(CartaUnidadCuerpo))
  }

  test("Una CartaClima no es una CartaUnidadDistancia")
}