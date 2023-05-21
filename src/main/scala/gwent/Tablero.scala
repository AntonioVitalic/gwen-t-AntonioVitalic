package cl.uchile.dcc
package gwent

abstract class TableroAsedio{
  def jugarCarta(carta : CartaUnidadAsedio) : Unit
}

abstract class TableroCuerpo{
  def jugarCarta(carta : CartaUnidadCuerpo) : Unit
}

abstract class TableroDistancia{
  def jugarCarta(carta : CartaUnidadDistancia) : Unit
}

abstract class TableroClima{
  def jugarCarta(carta : CartaClima) : Unit
}

class Tablero {
  val tableroAsedio = new TableroAsedio()
  val tableroCuerpo = new TableroCuerpo()
  val tableroDistancia = new TableroDistancia()
  val tableroClima = new TableroClima()

  def jugarCartaAsedio(carta: CartaUnidadAsedio): Unit = {
    tableroAsedio.jugarCarta(carta)
  }

  def jugarCartaCuerpo(carta : CartaUnidadCuerpo) : Unit = {
    tableroCuerpo.jugarCarta(carta)
  }

  def jugarCartaDistancia(carta : CartaUnidadDistancia) : Unit = {
    tableroDistancia.jugarCarta(carta)
  }

  def jugarCartaClima(carta : CartaClima) : Unit = {
    tableroClima.jugarCarta(carta)
  }
}

