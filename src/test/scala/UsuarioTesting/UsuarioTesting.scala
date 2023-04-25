package cl.uchile.dcc
package UsuarioTesting
import gwent.{Carta, CartaClima, CartaUnidad, Computadora, Usuario}

import org.junit.Assert.assertThrows


/** Una clase para testear la clase Usuario.
 *
 * El Usuario se define por su nombre, su seccion del tablero, su contador de gemas, su mazo de cartas
 *
 * @constructor Crea un nuevo Usuario con su nombre, seccion del tablero, contador de gemas, mazo de cartas y mano de cartas.
 *
 * @example
 * {{{
 * val Usuario = new Usuario("Usuario", "Cuerpo a cuerpo", 2, List[Carta](), List[Carta]())
 * val Nombre = Usuario.Nombre()
 * println(s"El nombre del usuario es $Nombre")
 * }}}
 *
 * @author Antonio Vitalic
 */
class UsuarioTesting extends munit.FunSuite {
  var Usuario1MismoNombre: Usuario = _
  var Usuario2MismoNombre: Usuario = _

  var UsuarioDistancia: Usuario = _
  var UsuarioAsedio: Usuario = _
  var UsuarioClima: Usuario = _

  var Carta1: CartaUnidad = _
  var Carta2: CartaClima = _
  var Carta3: CartaUnidad = _
  var Carta4: CartaClima = _

  var UsuarioEquals: Usuario = _
  var ComputadoraEquals: Computadora = _
  var CartaUnidadEquals: CartaUnidad = _
  var CartaClimaEquals: CartaClima = _

  var UsuarioToadette: Usuario = _

  // SeccionTablero no hay que testearlo en la entrega 1
  override def beforeEach(context: BeforeEach): Unit = {
    Usuario1MismoNombre = new Usuario(_Nombre = "Mario", _SeccionTablero = "Cuerpo a cuerpo",
      _ContadorGemas = 2, _MazoCartas = List[Carta](), _ManoCartas = List[Carta]())

    Usuario2MismoNombre = new Usuario(_Nombre = "Mario", _SeccionTablero = "Cuerpo a cuerpo",
      _ContadorGemas = 2, _MazoCartas = List[Carta](), _ManoCartas = List[Carta]())

    UsuarioDistancia = new Usuario(_Nombre = "Peach", _SeccionTablero = "Distancia",
      _ContadorGemas = 2, _MazoCartas = List[Carta](), _ManoCartas = List[Carta]())

    UsuarioAsedio = new Usuario(_Nombre = "Bowser", _SeccionTablero = "Asedio",
      _ContadorGemas = 2, _MazoCartas = List[Carta](), _ManoCartas = List[Carta]())

    UsuarioClima = new Usuario(_Nombre = "DK", _SeccionTablero = "Clima",
      _ContadorGemas = 2, _MazoCartas = List[Carta](), _ManoCartas = List[Carta]())


    Carta1 = new CartaUnidad("Carta1", "Cuerpo a cuerpo", "Refuerzo moral")
    Carta2 = new CartaClima("Carta2", "Clima", "Escarcha mordiente")
    Carta3 = new CartaUnidad("Carta3", "Distancia", "Refuerzo moral")
    Carta4 = new CartaClima("Carta4", "Clima", "Niebla impenetrable")

    UsuarioEquals = new Usuario(_Nombre = "Metal Mario", _SeccionTablero = "Cuerpo a cuerpo",
      _ContadorGemas = 2, _MazoCartas = List[Carta](), _ManoCartas = List[Carta]())

    ComputadoraEquals = new Computadora(_Nombre = "ROB", _SeccionTablero = "Cuerpo a cuerpo",
      _ContadorGemas = 2, _MazoCartas = List[Carta](), _ManoCartas = List[Carta]())

    CartaUnidadEquals = new CartaUnidad("CartaUnidadEquals", "Cuerpo a cuerpo", "Refuerzo moral")

    CartaClimaEquals = new CartaClima("CartaClimaEquals", "Clima", "Escarcha mordiente")

    UsuarioToadette = new Usuario(_Nombre = "Toadette", _SeccionTablero = "Cuerpo a cuerpo",
      _ContadorGemas = 2, _MazoCartas = List[Carta](), _ManoCartas = List[Carta]())
  }

  test("Un Usuario debe tener nombre") {
    assertEquals(Usuario1MismoNombre._Nombre, "Mario")
    assertEquals(Usuario2MismoNombre._Nombre, "Mario")
    assertEquals(UsuarioDistancia._Nombre, "Peach")
    assertEquals(UsuarioAsedio._Nombre, "Bowser")
    assertEquals(UsuarioClima._Nombre, "DK")
  }

  test("Un Usuario debe jugar en una sección del tablero") {
    assertEquals(Usuario1MismoNombre._SeccionTablero, "Cuerpo a cuerpo")
    assertEquals(Usuario2MismoNombre._SeccionTablero, "Cuerpo a cuerpo")
    assertEquals(UsuarioDistancia._SeccionTablero, "Distancia")
    assertEquals(UsuarioAsedio._SeccionTablero, "Asedio")
    assertEquals(UsuarioClima._SeccionTablero, "Clima")
  }

  test("Un Usuario debe tener ContadorGemas igual a 2") {
    assertEquals(Usuario1MismoNombre._ContadorGemas, 2)
    assertEquals(Usuario2MismoNombre._ContadorGemas, 2)
    assertEquals(UsuarioDistancia._ContadorGemas, 2)
    assertEquals(UsuarioAsedio._ContadorGemas, 2)
    assertEquals(UsuarioClima._ContadorGemas, 2)
  }

  test("Dos Usuarios con el mismo Nombre, SeccionTablero y ContadorGemas, pero con distinto nombre de objeto,  son iguales") {
    assertEquals(Usuario1MismoNombre.##, Usuario2MismoNombre.##)
  }

  test("Un Usuario debe tener un mazo de cartas") {
    assertEquals(Usuario1MismoNombre._MazoCartas, List[Carta]())
    assertEquals(Usuario2MismoNombre._MazoCartas, List[Carta]())
    assertEquals(UsuarioDistancia._MazoCartas, List[Carta]())
    assertEquals(UsuarioAsedio._MazoCartas, List[Carta]())
    assertEquals(UsuarioClima._MazoCartas, List[Carta]())
  }

  test("Un Usuario debe tener una mano de cartas") {
    assertEquals(Usuario1MismoNombre._ManoCartas, List[Carta]())
    assertEquals(Usuario2MismoNombre._ManoCartas, List[Carta]())
    assertEquals(UsuarioDistancia._ManoCartas, List[Carta]())
    assertEquals(UsuarioAsedio._ManoCartas, List[Carta]())
    assertEquals(UsuarioClima._ManoCartas, List[Carta]())
  }


  test("Luego de robar una carta, la cantidad de cartas de un Usuario (_ManoCartas, siendo un List[Carta]) debe aumentar en 1, y la cantidad de cartas del mazo (_MazoCartas, siendo un List[Carta]) debe disminuir en 1") {
    UsuarioDistancia._ManoCartas = List(Carta1, Carta2)
    UsuarioDistancia._MazoCartas = List(Carta3, Carta4)
    UsuarioDistancia.RobarCartaMazo()

    assertEquals(UsuarioDistancia._ManoCartas.length, 3)
    assertEquals(UsuarioDistancia._MazoCartas.length, 1)
  }

  test("Un Usuario no es una Computadora") {
    assert(!UsuarioEquals.equals(ComputadoraEquals))
  }

  test("Un Usuario no es una CartaUnidad") {
    assert(!UsuarioEquals.equals(CartaUnidadEquals))
  }

  test("Un Usuario no es una CartaClima") {
    assert(!UsuarioEquals.equals(CartaClimaEquals))
  }

  test("Getter Nombre") {
    val UsuarioToad = new Usuario(_Nombre = "Toad", _SeccionTablero = "Cuerpo a cuerpo",
      _ContadorGemas = 2, _MazoCartas = List[Carta](), _ManoCartas = List[Carta]())
    assert(UsuarioToad.Nombre == "Toad")
  }

  test("Getter SeccionTablero") {
    val UsuarioToad = new Usuario(_Nombre = "Toad", _SeccionTablero = "Cuerpo a cuerpo",
      _ContadorGemas = 2, _MazoCartas = List[Carta](), _ManoCartas = List[Carta]())
    assert(UsuarioToad.SeccionTablero == "Cuerpo a cuerpo")
  }

  test("Getter ContadorGemas") {
    val UsuarioToad = new Usuario(_Nombre = "Toad", _SeccionTablero = "Cuerpo a cuerpo",
      _ContadorGemas = 2, _MazoCartas = List[Carta](), _ManoCartas = List[Carta]())
    assert(UsuarioToad.ContadorGemas == 2)
  }

  test("Getter MazoCartas") {
    val UsuarioToad = new Usuario(_Nombre = "Toad", _SeccionTablero = "Cuerpo a cuerpo",
      _ContadorGemas = 2, _MazoCartas = List[Carta](), _ManoCartas = List[Carta]())
    assert(UsuarioToad.MazoCartas == List[Carta]())
  }

  test("Getter ManoCartas") {
    val UsuarioToad = new Usuario(_Nombre = "Toad", _SeccionTablero = "Cuerpo a cuerpo",
      _ContadorGemas = 2, _MazoCartas = List[Carta](), _ManoCartas = List[Carta]())
    assert(UsuarioToad.ManoCartas == List[Carta]())
  }

  test("Setter SeccionTablero") {
    UsuarioToadette.SeccionTablero_= ("Distancia")
    assert(UsuarioToadette._SeccionTablero == "Distancia")
  }

  test("Setter ContadorGemas") {
    UsuarioToadette.ContadorGemas_= (1)
    assert(UsuarioToadette._ContadorGemas == 1)
  }

  test("_MazoCartas es vacío") {
    val UsuarioLuma = new Usuario(_Nombre = "Luma", _SeccionTablero = "Cuerpo a cuerpo",
      _ContadorGemas = 2, _MazoCartas = List(), _ManoCartas = List[Carta]())
    assert(UsuarioLuma._MazoCartas.isEmpty)
    UsuarioLuma.RobarCartaMazo()
    assertEquals(UsuarioLuma._MazoCartas.length, 0)
  }
}
