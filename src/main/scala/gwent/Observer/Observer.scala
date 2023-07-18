package cl.uchile.dcc
package gwent.Observer

/**
 * Interfaz que representa a un observador.
 * Se usa Generics.
 * @tparam T
 */
trait Observer[T] {
  /**
   * Método que permite actualizar el estado de un observador.
   * @param observable
   * @param value
   */
  def update(observable: Subject[T], value: T): Unit
}
