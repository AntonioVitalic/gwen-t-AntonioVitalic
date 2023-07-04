package cl.uchile.dcc

import cl.uchile.dcc.gwent.Cartas.{Carta, CartaClima, CartaUnidadAsedio, CartaUnidadCuerpo, CartaUnidadDistancia}
import cl.uchile.dcc.gwent.Jugadores.Jugador
import cl.uchile.dcc.gwent.Tableros.TableroDistancia


/** Una clase para testear la clase CartaUnidadDistancia.
 *
 * La carta de unidad para la el tablero de distancia se define por su efecto y fuerza.
 *
 * @constructor Crea una nueva CartaClima con su efecto.
 * @author Antonio Vitalic
 */
class CartaUnidadDistanciaTesting extends munit.FunSuite {

  var CartaUnidadDistancia1: CartaUnidadDistancia = _
  var CartaUnidadDistancia2: CartaUnidadDistancia = _

  var CartaUnidadDistancia1MismoNombre: CartaUnidadDistancia = _
  var CartaUnidadDistancia2MismoNombre: CartaUnidadDistancia = _

  var CartaUnidadDistancia1MismoEfecto: CartaUnidadDistancia = _
  var CartaUnidadDistancia2MismoEfecto: CartaUnidadDistancia = _

  var CartaUnidadDistancia1MismaFuerza: CartaUnidadDistancia = _
  var CartaUnidadDistancia2MismaFuerza: CartaUnidadDistancia = _

  var CartaUnidadDistancia: CartaUnidadDistancia = _

  var JugadorEquals: Jugador = _
  var CartaUnidadAsedioEquals: CartaUnidadAsedio = _
  var CartaUnidadCuerpoEquals: CartaUnidadCuerpo = _
  var CartaUnidadDistanciaEquals: CartaUnidadDistancia = _
  var CartaClimaEquals: CartaClima = _

  var tableroDistancia: TableroDistancia = _

  var carta1 = new CartaUnidadDistancia(nombre = "Carta1", efecto = "Refuerzo moral", fuerza = 10)
  var carta2 = new CartaUnidadDistancia(nombre = "Carta2", efecto = "Vínculo estrecho", fuerza = 5)

  override def beforeEach(context: BeforeEach): Unit = {
    CartaUnidadDistancia1 = new CartaUnidadDistancia(nombre = "Mismo nombre", efecto = "Mismo efecto", fuerza = 10)
    CartaUnidadDistancia2 = new CartaUnidadDistancia(nombre = "Mismo nombre", efecto = "Mismo efecto", fuerza = 10)

    CartaUnidadDistancia1MismoNombre = new CartaUnidadDistancia(nombre = "Mismo nombre", efecto = "Escarcha mordiente", fuerza = 10)
    CartaUnidadDistancia2MismoNombre = new CartaUnidadDistancia(nombre = "Mismo nombre", efecto = "Niebla impenetrable", fuerza = 5)

    CartaUnidadDistancia1MismoEfecto = new CartaUnidadDistancia(nombre = "CartaClima1", efecto = "Mismo efecto", fuerza = 10)
    CartaUnidadDistancia2MismoEfecto = new CartaUnidadDistancia(nombre = "CartaClima2", efecto = "Mismo efecto", fuerza = 5)

    CartaUnidadDistancia1MismaFuerza = new CartaUnidadDistancia(nombre = "CartaClima1", efecto = "Escarcha mordiente", fuerza = 10)
    CartaUnidadDistancia2MismaFuerza = new CartaUnidadDistancia(nombre = "CartaClima2", efecto = "Niebla impenetrable", fuerza = 10)

    CartaUnidadDistancia = new CartaUnidadDistancia(nombre = "Carta Distancia genérica", efecto = "Refuerzo moral", fuerza = 10)

    JugadorEquals = new Jugador(_nombre = "Mario", _seccionTablero = tableroDistancia,
      _contadorGemas = 2, _mazoCartas = List[Carta](), _manoCartas = List[Carta]())
    CartaUnidadAsedioEquals = new CartaUnidadAsedio(nombre = "Carta1", efecto = "Refuerzo moral", fuerza = 15)
    CartaUnidadCuerpoEquals = new CartaUnidadCuerpo(nombre = "Carta2", efecto = "Vínculo estrecho", fuerza = 10)
    CartaUnidadDistanciaEquals = new CartaUnidadDistancia(nombre = "Carta3", efecto = "Vínculo estrecho", fuerza = 5)
    CartaClimaEquals = new CartaClima(nombre = "Carta4", efecto = "Escarcha mordiente")

    tableroDistancia = new TableroDistancia(conjuntoCartas = List(carta1, carta2))

  }

  test("Dos CartaUnidadDistancia con exactamente los mismos atributos, pero con distinto identificador son equivalentes"){
    assertEquals(CartaUnidadDistancia1.##, CartaUnidadDistancia2.##)
  }

  test("Una CartaUnidadv debe tener nombre") {
    assertEquals(CartaUnidadDistancia.nombre, "Carta Distancia genérica")
  }

  test("Una CartaUnidadDistancia debe tener efecto") {
    assertEquals(CartaUnidadDistancia.efecto, "Refuerzo moral")
  }
  test("Una CartaUnidadDistancia debe tener fuerza") {
    assertEquals(CartaUnidadDistancia.fuerza, 10)
  }

  test("CartaUnidadDistancia's con mismo nombre, distinto efecto y distinta fuerza son distintos") {
    assert(!CartaUnidadDistancia1MismoNombre.equals(CartaUnidadDistancia2MismoNombre))
  }

  test("CartaUnidadDistancia's con distinto nombre, mismo efecto y distinta fuerza son distintos") {
    assert(!CartaUnidadDistancia1MismoEfecto.equals(CartaUnidadDistancia2MismoEfecto))
  }

  test("CartaUnidadDistancia's con mismo nombre, mismo efecto y distinta fuerza son distintos") {
    assert(!CartaUnidadDistancia1MismaFuerza.equals(CartaUnidadDistancia2MismaFuerza))
  }

  test("Una CartaUnidadDistancia no es un Jugador") {
    assert(!CartaUnidadDistanciaEquals.equals(JugadorEquals))
  }

  test("Un CartaUnidadDistancia no es una CartaUnidadCuerpo") {
    assert(!CartaUnidadDistanciaEquals.equals(CartaUnidadCuerpoEquals))
  }

  test("Una CartaUnidadDistancia no es una CartaUnidadAsedio"){
    assert(!CartaUnidadDistanciaEquals.equals(CartaUnidadAsedioEquals))
  }

  test("Una CartaUnidadDistancia no es un CartaClima"){
    assert(!CartaUnidadDistanciaEquals.equals(CartaClimaEquals))
  }

  test("Método anadirCartaDistancia de CartaUnidadDistancia") {
    val jugador = new Jugador(_nombre = "Jugador", _seccionTablero = tableroDistancia, _contadorGemas = 2,
      _mazoCartas = List[Carta](), _manoCartas = List[Carta]())
    val carta = new CartaUnidadDistancia(nombre = "Carta Distancia genérica", efecto = "Refuerzo moral", fuerza = 10)
    carta.anadirCartaDistancia(jugador._seccionTablero)
    assertEquals(jugador.ManoCartas().length, 0)
  }

}
