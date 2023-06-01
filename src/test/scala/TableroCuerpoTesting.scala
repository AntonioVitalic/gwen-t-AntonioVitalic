package cl.uchile.dcc

import cl.uchile.dcc.gwent.Cartas.{CartaClima, CartaUnidadAsedio, CartaUnidadCuerpo, CartaUnidadDistancia}
import cl.uchile.dcc.gwent.Tableros.{TableroAsedio, TableroClima, TableroCuerpo, TableroDistancia}

class TableroCuerpoTesting extends munit.FunSuite{
  var TableroCuerpo: TableroCuerpo = _
  var TableroCuerpoVacio: TableroCuerpo = _

  var TableroAsedio: TableroAsedio = _
  var TableroDistancia: TableroDistancia = _
  var TableroClima: TableroClima = _

  override def beforeEach(context: BeforeEach): Unit = {
    TableroCuerpo = new TableroCuerpo(List[CartaUnidadCuerpo]())
    TableroCuerpoVacio = new TableroCuerpo(conjuntoCartas = List.empty)
    TableroAsedio = new TableroAsedio(List[CartaUnidadAsedio]())
    TableroDistancia = new TableroDistancia(List[CartaUnidadDistancia]())
    TableroClima = new TableroClima(List[CartaClima]())
  }

  test("Un TableroCuerpo no es un TableroAsedio") {
    assert(TableroCuerpo != TableroAsedio)
  }

  test("Un TableroCuerpo no es un TableroDistancia") {
    assert(TableroCuerpo != TableroDistancia)
  }

  test("Un TableroCuerpo no es un TableroClima") {
    assert(TableroCuerpo != TableroClima)
  }

  test("Uso de método anadirCarta") {
    val cartaCuerpo1 = new CartaUnidadCuerpo(nombre = "carta1", efecto = "efecto", fuerza = 10)
    val cartaCuerpo2 = new CartaUnidadCuerpo(nombre = "carta2", efecto = "efecto", fuerza = 10)
    TableroCuerpoVacio.anadirCarta(cartaCuerpo1)
  }
}
