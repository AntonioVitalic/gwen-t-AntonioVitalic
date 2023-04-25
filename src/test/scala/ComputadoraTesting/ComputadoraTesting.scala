package cl.uchile.dcc
package ComputadoraTesting

import gwent.{Carta, CartaClima, CartaUnidad, Computadora}


/** Una clase para testear la clase Computadora.
 *
 * La Computadora se define por su nombre, su seccion del tablero, su contador de gemas, su mazo de cartas
 *
 * @constructor Crea una nueva Computadora con su nombre, seccion del tablero, contador de gemas, mazo de cartas y mano de cartas.
 *
 * @example
 * {{{
 * val Computadora = new Computadora("Computadora", "Cuerpo a cuerpo", 2, List[Carta](), List[Carta]())
 * val Computadora = Computadora.Nombre()
 * println(s"El nombre de la computadora es $Nombre")
 * }}}
 *
 * @author Antonio Vitalic
 */
class ComputadoraTesting extends munit.FunSuite {
  var Computadora1MismoNombre: Computadora = _
  var Computadora2MismoNombre: Computadora = _

  var ComputadoraDistancia: Computadora = _
  var ComputadoraAsedio: Computadora = _
  var ComputadoraClima: Computadora = _

  var Carta1: CartaUnidad = _
  var Carta2: CartaClima = _
  var Carta3: CartaUnidad = _
  var Carta4: CartaClima = _

  // SeccionTablero no hay que testearlo en la entrega 1
  override def beforeEach(context: BeforeEach): Unit = {
    Computadora1MismoNombre = new Computadora(_Nombre = "Mismo Nombre", _SeccionTablero = "Cuerpo a cuerpo",
      _ContadorGemas = 2, _MazoCartas = List[Carta](), _ManoCartas = List[Carta]())
    Computadora2MismoNombre = new Computadora(_Nombre = "Mismo Nombre", _SeccionTablero = "Cuerpo a cuerpo",
      _ContadorGemas = 2, _MazoCartas = List[Carta](), _ManoCartas = List[Carta]())

    ComputadoraDistancia = new Computadora(_Nombre = "Windows", _SeccionTablero = "Distancia",
      _ContadorGemas = 2, _MazoCartas = List[Carta](), _ManoCartas = List[Carta]())

    ComputadoraAsedio = new Computadora(_Nombre = "Mac", _SeccionTablero = "Asedio",
      _ContadorGemas = 2, _MazoCartas = List[Carta](), _ManoCartas = List[Carta]())

    ComputadoraClima = new Computadora(_Nombre = "Linux", _SeccionTablero = "Clima",
      _ContadorGemas = 2, _MazoCartas = List[Carta](), _ManoCartas = List[Carta]())

    Carta1 = new CartaUnidad("Carta1", "Cuerpo a cuerpo", "Refuerzo moral")
    Carta2 = new CartaClima("Carta2", "Clima", "Escarcha mordiente")
    Carta3 = new CartaUnidad("Carta3", "Distancia", "Refuerzo moral")
    Carta4 = new CartaClima("Carta4", "Clima", "Niebla impenetrable")


  }

  test("Una Computadora debe tener nombre") {
    assertEquals(ComputadoraDistancia._Nombre, "Windows")
    assertEquals(ComputadoraAsedio._Nombre, "Mac")
    assertEquals(ComputadoraClima._Nombre, "Linux")
  }

  test("Una Computadora debe jugar en una sección del tablero") {
    assertEquals(ComputadoraDistancia._SeccionTablero, "Distancia")
    assertEquals(ComputadoraAsedio._SeccionTablero, "Asedio")
    assertEquals(ComputadoraClima._SeccionTablero, "Clima")
  }

  test("Una Computadora debe tener ContadorGemas igual a 2") {
    assertEquals(ComputadoraDistancia._ContadorGemas, 2)
    assertEquals(ComputadoraAsedio._ContadorGemas, 2)
    assertEquals(ComputadoraClima._ContadorGemas, 2)
  }


  test("Una Computadora debe tener un mazo de cartas") {
    assertEquals(ComputadoraDistancia._MazoCartas, List[Carta]())
    assertEquals(ComputadoraAsedio._MazoCartas, List[Carta]())
    assertEquals(ComputadoraClima._MazoCartas, List[Carta]())
  }

  test("Una Computadora debe tener una mano de cartas") {
    assertEquals(ComputadoraDistancia._ManoCartas, List[Carta]())
    assertEquals(ComputadoraAsedio._ManoCartas, List[Carta]())
    assertEquals(ComputadoraClima._ManoCartas, List[Carta]())
  }


  test("Dos Computadoras con el mismo Nombre, SeccionTablero y ContadorGemas, pero con distinto nombre de objeto,  son iguales") {
    assertEquals(Computadora1MismoNombre.##, Computadora2MismoNombre.##)
  }

  test("Luego de robar una carta, la cantidad de cartas de una Computadora (_ManoCartas, siendo un List[Carta]) debe aumentar en 1, y la cantidad de cartas del mazo (_MazoCartas, siendo un List[Carta]) debe disminuir en 1") {
    ComputadoraDistancia._ManoCartas = List(Carta1, Carta2)
    ComputadoraDistancia._MazoCartas = List(Carta3, Carta4)
    ComputadoraDistancia.RobarCartaMazo()

    assertEquals(ComputadoraDistancia._ManoCartas.length, 3)
    assertEquals(ComputadoraDistancia._MazoCartas.length, 1)
  }

}

