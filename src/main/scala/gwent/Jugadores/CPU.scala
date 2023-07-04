package cl.uchile.dcc
package gwent.Jugadores

import gwent.Tableros.Tablero

import cl.uchile.dcc.gwent.Cartas.Carta

import scala.collection.mutable.ListBuffer

class CPU (_nombre: String, _seccionTablero: Tablero, _mazoCartas: ListBuffer[Carta],
           _manoCartas: ListBuffer[Carta]) extends Jugador (_nombre, _seccionTablero,
  _mazoCartas, _manoCartas) {

}
