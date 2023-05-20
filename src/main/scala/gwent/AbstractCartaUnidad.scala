package cl.uchile.dcc
package gwent

abstract class AbstractCartaUnidad protected(val nombre: String, val efecto: String,
                                             val fuerza: Int) extends Carta {

  /** La fuerza actual de la carta, que puede verse afectada por diversas condiciones durante
   * el desarrollo del juego.
   * Establecido inicialmente en la [[fuerza]] base de la carta.
   */
  var fuerzaActual: Int = fuerza
}


