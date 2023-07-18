package cl.uchile.dcc
package gwent.Observer

/**
 * Clase abstracta que representa un sujeto. Esta clase implementa la interfaz Subject.
 * Se usa Generics.
 * @tparam T
 */
abstract class AbstractSubject[T] extends Subject[T] {
  private var observers: List[Observer[T]] = Nil

  /**
   * Método que permite agregar un observador a la lista de observadores.
   * @param observer
   */
  override def addObserver(observer: Observer[T]): Unit = {
    observers = observer :: observers
  }

  /**
   * Método que permite eliminar un observador de la lista de observadores.
   * @param observer
   */
  override def notifyObservers(value: T): Unit = {
    for (observer <- observers) {
      observer.update(this, value)
    }
  }
}
