package cl.uchile.dcc
package gwent.Jugadores

import gwent.Cartas.Carta
import gwent.Tableros.Tablero

import scala.collection.mutable.ListBuffer

class Usuario (_nombre: String, _seccionTablero: Tablero, _mazoCartas: ListBuffer[Carta],
               _manoCartas: ListBuffer[Carta]) extends Jugador (_nombre, _seccionTablero,
  _mazoCartas, _manoCartas){

}
