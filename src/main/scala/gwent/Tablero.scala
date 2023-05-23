package cl.uchile.dcc
package gwent

abstract class AbstractTablero {
  val tableroAsedio : TableroAsedio = new TableroAsedio( List[CartaUnidadAsedio]())
  val tableroCuerpo: TableroCuerpo = new TableroCuerpo(List[CartaUnidadCuerpo]())
  val tableroDistancia: TableroDistancia = new TableroDistancia(List[CartaUnidadDistancia]())
  val tableroClima : TableroClima = new TableroClima(List[CartaClima]())

  def anadirCarta(carta : Carta) : Unit = {}

}

class TableroAsedio(private var conjuntoCartas: List[CartaUnidadAsedio]) extends AbstractTablero {

  override def anadirCarta(carta : Carta): Unit = {
    carta.anadirCartaAsedio(this)
  }

  def anadirCartaAsedio(cartaAsedio: CartaUnidadAsedio): Unit = {
    conjuntoCartas = cartaAsedio :: conjuntoCartas
  }
}

class TableroCuerpo(private var conjuntoCartas: List[CartaUnidadCuerpo]) extends AbstractTablero {

  override def anadirCarta(carta: Carta): Unit = {
    carta.anadirCartaCuerpo(this)
  }

  def anadirCartaCuerpo(cartaCuerpo: CartaUnidadCuerpo): Unit = {
    conjuntoCartas = cartaCuerpo :: conjuntoCartas
  }
}

class TableroDistancia(private var conjuntoCartas: List[CartaUnidadDistancia]) extends AbstractTablero{

    override def anadirCarta(carta: Carta): Unit = {
      carta.anadirCartaDistancia(this)
    }

    def anadirCartaDistancia(cartaDistancia: CartaUnidadDistancia): Unit = {
      conjuntoCartas = cartaDistancia :: conjuntoCartas
    }
}

class TableroClima(private var conjuntoCartas: List[CartaClima]) extends AbstractTablero{

  override def anadirCarta(carta: Carta): Unit = {
    carta.anadirCartaClima(this)
  }

  def anadirCartaClima(cartaClima: CartaClima): Unit = {
    conjuntoCartas = cartaClima :: conjuntoCartas
  }
}