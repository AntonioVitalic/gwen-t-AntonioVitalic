package cl.uchile.dcc
package gwent

// trait Jugador -> class Usuario y Computadora
trait Jugador(val Nombre: String, var SeccionTablero: String,
              var ContadorGemas: int, var MazoCartas: List[Carta],
              var ManoCartas: List[Carta]) {
}
class Usuario extends Jugador {
  def this(Nombre: String, SeccionTablero: String, ContadorGemas: int, MazoCartas: List[Carta], ManoCartas: List[Carta]) {
    this(Nombre, SeccionTablero, ContadorGemas, MazoCartas, ManoCartas)
  }
}

class Computadora extends Jugador {
  def this(Nombre: String, SeccionTablero: String, ContadorGemas: int, MazoCartas: List[Carta], ManoCartas: List[Carta]) {
    this(Nombre, SeccionTablero, ContadorGemas, MazoCartas, ManoCartas)
  }
}
