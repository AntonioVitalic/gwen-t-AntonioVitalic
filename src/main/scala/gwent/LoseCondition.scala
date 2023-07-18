package cl.uchile.dcc
package gwent

/**
 * Clase que representa una condición de derrota.
 * Esta condición se cumple cuando el jugador no tiene gemas.
 * Esto se usa en la clase abstracta Jugador, en su método pierdeGema()
 * @param name: Nombre de la condición de derrota.
 */
class LoseCondition(val name: String)
