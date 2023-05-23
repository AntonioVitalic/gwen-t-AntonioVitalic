package cl.uchile.dcc

import gwent.{Carta, CartaClima, CartaUnidadAsedio, CartaUnidadCuerpo, CartaUnidadDistancia, Jugador, TableroAsedio}


/** Una clase para testear la clase CartaUnidadAsedio.
 *
 * La carta de unidad para la el tablero de asedio se define por su efecto y fuerza.
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
class CartaUnidadAsedioTesting extends munit.FunSuite {

  var CartaUnidadAsedio1: CartaUnidadAsedio = _
  var CartaUnidadAsedio2: CartaUnidadAsedio = _

  var CartaUnidadAsedio1MismoNombre: CartaUnidadAsedio = _
  var CartaUnidadAsedio2MismoNombre: CartaUnidadAsedio = _

  var CartaUnidadAsedio1MismoEfecto: CartaUnidadAsedio = _
  var CartaUnidadAsedio2MismoEfecto: CartaUnidadAsedio = _

  var CartaUnidadAsedio1MismaFuerza: CartaUnidadAsedio = _
  var CartaUnidadAsedio2MismaFuerza: CartaUnidadAsedio = _

  var CartaUnidadAsedio: CartaUnidadAsedio = _

  var JugadorEquals: Jugador = _
  var CartaUnidadCuerpo : CartaUnidadCuerpo = _
  var CartaUnidadDistancia : CartaUnidadDistancia = _
  var CartaClima : CartaClima = _
  var CartaUnidadAsedioEquals: CartaClima = _
  var tableroAsedio: TableroAsedio = _

  var carta1 = new CartaUnidadAsedio(nombre = "Carta1", efecto = "Escarcha mordiente", fuerza = 10)
  var carta2 = new CartaUnidadAsedio(nombre = "Carta2", efecto = "Niebla impenetrable", fuerza = 5)

  // SeccionTablero no hay que testearlo en la entrega 1
  override def beforeEach(context: BeforeEach): Unit = {
    CartaUnidadAsedio1 = new CartaUnidadAsedio(nombre = "Mismo nombre", efecto = "Mismo efecto", fuerza = 10)
    CartaUnidadAsedio2 = new CartaUnidadAsedio(nombre = "Mismo nombre", efecto = "Mismo efecto", fuerza = 10)

    CartaUnidadAsedio1MismoNombre = new CartaUnidadAsedio(nombre = "Mismo nombre", efecto = "Escarcha mordiente", fuerza = 10)
    CartaUnidadAsedio2MismoNombre = new CartaUnidadAsedio(nombre = "Mismo nombre", efecto = "Niebla impenetrable", fuerza = 5)

    CartaUnidadAsedio1MismoEfecto = new CartaUnidadAsedio(nombre = "CartaClima1", efecto = "Mismo efecto", fuerza = 10)
    CartaUnidadAsedio2MismoEfecto = new CartaUnidadAsedio(nombre = "CartaClima2", efecto = "Mismo efecto", fuerza = 5)

    CartaUnidadAsedio1MismaFuerza = new CartaUnidadAsedio(nombre = "CartaClima1", efecto = "Escarcha mordiente", fuerza = 10)
    CartaUnidadAsedio2MismaFuerza = new CartaUnidadAsedio(nombre = "CartaClima2", efecto = "Niebla impenetrable", fuerza = 10)

    CartaUnidadAsedio = new CartaUnidadAsedio(nombre = "Carta Asedio genérica", efecto = "Refuerzo moral", fuerza = 10)

    JugadorEquals = new Jugador(_nombre = "Jugador", _seccionTablero = tableroAsedio, _contadorGemas = 2,
      _mazoCartas = List[Carta](), _manoCartas = List[Carta]())
    CartaUnidadCuerpo = new CartaUnidadCuerpo(nombre = "Carta2", efecto = "Vínculo estrecho", fuerza = 10)
    CartaUnidadDistancia = new CartaUnidadDistancia(nombre = "Carta3", efecto = "Vínculo estrecho", fuerza = 10)
    CartaClima = new CartaClima(nombre = "Carta4", efecto = "Escarcha mordiente")
    CartaUnidadAsedioEquals = new CartaClima("Carta4","Escarcha mordiente")

    tableroAsedio = new TableroAsedio(conjuntoCartas = List(carta1, carta2))

  }

  test("Dos CartaUnidadAsedio con exactamente los mismos atributos, pero con distinto identificador son equivalentes"){
    assertEquals(CartaUnidadAsedio1.##, CartaUnidadAsedio2.##)
  }

  test("Una CartaUnidadAsedio debe tener nombre") {
    assertEquals(CartaUnidadAsedio.nombre, "Carta Asedio genérica")
  }

  test("Una CartaUnidadAsedio debe tener efecto") {
    assertEquals(CartaUnidadAsedio.efecto, "Refuerzo moral")
  }
  test("Una CartaUnidadAsedio debe tener fuerza") {
    assertEquals(CartaUnidadAsedio.fuerza, 10)
  }

  test("CartaUnidadAsedio's con mismo nombre, distinto efecto y distinta fuerza son distintos") {
    assert(!CartaUnidadAsedio1MismoNombre.equals(CartaUnidadAsedio2MismoNombre))
  }

  test("CartaUnidadAsedio's con distinto nombre, mismo efecto y distinta fuerza son distintos") {
    assert(!CartaUnidadAsedio1MismoEfecto.equals(CartaUnidadAsedio2MismoEfecto))
  }

  test("CartaUnidadAsedio's con mismo nombre, mismo efecto y distinta fuerza son distintos") {
    assert(!CartaUnidadAsedio1MismaFuerza.equals(CartaUnidadAsedio2MismaFuerza))
  }

  test("Una CartaUnidadAsedio no es un Jugador") {
    assert(!CartaUnidadAsedioEquals.equals(JugadorEquals))
  }

  test("Un CartaUnidadAsedio no es una CartaUnidadCuerpo") {
    assert(!CartaUnidadAsedioEquals.equals(CartaUnidadCuerpo))
  }

  test("Una CartaUnidadAsedio no es una CartaUnidadDistancia"){
    assert(!CartaUnidadAsedioEquals.equals(CartaUnidadDistancia))
  }

  test("Una CartaUnidadAsedio no es un CartaClima"){
    assert(!CartaUnidadAsedioEquals.equals(CartaClima))
  }

  test("Método anadirCartaAsedio de CartaUnidadAsedio") {
    val jugador = new Jugador(_nombre = "Jugador", _seccionTablero = tableroAsedio, _contadorGemas = 2,
      _mazoCartas = List[Carta](), _manoCartas = List[Carta]())
    val carta = new CartaUnidadAsedio(nombre = "Carta Asedio genérica", efecto = "Refuerzo moral", fuerza = 10)
    carta.anadirCartaAsedio(jugador._seccionTablero)
    assertEquals(jugador.ManoCartas().length, 0)
    assertEquals(jugador.ManoCartas().length, 0)
  }
}