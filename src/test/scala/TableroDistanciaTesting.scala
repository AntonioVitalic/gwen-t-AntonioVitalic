package cl.uchile.dcc

import cl.uchile.dcc.gwent.Cartas.{CartaClima, CartaUnidadAsedio, CartaUnidadCuerpo, CartaUnidadDistancia}
import cl.uchile.dcc.gwent.Tableros.{TableroAsedio, TableroClima, TableroCuerpo, TableroDistancia}

class TableroDistanciaTesting extends munit.FunSuite{
  var TableroDistancia: TableroDistancia = _
  var TableroDistanciaVacio: TableroDistancia = _

  var TableroCuerpo: TableroCuerpo = _
  var TableroClima: TableroClima = _
  var TableroAsedio: TableroAsedio = _

  override def beforeEach(context: BeforeEach): Unit = {
    TableroDistancia = new TableroDistancia(List[CartaUnidadDistancia]())
    TableroDistanciaVacio = new TableroDistancia(conjuntoCartas = List.empty)
    TableroCuerpo = new TableroCuerpo(List[CartaUnidadCuerpo]())
    TableroClima = new TableroClima(List[CartaClima]())
    TableroAsedio = new TableroAsedio(List[CartaUnidadAsedio]())
  }

  test("Un TableroDistancia no es un TableroClima") {
    assert(TableroDistancia!= TableroClima)
  }

  test("Un TableroDistancia no es un TableroCuerpo") {
    assert(TableroDistancia != TableroCuerpo)
  }

  test("Un TableroClima no es un TableroAsedio") {
    assert(TableroDistancia != TableroAsedio)
  }

  test("Uso de método anadirCarta") {
    val cartaDistancia1 = new CartaUnidadDistancia(nombre = "carta1", efecto = "efecto", fuerza = 10)
    val cartaDistancia2 = new CartaUnidadDistancia(nombre = "carta2", efecto = "efecto", fuerza = 10)
    TableroDistanciaVacio.anadirCarta(cartaDistancia1)
  }
}
