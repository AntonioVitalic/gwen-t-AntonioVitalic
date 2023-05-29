package cl.uchile.dcc

import gwent.{Carta, CartaClima, CartaUnidadAsedio, CartaUnidadCuerpo, CartaUnidadDistancia, Jugador, TableroCuerpo}


/** Una clase para testear la clase CartaUnidadCuerpo.
 *
 * La carta de unidad para la el tablero de cuerpo se define por su efecto y fuerza.
 *
 * @constructor Crea una nueva CartaClima con su efecto.
 *
 * @author Antonio Vitalic
 */
class CartaUnidadCuerpoTesting extends munit.FunSuite {

  var CartaUnidadCuerpo1: CartaUnidadCuerpo = _
  var CartaUnidadCuerpo2: CartaUnidadCuerpo = _

  var CartaUnidadCuerpo1MismoNombre: CartaUnidadCuerpo = _
  var CartaUnidadCuerpo2MismoNombre: CartaUnidadCuerpo = _

  var CartaUnidadCuerpo1MismoEfecto: CartaUnidadCuerpo = _
  var CartaUnidadCuerpo2MismoEfecto: CartaUnidadCuerpo = _

  var CartaUnidadCuerpo1MismaFuerza: CartaUnidadCuerpo = _
  var CartaUnidadCuerpo2MismaFuerza: CartaUnidadCuerpo = _

  var CartaUnidadCuerpo: CartaUnidadCuerpo = _

  var JugadorEquals: Jugador = _
  var CartaUnidadAsedioEquals: CartaUnidadAsedio = _
  var CartaUnidadCuerpoEquals: CartaUnidadCuerpo = _
  var CartaUnidadDistanciaEquals: CartaUnidadDistancia = _
  var CartaClimaEquals: CartaClima = _

  var tableroCuerpo: TableroCuerpo = _

  var carta1 = new CartaUnidadCuerpo(nombre = "Carta1", efecto = "Refuerzo moral", fuerza = 10)
  var carta2 = new CartaUnidadCuerpo(nombre = "Carta2", efecto = "Vínculo estrecho", fuerza = 5)

  override def beforeEach(context: BeforeEach): Unit = {
    CartaUnidadCuerpo1 = new CartaUnidadCuerpo(nombre = "Mismo nombre", efecto = "Mismo efecto", fuerza = 10)
    CartaUnidadCuerpo2 = new CartaUnidadCuerpo(nombre = "Mismo nombre", efecto = "Mismo efecto", fuerza = 10)

    CartaUnidadCuerpo1MismoNombre = new CartaUnidadCuerpo(nombre = "Mismo nombre", efecto = "Escarcha mordiente", fuerza = 10)
    CartaUnidadCuerpo2MismoNombre = new CartaUnidadCuerpo(nombre = "Mismo nombre", efecto = "Niebla impenetrable", fuerza = 5)

    CartaUnidadCuerpo1MismoEfecto = new CartaUnidadCuerpo(nombre = "CartaClima1", efecto = "Mismo efecto", fuerza = 10)
    CartaUnidadCuerpo2MismoEfecto = new CartaUnidadCuerpo(nombre = "CartaClima2", efecto = "Mismo efecto", fuerza = 5)

    CartaUnidadCuerpo1MismaFuerza = new CartaUnidadCuerpo(nombre = "CartaClima1", efecto = "Escarcha mordiente", fuerza = 10)
    CartaUnidadCuerpo2MismaFuerza = new CartaUnidadCuerpo(nombre = "CartaClima2", efecto = "Niebla impenetrable", fuerza = 10)

    CartaUnidadCuerpo = new CartaUnidadCuerpo(nombre = "Carta Cuerpo genérica", efecto = "Refuerzo moral", fuerza = 10)

    JugadorEquals = new Jugador(_nombre = "Mario", _seccionTablero = tableroCuerpo,
      _contadorGemas = 2, _mazoCartas = List[Carta](), _manoCartas = List[Carta]())
    CartaUnidadAsedioEquals = new CartaUnidadAsedio(nombre = "Carta1", efecto = "Refuerzo moral", fuerza = 15)
    CartaUnidadCuerpoEquals = new CartaUnidadCuerpo(nombre = "Carta2", efecto = "Vínculo estrecho", fuerza = 10)
    CartaUnidadDistanciaEquals = new CartaUnidadDistancia(nombre = "Carta3", efecto = "Vínculo estrecho", fuerza = 5)
    CartaClimaEquals = new CartaClima(nombre = "Carta4", efecto = "Escarcha mordiente")

    tableroCuerpo = new TableroCuerpo(conjuntoCartas = List(carta1, carta2))

  }

  test("Dos CartaUnidadCuerpo con exactamente los mismos atributos, pero con distinto identificador son equivalentes"){
    assertEquals(CartaUnidadCuerpo1.##, CartaUnidadCuerpo2.##)
  }

  test("Una CartaUnidadCuerpo debe tener nombre") {
    assertEquals(CartaUnidadCuerpo.nombre, "Carta Cuerpo genérica")
  }

  test("Una CartaUnidadCuerpo debe tener efecto") {
    assertEquals(CartaUnidadCuerpo.efecto, "Refuerzo moral")
  }
  test("Una CartaUnidadCuerpo debe tener fuerza") {
    assertEquals(CartaUnidadCuerpo.fuerza, 10)
  }

  test("CartaUnidadCuerpo's con mismo nombre, distinto efecto y distinta fuerza son distintos") {
    assert(!CartaUnidadCuerpo1MismoNombre.equals(CartaUnidadCuerpo2MismoNombre))
  }

  test("CartaUnidadCuerpo's con distinto nombre, mismo efecto y distinta fuerza son distintos") {
    assert(!CartaUnidadCuerpo1MismoEfecto.equals(CartaUnidadCuerpo2MismoEfecto))
  }

  test("CartaUnidadCuerpo's con mismo nombre, mismo efecto y distinta fuerza son distintos") {
    assert(!CartaUnidadCuerpo1MismaFuerza.equals(CartaUnidadCuerpo2MismaFuerza))
  }

  test("Una CartaUnidadCuerpo no es un Jugador") {
    assert(!CartaUnidadCuerpoEquals.equals(JugadorEquals))
  }

  test("Un CartaUnidadCuerpo no es una CartaUnidadAsedio") {
    assert(!CartaUnidadCuerpoEquals.equals(CartaUnidadAsedioEquals))
  }

  test("Una CartaUnidadCuerpo no es una CartaUnidadDistancia"){
    assert(!CartaUnidadCuerpoEquals.equals(CartaUnidadDistanciaEquals))
  }

  test("Una CartaUnidadCuerpo no es un CartaClima"){
    assert(!CartaUnidadCuerpoEquals.equals(CartaClimaEquals))
  }

  test("Método anadirCartaCuerpo de CartaUnidadCuerpo") {
    val jugador = new Jugador(_nombre = "Jugador", _seccionTablero = tableroCuerpo, _contadorGemas = 2,
      _mazoCartas = List[Carta](), _manoCartas = List[Carta]())
    val carta = new CartaUnidadCuerpo(nombre = "Carta Cuerpo genérica", efecto = "Refuerzo moral", fuerza = 10)
    carta.anadirCartaCuerpo(jugador._seccionTablero)
    assertEquals(jugador.ManoCartas().length, 0)
  }

}
