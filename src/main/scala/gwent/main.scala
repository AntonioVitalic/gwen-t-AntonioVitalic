package cl.uchile.dcc
package gwent

// trait Jugador -> class Usuario y Computadora
trait Jugador(val Nombre: String, var SeccionTablero: String,
              var ContadorGemas: int, var MazoCartas: List[Carta],
              var ManoCartas: List[Carta]) {
}

trait AccionesJugador {
  def JugarCartaMano: Unit

  def RobarCartaMazo: Unit
}

class Usuario extends Jugador with AccionesJugador{
  def this(Nombre: String, SeccionTablero: String, ContadorGemas: int,
           MazoCartas: List[Carta], ManoCartas: List[Carta]): Any : Unit = {
    this(Nombre, SeccionTablero, ContadorGemas, MazoCartas, ManoCartas)
  }
}

class Computadora extends Jugador with AccionesJugador{
  def this(Nombre: String, SeccionTablero: String, ContadorGemas: int,
           MazoCartas: List[Carta], ManoCartas: List[Carta]) {
    this(Nombre, SeccionTablero, ContadorGemas, MazoCartas, ManoCartas)
  }
}

// Para la entrega 1, solo se pide la seccion 1.1 Jugador y 1.3 Cartas, por lo que
// no se implementarán los efectos de las cartas
trait Carta(var Clasificacion: String){

}

class CartaUnidad extends Carta{

}

class CartaClima extends Carta{

}
