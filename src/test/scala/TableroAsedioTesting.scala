package cl.uchile.dcc

import cl.uchile.dcc.gwent.Cartas.{CartaClima, CartaUnidadAsedio, CartaUnidadCuerpo, CartaUnidadDistancia}
import cl.uchile.dcc.gwent.Tableros.{TableroAsedio, TableroClima, TableroCuerpo, TableroDistancia}

class TableroAsedioTesting extends munit.FunSuite{
  var TableroAsedio: TableroAsedio = _
  var TableroAsedioVacio: TableroAsedio = _

  var TableroCuerpo: TableroCuerpo = _
  var TableroDistancia: TableroDistancia = _
  var TableroClima: TableroClima = _

  override def beforeEach(context: BeforeEach): Unit = {
    TableroAsedio = new TableroAsedio(List[CartaUnidadAsedio]())
    TableroAsedioVacio = new TableroAsedio(conjuntoCartas = List.empty)
    TableroCuerpo = new TableroCuerpo(List[CartaUnidadCuerpo]())
    TableroDistancia = new TableroDistancia(List[CartaUnidadDistancia]())
    TableroClima = new TableroClima(List[CartaClima]())
  }
  test("Un TableroAsedio no es un TableroCuerpo"){
    assert(TableroAsedio != TableroCuerpo)
  }

  test("Un TableroAsedio no es un TableroDistancia"){
    assert(TableroAsedio != TableroDistancia)
  }

  test("Un TableroAsedio no es un TableroClima"){
    assert(TableroAsedio != TableroClima)
  }

  test("Uso de método anadirCarta"){
    val cartaAsedio1 = new CartaUnidadAsedio(nombre = "carta1", efecto = "efecto", fuerza = 10)
    val cartaAsedio2 = new CartaUnidadAsedio(nombre = "carta2", efecto = "efecto", fuerza = 10)
    TableroAsedioVacio.anadirCarta(cartaAsedio1)
  }
}
