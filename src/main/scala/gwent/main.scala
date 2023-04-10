package cl.uchile.dcc
package gwent

trait Jugador{
}

trait AccionesJugador {
  def JugarCartaMano(): Unit = {}

  def RobarCartaMazo(): Unit = {}
}

class Usuario(val Nombre: String, var SeccionTablero: String,
              var ContadorGemas: Int = 2, var MazoCartas: List[Carta],
              var ManoCartas: List[Carta]) extends Jugador with AccionesJugador{
}


class Computadora(val Nombre: String, var SeccionTablero: String,
                  var ContadorGemas: Int = 2, var MazoCartas: List[Carta],
                  var ManoCartas: List[Carta]) extends Jugador with AccionesJugador{
}

// Para la entrega 1, solo se pide la seccion 1.1 Jugador y 1.3 Cartas, por lo que
// no se implementarán los efectos de las cartas

trait Carta{
}

class CartaUnidad(val SeccionTablero: String, val Efecto: String) extends Carta{
  // SeccionTablero puede ser "Zona de combate cuerpo a cuerpo", "Zona de combate distancia" o "Zona de asedio"
  // Efecto puede ser "Refuerzo moral" o "Vinculo estrecho"

}

class CartaClima(val Efecto: String) extends Carta{
  // Efecto puede ser "Escarcha mordiente", "Niebla impenetrable", "Lluvia torrencial" o "Clima despejado"
}
