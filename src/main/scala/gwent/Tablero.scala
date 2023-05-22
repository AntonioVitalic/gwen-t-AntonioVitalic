package cl.uchile.dcc
package gwent

abstract class AbstractTablero {
  val tableroAsedio: TableroAsedio = new TableroAsedio()
  val tableroCuerpo: TableroCuerpo = new TableroCuerpo()
  val tableroDistancia: TableroDistancia = new TableroDistancia()
  val tableroClima : TableroClima = new TableroClima()

  def anadirCarta(carta : Carta) : Unit = {}
}

class TableroAsedio(private var conjuntoCartas: List[CartaUnidadAsedio] =
                    List[CartaUnidadAsedio]) extends AbstractTablero {

  def anadirCarta(cartaAsedio: CartaUnidadAsedio): Unit = {
    conjuntoCartas = cartaAsedio :: conjuntoCartas
  }
}

class TableroCuerpo(private var conjuntoCartas: List[CartaUnidadAsedio] =
                    List[CartaUnidadAsedio]) extends AbstractTablero {

  def anadirCarta(cartaCuerpo: CartaUnidadCuerpo): Unit = {
    conjuntoCartas = cartaCuerpo :: conjuntoCartas
  }
}


class TableroDistancia(private var conjuntoCartas: List[CartaUnidadAsedio] =
                       List[CartaUnidadAsedio]) extends AbstractTablero{

  def anadirCarta(cartaDistancia: CartaUnidadDistancia): Unit = {
    conjuntoCartas = cartaDistancia :: conjuntoCartas
  }
}

class TableroClima(private var conjuntoCartas: List[CartaUnidadAsedio] =
                   List[CartaUnidadAsedio]) extends AbstractTablero{
  def anadirCarta(cartaClima: CartaClima): Unit = {
    conjuntoCartas = cartaClima :: conjuntoCartas
  }
}