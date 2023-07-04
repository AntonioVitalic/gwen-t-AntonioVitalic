package cl.uchile.dcc
package gwent.Tableros

import gwent.Cartas.{CartaClima, CartaUnidadAsedio, CartaUnidadCuerpo}

import cl.uchile.dcc.gwent.Jugadores.{CPU, Usuario}

import scala.collection.mutable.ListBuffer

/**
 * Interfaz que representa un tablero.
 *
 * @author Antonio Vitalic
 */


class Tablero {
  def agregarAAsedio(carta: CartaUnidadAsedio): Unit

  def agregarACuerpo(carta: CartaUnidadCuerpo): Unit

  def agregarADistancia(carta: CartaUnidadAsedio): Unit

  def agregarAClima(carta: CartaClima): Unit

  private var usuario = new Usuario("Usuario", this,_mazoCartas = ???, _manoCartas = ???)
  private var cpu = new CPU("CPU", this, _mazoCartas = ???, _manoCartas = ???)

  private var cartasAsedioUsuario = ListBuffer[CartaUnidadAsedio]
  private var cartasCuerpoUsuario = ListBuffer[CartaUnidadCuerpo]
  private var cartasDistanciaUsuario = ListBuffer[CartaUnidadAsedio]

  private var cartasAsedioCPU = ListBuffer[CartaUnidadAsedio]
  private var cartasCuerpoCPU = ListBuffer[CartaUnidadCuerpo]
  private var cartasDistanciaCPU = ListBuffer[CartaUnidadAsedio]

  private var cartasClima = ListBuffer[CartaClima]

}