package cl.uchile.dcc

import gwent.{Carta, CartaClima, CartaUnidadAsedio, CartaUnidadCuerpo, CartaUnidadDistancia, Jugador, TableroClima}


/** Una clase para testear la clase CartaClima.
 *
 * La carta de clima se define por su efecto.
 *
 * @constructor Crea una nueva CartaClima con su efecto.
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
  var CartaUnidadCuerpo : CartaUnidadCuerpo = _
  var CartaUnidadDistancia : CartaUnidadDistancia = _
  var CartaClimaEquals: CartaClima = _
  var tableroClima: TableroClima = _

  var carta1 = new CartaClima(nombre = "Carta1", efecto = "Escarcha mordiente")
  var carta2 = new CartaClima(nombre = "Carta2", efecto = "Niebla impenetrable")


  override def beforeEach(context: BeforeEach): Unit = {
    CartaClima1 = new CartaClima(nombre = "Mismo nombre", efecto = "Mismo efecto")
    CartaClima2 = new CartaClima(nombre = "Mismo nombre", efecto = "Mismo efecto")

    CartaClima1MismoNombre = new CartaClima(nombre = "Mismo nombre", efecto = "Escarcha mordiente")
    CartaClima2MismoNombre = new CartaClima(nombre = "Mismo nombre", efecto = "Niebla impenetrable")

    CartaClima1MismoEfecto = new CartaClima(nombre = "CartaClima1", efecto = "Mismo efecto")
    CartaClima2MismoEfecto = new CartaClima(nombre = "CartaClima2", efecto = "Mismo efecto")

    CartaClimaEscarcha = new CartaClima(nombre = "Carta Escarcha", efecto = "Escarcha mordiente")
    CartaClimaNiebla = new CartaClima(nombre = "Carta Niebla", efecto = "Niebla impenetrable")
    CartaClimaLluvia = new CartaClima(nombre = "Carta Lluvia", efecto = "Lluvia torrencial")
    CartaClimaDespejado = new CartaClima(nombre = "Carta Despejado", efecto = "Clima despejado")

    JugadorEquals = new Jugador(_nombre = "Jugador", _seccionTablero = tableroClima, _contadorGemas = 2,
      _mazoCartas = List[Carta](), _manoCartas = List[Carta]())
    CartaUnidadAsedio = new CartaUnidadAsedio(nombre = "Carta1", efecto = "Refuerzo moral", fuerza = 10)
    CartaUnidadCuerpo = new CartaUnidadCuerpo(nombre = "Carta2", efecto = "Vínculo estrecho", fuerza = 10)
    CartaUnidadDistancia = new CartaUnidadDistancia(nombre = "Carta3", efecto = "Vínculo estrecho", fuerza = 10)
    CartaClimaEquals = new CartaClima("Carta4","Escarcha mordiente")

    tableroClima = new TableroClima(conjuntoCartas = List(carta1, carta2))

  }

  test("Dos CartaClima con exactamente los mismos atributos, pero con distinto identificador son equivalentes"){
    assertEquals(CartaClima1.##, CartaClima2.##)
  }

  test("Una CartaClima debe tener nombre") {
    assertEquals(CartaClimaEscarcha.nombre, "Carta Escarcha")
    assertEquals(CartaClimaNiebla.nombre, "Carta Niebla")
    assertEquals(CartaClimaLluvia.nombre, "Carta Lluvia")
    assertEquals(CartaClimaDespejado.nombre, "Carta Despejado")
  }

  test("Una CartaClima debe tener efecto") {
    assertEquals(CartaClimaEscarcha.efecto, "Escarcha mordiente")
    assertEquals(CartaClimaNiebla.efecto, "Niebla impenetrable")
    assertEquals(CartaClimaLluvia.efecto, "Lluvia torrencial")
    assertEquals(CartaClimaDespejado.efecto, "Clima despejado")
  }
  test("CartaClima's con distinto efecto son distintos") {
    assert(!CartaClima1MismoNombre.equals(CartaClima2MismoNombre))
  }

  test("CartaClima's con distinto nombre son distintos") {
    assert(!CartaClima1MismoEfecto.equals(CartaClima2MismoEfecto))
  }

  test("Método anadirCartaClima de CartaUnidadClima") {
    val jugador = new Jugador(_nombre = "Jugador", _seccionTablero = tableroClima, _contadorGemas = 2,
      _mazoCartas = List[Carta](), _manoCartas = List[Carta]())
    val carta = new CartaClima(nombre = "Carta Clima genérica", efecto = "Escarcha mordiente")
    carta.anadirCartaClima(jugador._seccionTablero)
    assertEquals(jugador.ManoCartas().length, 0)
  }
}