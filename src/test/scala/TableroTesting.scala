package cl.uchile.dcc

import gwent.Tableros.Tablero

import cl.uchile.dcc.gwent.Cartas.{CartaUnidadAsedio, CartaUnidadCuerpo, CartaUnidadDistancia}
import cl.uchile.dcc.gwent.Jugadores.{CPU, Jugador}

class TableroTesting extends munit.FunSuite{
  var Tablero: Tablero = _
  var Jugador: Jugador = _
  var CPU: CPU = _

  override def beforeEach(context: BeforeEach): Unit = {
    Tablero = new Tablero()
  }

  test("Un Tablero no es un Jugador") {
    assert(Tablero != Jugador)
  }

  test("Uso de método agregarEnAsedioUsuario") {
    val cartaAsedio1 = new CartaUnidadAsedio(nombre = "carta1", efecto = "efecto", fuerza = 10)
    val cartaAsedio2 = new CartaUnidadAsedio(nombre = "carta2", efecto = "efecto", fuerza = 10)
    Tablero.agregarEnAsedioUsuario(cartaAsedio1)
    Tablero.agregarEnAsedioUsuario(cartaAsedio2)
  }

  test("Uso de método agregarEnCuerpoUsuario") {
    val cartaCuerpo1 = new CartaUnidadCuerpo(nombre = "carta1", efecto = "efecto", fuerza = 10)
    val cartaCuerpo2 = new CartaUnidadCuerpo(nombre = "carta2", efecto = "efecto", fuerza = 10)
    Tablero.agregarEnCuerpoUsuario(cartaCuerpo1)
    Tablero.agregarEnCuerpoUsuario(cartaCuerpo2)
  }

  test("Uso de método agregarEnDistanciaUsuario") {
    val cartaDistancia1 = new CartaUnidadDistancia(nombre = "carta1", efecto = "efecto", fuerza = 10)
    val cartaDistancia2 = new CartaUnidadDistancia(nombre = "carta2", efecto = "efecto", fuerza = 10)
    Tablero.agregarEnDistanciaUsuario(cartaDistancia1)
    Tablero.agregarEnDistanciaUsuario(cartaDistancia2)
  }

  test("Uso de método agregarEnAsedioCPU") {
    val cartaAsedio1 = new CartaUnidadAsedio(nombre = "carta1", efecto = "efecto", fuerza = 10)
    val cartaAsedio2 = new CartaUnidadAsedio(nombre = "carta2", efecto = "efecto", fuerza = 10)
    Tablero.agregarEnAsedioCPU(cartaAsedio1)
    Tablero.agregarEnAsedioCPU(cartaAsedio2)
  }

  test("Uso de método agregarEnCuerpoUsuario") {
    val cartaCuerpo1 = new CartaUnidadCuerpo(nombre = "carta1", efecto = "efecto", fuerza = 10)
    val cartaCuerpo2 = new CartaUnidadCuerpo(nombre = "carta2", efecto = "efecto", fuerza = 10)
    Tablero.agregarEnCuerpoCPU(cartaCuerpo1)
    Tablero.agregarEnCuerpoCPU(cartaCuerpo2)
  }

  test("Uso de método agregarEnDistanciaUsuario") {
    val cartaDistancia1 = new CartaUnidadDistancia(nombre = "carta1", efecto = "efecto", fuerza = 10)
    val cartaDistancia2 = new CartaUnidadDistancia(nombre = "carta2", efecto = "efecto", fuerza = 10)
    Tablero.agregarEnDistanciaCPU(cartaDistancia1)
    Tablero.agregarEnDistanciaCPU(cartaDistancia2)
  }
}
