package cl.uchile.dcc

import cl.uchile.dcc.gwent.Cartas.{CartaClima, CartaUnidadAsedio, CartaUnidadCuerpo, CartaUnidadDistancia}
import cl.uchile.dcc.gwent.Tableros.{TableroAsedio, TableroClima, TableroCuerpo, TableroDistancia}

class TableroClimaTesting extends munit.FunSuite{
  var TableroClima: TableroClima = _
  var TableroClimaVacio: TableroClima = _

  var TableroCuerpo: TableroCuerpo = _
  var TableroDistancia: TableroDistancia = _
  var TableroAsedio: TableroAsedio = _

  override def beforeEach(context: BeforeEach): Unit = {
    TableroClima = new TableroClima(List[CartaClima]())
    TableroClimaVacio = new TableroClima(conjuntoCartas = List.empty)
    TableroCuerpo = new TableroCuerpo(List[CartaUnidadCuerpo]())
    TableroDistancia = new TableroDistancia(List[CartaUnidadDistancia]())
    TableroAsedio= new TableroAsedio(List[CartaUnidadAsedio]())
  }

  test("Un TableroClima no es un TableroClima") {
    assert(TableroClima != TableroCuerpo)
  }

  test("Un TableroClima no es un TableroDistancia") {
    assert(TableroClima != TableroDistancia)
  }

  test("Un TableroClima no es un TableroAsedio") {
    assert(TableroClima != TableroAsedio)
  }

  test("Uso de método anadirCarta") {
    val cartaClima1 = new CartaClima(nombre = "carta1", efecto = "efecto")
    val cartaClima2 = new CartaClima(nombre = "carta2", efecto = "efecto")
    TableroClimaVacio.anadirCarta(cartaClima1)
  }
}
