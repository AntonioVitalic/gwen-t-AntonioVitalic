package cl.uchile.dcc
package gwent.Jugadores

import gwent.Tableros.Tablero

import cl.uchile.dcc.gwent.Cartas.{Carta, CartaClima, CartaUnidadAsedio, CartaUnidadCuerpo, CartaUnidadDistancia}

import scala.collection.mutable.ListBuffer

class CPU (_nombre: String, _seccionTablero: Tablero, _mazoCartas: ListBuffer[Carta],
           _manoCartas: ListBuffer[Carta]) extends Jugador (_nombre, _seccionTablero,
  _mazoCartas, _manoCartas) {

  override def jugarEnAsedio(carta: CartaUnidadAsedio): Unit = {
    _seccionTablero.agregarEnAsedioCPU(carta)
  }

  override def jugarEnCuerpo(carta: CartaUnidadCuerpo): Unit = {
    _seccionTablero.agregarEnCuerpoCPU(carta)
  }

  override def jugarEnDistancia(carta: CartaUnidadDistancia): Unit = {
    _seccionTablero.agregarEnDistanciaCPU(carta)
  }

  override def jugarEnClima(carta: CartaClima): Unit = {
    _seccionTablero.agregarEnClima(carta)
  }
}
