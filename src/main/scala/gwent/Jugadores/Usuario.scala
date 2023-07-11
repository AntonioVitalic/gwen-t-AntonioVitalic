package cl.uchile.dcc
package gwent.Jugadores

import gwent.Cartas.{Carta, CartaClima, CartaUnidadAsedio, CartaUnidadCuerpo, CartaUnidadDistancia}
import gwent.Tableros.Tablero

import scala.collection.mutable.ListBuffer

class Usuario (_nombre: String, _seccionTablero: Tablero, _mazoCartas: ListBuffer[Carta],
               _manoCartas: ListBuffer[Carta]) extends Jugador (_nombre, _seccionTablero,
  _mazoCartas, _manoCartas) {

  override def jugarEnAsedio(carta: CartaUnidadAsedio): Unit = {
    _seccionTablero.agregarEnAsedioUsuario(carta)
  }

  override def jugarEnCuerpo(carta: CartaUnidadCuerpo): Unit = {
    _seccionTablero.agregarEnCuerpoUsuario(carta)
  }

  override def jugarEnDistancia(carta: CartaUnidadDistancia): Unit = {
    _seccionTablero.agregarEnDistanciaUsuario(carta)
  }

  override def jugarEnClima(carta: CartaClima): Unit = {
    _seccionTablero.agregarEnClima(carta)
  }

}
