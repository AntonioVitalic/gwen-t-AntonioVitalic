package cl.uchile.dcc
package gwent.Observer

import scala.collection.mutable

/**
 * Clase que representa una propiedad observable.
 * Se usa Generics.
 * @param initialValue: Valor inicial de la propiedad.
 * @param onChange: Función que se ejecuta cuando la propiedad cambia de valor.
 * @tparam V: Tipo de la propiedad.
 */
class ObservableProperty[V](initialValue: Option[V], onChange: (Option[V], V) => Unit) {
    private var _value = initialValue
    private var observers: mutable.Set[Observer[V]] = mutable.Set()

    /**
     * Método que permite obtener el valor de la propiedad.
     * @return
     */
    def value: V = _value.get

    /**
     * Método que permite cambiar el valor de la propiedad.
     * @param newValue: Nuevo valor de la propiedad.
     */
    def value_=(newValue: V): Unit = {
        onChange(_value, newValue)
        _value = Some(newValue)
    }

    /**
     * Método que permite agregar un observador a la lista de observadores.
     * @param observer: Observador a agregar.
     */
    def addObserver(observer: Observer[V]): Unit = {
        observers += observer
    }

    /**
     * Método que permite notificar a los observadores que la propiedad cambió de valor.
     * @param newValue
     */
    private def notifyObservers(newValue: V): Unit = {
        for (observer <- observers) {
            observer.update(this, newValue)
        }
    }
}
