package cl.uchile.dcc

import gwent.{Carta, CartaClima, CartaUnidadAsedio, CartaUnidadCuerpo, CartaUnidadDistancia, Jugador, TableroAsedio, TableroClima, TableroCuerpo, TableroDistancia}


/** Una clase para testear la clase Jugador.
 *
 * El Jugador se define por su nombre, su sección del tablero, su contador de gemas, su mazo de cartas
 * y su mano de cartas
 *
 * @example
 * {{{
 * val Jugador = new Jugador("Jugador", "Cuerpo a cuerpo", 2, List[Carta](), List[Carta]())
 * val Nombre = Jugador.nombre()
 * println(s"El nombre del Jugador es $nombre")
 * }}}
 *
 * @author Antonio Vitalic
 */

class JugadorTesting extends munit.FunSuite {
  var Jugador1MismoNombre: Jugador = _
  var Jugador2MismoNombre: Jugador = _

  var JugadorAsedio: Jugador = _
  var JugadorCuerpo : Jugador = _
  var JugadorDistancia: Jugador = _
  var JugadorClima: Jugador = _

  var Carta1: CartaUnidadAsedio = _
  var Carta2: CartaUnidadCuerpo = _
  var Carta3: CartaUnidadDistancia = _
  var Carta4: CartaClima = _

  var JugadorEquals: Jugador = _
  var CartaUnidadAsedioEquals: CartaUnidadAsedio = _
  var CartaUnidadCuerpoEquals: CartaUnidadCuerpo = _
  var CartaUnidadDistanciaEquals: CartaUnidadDistancia = _
  var CartaClimaEquals: CartaClima = _

  var JugadorToadette: Jugador = _

  val tableroAsedio: TableroAsedio = new TableroAsedio(List[CartaUnidadAsedio]())
  val tableroCuerpo: TableroCuerpo = new TableroCuerpo(List[CartaUnidadCuerpo]())
  val tableroDistancia: TableroDistancia = new TableroDistancia(List[CartaUnidadDistancia]())
  val tableroClima: TableroClima = new TableroClima(List[CartaClima]())

  // SeccionTablero no hay que testearlo en la entrega 1
  override def beforeEach(context: BeforeEach): Unit = {
    Jugador1MismoNombre = new Jugador(_nombre = "Mario", _seccionTablero = tableroAsedio,
      _contadorGemas = 2, _mazoCartas = List[Carta](), _manoCartas = List[Carta]())

    Jugador2MismoNombre = new Jugador(_nombre = "Mario", _seccionTablero = tableroAsedio,
      _contadorGemas = 2, _mazoCartas = List[Carta](), _manoCartas = List[Carta]())

    JugadorAsedio = new Jugador(_nombre = "Luigi", _seccionTablero = tableroAsedio,
      _contadorGemas = 2, _mazoCartas = List[Carta](), _manoCartas = List[Carta]())

    JugadorCuerpo = new Jugador(_nombre = "Peach", _seccionTablero = tableroCuerpo,
      _contadorGemas = 2, _mazoCartas = List[Carta](), _manoCartas = List[Carta]())

    JugadorDistancia = new Jugador(_nombre = "Toad", _seccionTablero = tableroDistancia,
      _contadorGemas = 2, _mazoCartas = List[Carta](), _manoCartas = List[Carta]())

    JugadorClima = new Jugador(_nombre = "DK", _seccionTablero = tableroClima,
      _contadorGemas = 2, _mazoCartas = List[Carta](), _manoCartas = List[Carta]())


    Carta1 = new CartaUnidadAsedio(nombre = "Carta1", efecto = "Refuerzo moral", fuerza = 15)
    Carta2 = new CartaUnidadCuerpo(nombre = "Carta2", efecto = "Vínculo estrecho", fuerza = 10)
    Carta3 = new CartaUnidadDistancia(nombre = "Carta3", efecto = "Vínculo estrecho", fuerza = 5)
    Carta4 = new CartaClima(nombre = "Carta4", efecto = "Escarcha mordiente")

    JugadorEquals = new Jugador(_nombre = "Mario", _seccionTablero = tableroAsedio,
      _contadorGemas = 2, _mazoCartas = List[Carta](), _manoCartas = List[Carta]())
    CartaUnidadAsedioEquals = new CartaUnidadAsedio(nombre = "Carta1", efecto = "Refuerzo moral", fuerza = 15)
    CartaUnidadCuerpoEquals = new CartaUnidadCuerpo(nombre = "Carta2", efecto = "Vínculo estrecho", fuerza = 10)
    CartaUnidadDistanciaEquals = new CartaUnidadDistancia(nombre = "Carta3", efecto = "Vínculo estrecho", fuerza = 5)
    CartaClimaEquals = new CartaClima(nombre = "Carta4", efecto = "Escarcha mordiente")

  }

  test("Un Jugador debe tener nombre") {
    assertEquals(Jugador1MismoNombre._nombre, "Mario")
    assertEquals(Jugador2MismoNombre._nombre, "Mario")
    assertEquals(JugadorDistancia._nombre, "Toad")
    assertEquals(JugadorAsedio._nombre, "Luigi")
    assertEquals(JugadorClima._nombre, "DK")
  }

  test("Un Jugador debe jugar en una sección del tablero") {
    assertEquals(Jugador1MismoNombre._seccionTablero, tableroAsedio)
    assertEquals(Jugador2MismoNombre._seccionTablero, tableroAsedio)
    assertEquals(JugadorAsedio._seccionTablero, tableroAsedio)
    assertEquals(JugadorDistancia._seccionTablero, tableroDistancia)
    assertEquals(JugadorCuerpo._seccionTablero, tableroCuerpo)
    assertEquals(JugadorClima._seccionTablero, tableroClima)
  }

  test("Un Jugador debe tener inicialmente un contadorGemas igual a 2") {
    assertEquals(Jugador1MismoNombre._contadorGemas, 2)
    assertEquals(Jugador2MismoNombre._contadorGemas, 2)
    assertEquals(JugadorDistancia._contadorGemas, 2)
    assertEquals(JugadorAsedio._contadorGemas, 2)
    assertEquals(JugadorClima._contadorGemas, 2)
  }

  test("Dos Jugador con el mismo Nombre, SeccionTablero y ContadorGemas, pero con distinto nombre de objeto,  son iguales") {
    assertEquals(Jugador1MismoNombre.##, Jugador2MismoNombre.##)
  }

  test("Un Jugador debe tener un mazo de cartas") {
    assertEquals(Jugador1MismoNombre.ManoCartas(), List[Carta]())
    assertEquals(Jugador2MismoNombre.ManoCartas(), List[Carta]())
    assertEquals(JugadorDistancia.ManoCartas(), List[Carta]())
    assertEquals(JugadorAsedio.ManoCartas(), List[Carta]())
    assertEquals(JugadorClima.ManoCartas(), List[Carta]())
  }

  test("Un Jugador debe tener una mano de cartas") {
    assertEquals(Jugador1MismoNombre.MazoCartas(), List[Carta]())
    assertEquals(Jugador2MismoNombre.MazoCartas(), List[Carta]())
    assertEquals(JugadorDistancia.MazoCartas(), List[Carta]())
    assertEquals(JugadorAsedio.MazoCartas(), List[Carta]())
    assertEquals(JugadorClima.MazoCartas(), List[Carta]())
  }

  test("Un Jugador no es una CartaUnidadAsedio") {
    assert(!JugadorEquals.equals(CartaUnidadAsedioEquals))
  }

  test("Un Jugador no es una CartaUnidadCuerpo"){
    assert(!JugadorEquals.equals(CartaUnidadCuerpoEquals))
  }

  test("Un Jugador no es una CartaUnidadDistancia"){
    assert(!JugadorEquals.equals(CartaUnidadDistanciaEquals))
  }

  test("Un Jugador no es una CartaClima") {
    assert(!JugadorEquals.equals(CartaClimaEquals))
  }

  test("robarCartaMano"){
    var JugadorToadette = new Jugador(_nombre = "Toadette",
      _seccionTablero = tableroAsedio, _contadorGemas = 2,
      _mazoCartas = List(Carta1, Carta2), _manoCartas = List(Carta3, Carta4))
    val Carta5 = new CartaUnidadAsedio(nombre = "Carta5", efecto = "Refuerzo moral", fuerza = 15)
    val Carta6 = new CartaClima(nombre = "Carta6", efecto = "Escarcha mordiente")
    JugadorToadette.MazoCartas_=(List(Carta5, Carta6)) // "seteamos" el campo _mazoCartas
    assert(JugadorToadette.robarCartaMazo() == Carta5)
  }

  test("Getter Nombre") {
    val JugadorToad = new Jugador(_nombre = "Toad", _seccionTablero = tableroAsedio,
      _contadorGemas = 2, _mazoCartas = List(Carta1, Carta2), _manoCartas = List(Carta3, Carta4))
    assert(JugadorToad.Nombre == "Toad")
  }

  test("Getter SeccionTablero") {
    val JugadorToad = new Jugador(_nombre = "Toad", _seccionTablero = tableroAsedio,
      _contadorGemas = 2, _mazoCartas = List(Carta1, Carta2), _manoCartas = List(Carta3, Carta4))
    assert(JugadorToad.SeccionTablero == tableroAsedio)
  }

  test("Getter ContadorGemas") {
    val JugadorToad = new Jugador(_nombre = "Toad", _seccionTablero = tableroAsedio,
      _contadorGemas = 2, _mazoCartas = List(Carta1, Carta2), _manoCartas = List(Carta3, Carta4))
    assert(JugadorToad.ContadorGemas == 2)
  }

  test("Getter MazoCartas") {
    val JugadorToad = new Jugador(_nombre = "Toad", _seccionTablero = tableroAsedio,
      _contadorGemas = 2, _mazoCartas = List(Carta1, Carta2), _manoCartas = List(Carta3, Carta4))
    assert(JugadorToad.MazoCartas == List(Carta1, Carta2))
  }

  test("Getter ManoCartas") {
    val JugadorToad = new Jugador(_nombre = "Toad", _seccionTablero = tableroAsedio,
      _contadorGemas = 2, _mazoCartas = List(Carta1, Carta2), _manoCartas = List(Carta3, Carta4))
    assert(JugadorToad.ManoCartas == List(Carta3, Carta4))
  }
  // Setters
  test("Setter SeccionTablero") {
    val JugadorToadette = new Jugador(_nombre = "Toadette",
      _seccionTablero = tableroAsedio, _contadorGemas = 2,
      _mazoCartas = List(Carta1, Carta2), _manoCartas = List(Carta3, Carta4))
    JugadorToadette.SeccionTablero_= (tableroClima)
    assert(JugadorToadette._seccionTablero == tableroClima)
  }

  test("Setter ContadorGemas") {
    val JugadorToadette = new Jugador(_nombre = "Toadette",
      _seccionTablero = tableroAsedio, _contadorGemas = 2,
      _mazoCartas = List(Carta1, Carta2), _manoCartas = List(Carta3, Carta4))
    JugadorToadette.ContadorGemas_= (1)
    assert(JugadorToadette._contadorGemas == 1)
  }

  test("Setter MazoCartas") {
    var JugadorToadette = new Jugador(_nombre = "Toadette",
      _seccionTablero = tableroAsedio, _contadorGemas = 2,
      _mazoCartas = List(Carta1, Carta2), _manoCartas = List(Carta3, Carta4))
    val Carta5 = new CartaUnidadAsedio(nombre = "Carta5", efecto = "Refuerzo moral", fuerza = 15)
    val Carta6 = new CartaClima(nombre = "Carta6", efecto = "Escarcha mordiente")
    JugadorToadette.MazoCartas_= (List(Carta5, Carta6)) // "seteamos" el campo _mazoCartas
    assert(JugadorToadette.MazoCartas() == List(Carta5, Carta6)) // obtenemos el campo _manoCartas con el getter
  }

  test("Setter ManoCartas"){
    val JugadorToadette = new Jugador(_nombre = "Toadette",
      _seccionTablero = tableroAsedio, _contadorGemas = 2,
      _mazoCartas = List(Carta1, Carta2), _manoCartas = List(Carta3, Carta4))
    val Carta5 = new CartaUnidadAsedio(nombre = "Carta5", efecto = "Refuerzo moral", fuerza = 15)
    val Carta6 = new CartaClima(nombre = "Carta6", efecto = "Escarcha mordiente")
    JugadorToadette.ManoCartas_= (List(Carta5, Carta6)) // "seteamos" el campo _manoCartas
    assert(JugadorToadette.ManoCartas == List(Carta5, Carta6)) // obtenemos el campo _manoCartas con el getter
  }

  test("barajaMazoCartas()"){
    // implementamos un test para el método barajaMazoCartas()
    val JugadorLuma = new Jugador(_nombre = "Luma", _seccionTablero = tableroAsedio,
      _contadorGemas = 2, _mazoCartas = List(Carta1, Carta2), _manoCartas = List(Carta3, Carta4))
    JugadorLuma.barajaMazoCartas()
    assert(JugadorLuma.MazoCartas().length == 2)
  }


  test("jugarCartaMano()"){
    val JugadorLuma = new Jugador(_nombre = "Luma", _seccionTablero = tableroAsedio,
      _contadorGemas = 2, _mazoCartas = List(Carta1, Carta2), _manoCartas = List(Carta3, Carta4))
    JugadorLuma.jugarCartaMano(CartaUnidadAsedioEquals)
    assertEquals(JugadorLuma.ManoCartas().length, 1)
  }

}