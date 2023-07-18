package cl.uchile.dcc
package gwent.Estados

/**
 * Clase que representa una excepción que ocurre cuando se intenta cambiar de estado de forma inválida.
 * @param message: Mensaje de error.
 */
class InvalidTransitionException(message: String)
  extends Exception(message)
