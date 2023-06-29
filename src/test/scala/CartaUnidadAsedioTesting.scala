package cl.uchile.dcc

import gwent.Jugador
import cl.uchile.dcc.gwent.Cartas.{Carta, CartaClima, CartaUnidadAsedio, CartaUnidadCuerpo, CartaUnidadDistancia}
import cl.uchile.dcc.gwent.Tableros.TableroAsedio


/** Una clase para testear la clase CartaUnidadAsedio.
 *
 * La carta de unidad para la el tablero de asedio se define por su efecto y fuerza.
 *
 * @constructor Crea una nueva CartaClima con su efecto.
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
  var CartaUnidadAsedioEquals: CartaUnidadAsedio = _
  var CartaUnidadCuerpoEquals: CartaUnidadCuerpo = _
  var CartaUnidadDistanciaEquals: CartaUnidadDistancia = _
  var CartaClimaEquals: CartaClima = _

  var tableroAsedio: TableroAsedio = _

  var carta1 = new CartaUnidadAsedio(nombre = "Carta1", efecto = "Refuerzo moral", fuerza = 10)
  var carta2 = new CartaUnidadAsedio(nombre = "Carta2", efecto = "Vínculo estrecho", fuerza = 5)

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

    JugadorEquals = new Jugador(_nombre = "Mario", _seccionTablero = tableroAsedio,
      _contadorGemas = 2, _mazoCartas = List[Carta](), _manoCartas = List[Carta]())
    CartaUnidadAsedioEquals = new CartaUnidadAsedio(nombre = "Carta1", efecto = "Refuerzo moral", fuerza = 15)
    CartaUnidadCuerpoEquals = new CartaUnidadCuerpo(nombre = "Carta2", efecto = "Vínculo estrecho", fuerza = 10)
    CartaUnidadDistanciaEquals = new CartaUnidadDistancia(nombre = "Carta3", efecto = "Vínculo estrecho", fuerza = 5)
    CartaClimaEquals = new CartaClima(nombre = "Carta4", efecto = "Escarcha mordiente")

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
    assert(!CartaUnidadAsedioEquals.equals(CartaUnidadCuerpoEquals))
  }

  test("Una CartaUnidadAsedio no es una CartaUnidadDistancia"){
    assert(!CartaUnidadAsedioEquals.equals(CartaUnidadDistanciaEquals))
  }

  test("Una CartaUnidadAsedio no es un CartaClima"){
    assert(!CartaUnidadAsedioEquals.equals(CartaClimaEquals))
  }

  test("Método anadirCartaAsedio de CartaUnidadAsedio") {
    val jugador = new Jugador(_nombre = "Jugador", _seccionTablero = tableroAsedio, _contadorGemas = 2,
      _mazoCartas = List[Carta](), _manoCartas = List[Carta]())
    val carta = new CartaUnidadAsedio(nombre = "Carta Asedio genérica", efecto = "Refuerzo moral", fuerza = 10)
    carta.anadirCartaAsedio(jugador._seccionTablero)
    assertEquals(jugador.ManoCartas().length, 0)
  }

}