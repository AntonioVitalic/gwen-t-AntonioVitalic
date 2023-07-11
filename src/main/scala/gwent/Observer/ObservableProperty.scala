package cl.uchile.dcc
package gwent.Observer

import scala.collection.mutable

class ObservableProperty[V](initialValue: Option[V], onChange: (Option[V], V) => Unit) {
    private var _value = initialValue
    private var observers: mutable.Set[Observer[V]] = mutable.Set()

    def value: V = _value.get

    def value_=(newValue: V): Unit = {
        onChange(_value, newValue)
        _value = Some(newValue)
    }

    def addObserver(observer: Observer[V]): Unit = {
        observers += observer
    }

    private def notifyObservers(newValue: V): Unit = {
        for (observer <- observers) {
            observer.update(this, newValue)
        }
    }
}
