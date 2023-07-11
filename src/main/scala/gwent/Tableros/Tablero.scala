package cl.uchile.dcc
package gwent.Tableros

import gwent.Cartas.{Carta, CartaClima, CartaUnidadAsedio, CartaUnidadCuerpo, CartaUnidadDistancia}

import cl.uchile.dcc.gwent.Jugadores.{CPU, Usuario}
import gwent.Efectos.{ClimaDespejado, EscarchaMordiente, Habilidad, LluviaTorrencial, NieblaImpenetrable, RefuerzoMoral, VinculoEstrecho}

import scala.collection.mutable.ListBuffer

/**
 * Interfaz que representa un tablero.
 *
 * @author Antonio Vitalic
 */


class Tablero {

  private var usuario = new Usuario("Usuario", this,_mazoCartas = ???, _manoCartas = ???)
  private var cpu = new CPU("CPU", this, _mazoCartas = ???, _manoCartas = ???)

  private var cartasAsedioUsuario : ListBuffer[CartaUnidadAsedio] = ListBuffer[CartaUnidadAsedio]
  private var cartasCuerpoUsuario = ListBuffer[CartaUnidadCuerpo]
  private var cartasDistanciaUsuario = ListBuffer[CartaUnidadAsedio]

  private var cartasAsedioCPU = ListBuffer[CartaUnidadAsedio]
  private var cartasCuerpoCPU = ListBuffer[CartaUnidadCuerpo]
  private var cartasDistanciaCPU = ListBuffer[CartaUnidadAsedio]

  private var cartasClima = ListBuffer[CartaClima]

  val refuerzoMoral = new RefuerzoMoral()
  val vinculoEstrecho = new VinculoEstrecho()

  val escarchaMordiente = new EscarchaMordiente()
  val nieblaImpenetrable = new NieblaImpenetrable()
  val lluviaTorrencial = new LluviaTorrencial()
  val climaDespejado = new ClimaDespejado()

  def applyHabilidad(efecto: Habilidad, carta: Carta): Unit = {
    efecto.apply(carta, this)
  }

  def agregarEnAsedioUsuario(carta: CartaUnidadAsedio): Unit = {
    case refuerzoMoral: RefuerzoMoral => refuerzoMoral.apply(carta, cartasAsedioUsuario)
    case vinculoEstrecho: VinculoEstrecho => vinculoEstrecho.apply(carta, cartasAsedioUsuario)
    case _ => apply(carta, cartasAsedioUsuario)
  }

  def agregarEnCuerpoUsuario(carta: CartaUnidadCuerpo): Unit = {
    apply(carta, cartasCuerpoUsuario)
  }

  def agregarEnDistanciaUsuario(carta: CartaUnidadAsedio): Unit = {
    apply(carta, cartasDistanciaUsuario)
  }

  def agregarEnDistanciaCPU(carta: CartaUnidadDistancia): Unit = {
    apply(carta, cartasDistanciaCPU)
  }

  def agregarEnCuerpoCPU(carta: CartaUnidadCuerpo): Unit = {
    apply(carta, cartasCuerpoCPU)
  }

  def agregarEnAsedioCPU(carta: CartaUnidadAsedio): Unit = {
    apply(carta, cartasAsedioCPU)
  }

  def agregarEnClima(): Unit = {
    cartasClima.apply()
  }

}