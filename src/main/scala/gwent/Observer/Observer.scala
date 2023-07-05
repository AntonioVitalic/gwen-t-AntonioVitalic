package cl.uchile.dcc
package gwent.Observer

trait Observer[T] {
  def update(observable: Subject[T], value: T): Unit
}
