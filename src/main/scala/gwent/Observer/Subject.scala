package cl.uchile.dcc
package gwent.Observer

/**
 * Interfaz que representa a un sujeto.
 * Se usa Generics.
 * @tparam T
 */
trait Subject[T] {

  /**
   * Método que permite agregar un observador a la lista de observadores.
   * @param observer
   */
  def addObserver(observer: Observer[T]): Unit

  /**
   * Método que permite eliminar un observador de la lista de observadores.
   * @param value
   */
  def notifyObservers(value: T): Unit
}
