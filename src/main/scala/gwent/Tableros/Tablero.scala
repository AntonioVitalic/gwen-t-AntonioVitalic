package cl.uchile.dcc
package gwent.Tableros

import gwent.Cartas.{Carta, CartaClima, CartaUnidadAsedio, CartaUnidadCuerpo, CartaUnidadDistancia}

import cl.uchile.dcc.gwent.Jugadores.{CPU, Usuario}
import gwent.Efectos.{ClimaDespejado, EscarchaMordiente, Habilidad,
  LluviaTorrencial, NieblaImpenetrable, RefuerzoMoral, VinculoEstrecho, EfectoNulo}

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

  val refuerzoMoral = RefuerzoMoral
  val vinculoEstrecho = VinculoEstrecho

  val escarchaMordiente = EscarchaMordiente
  val nieblaImpenetrable = NieblaImpenetrable
  val lluviaTorrencial = LluviaTorrencial
  val climaDespejado = ClimaDespejado

  val efectoNulo = EfectoNulo

  /**
   * Método que permite agregar una carta a una zona del tablero, en la sección
   * de Asedio de Usuario.
   * @param carta
   */
  def agregarEnAsedioUsuario(carta: CartaUnidadAsedio): Unit = {
    case refuerzoMoral: RefuerzoMoral => refuerzoMoral.apply(carta, cartasAsedioUsuario)
    case vinculoEstrecho: VinculoEstrecho => vinculoEstrecho.apply(carta, cartasAsedioUsuario)
    case _ => efectoNulo.apply()
  }

  /**
   * Método que permite agregar una carta a una zona del tablero, en la sección
   * de Cuerpo a Cuerpo de Usuario.
   * @param carta
   */
  def agregarEnCuerpoUsuario(carta: CartaUnidadCuerpo): Unit = {
    case refuerzoMoral: RefuerzoMoral => refuerzoMoral.apply(carta, cartasCuerpoUsuario)
    case vinculoEstrecho: VinculoEstrecho => vinculoEstrecho.apply(carta, cartasCuerpoUsuario)
    case _ => efectoNulo.apply()
  }

  /**
   * Método que permite agregar una carta a una zona del tablero, en la sección
   * de Distancia de Usuario.
   * @param carta
   */
  def agregarEnDistanciaUsuario(carta: CartaUnidadAsedio): Unit = {
    case refuerzoMoral: RefuerzoMoral => refuerzoMoral.apply(carta, cartasDistanciaUsuario)
    case vinculoEstrecho: VinculoEstrecho => vinculoEstrecho.apply(carta, cartasDistanciaUsuario)
    case _ => efectoNulo.apply()
  }

  /**
   * Método que permite agregar una carta a una zona del tablero, en la sección
   * de Asedio de CPU.
   * @param carta
   */
  def agregarEnAsedioCPU(carta: CartaUnidadAsedio): Unit = {
    case refuerzoMoral: RefuerzoMoral => refuerzoMoral.apply(carta, cartasAsedioCPU)
    case vinculoEstrecho: VinculoEstrecho => vinculoEstrecho.apply(carta, cartasAsedioCPU)
    case _ => efectoNulo.apply()
  }

  /**
   * Método que permite agregar una carta a una zona del tablero, en la sección
   * de Cuerpo a Cuerpo de CPU.
   * @param carta
   */
  def agregarEnCuerpoCPU(carta: CartaUnidadCuerpo): Unit = {
    case refuerzoMoral: RefuerzoMoral => refuerzoMoral.apply(carta, cartasCuerpoCPU)
    case vinculoEstrecho: VinculoEstrecho => vinculoEstrecho.apply(carta, cartasCuerpoCPU)
    case _ => efectoNulo.apply()
  }

  /**
   * Método que permite agregar una carta a una zona del tablero, en la sección
   * de Distancia de CPU.
   * @param carta
   */
  def agregarEnDistanciaCPU(carta: CartaUnidadDistancia): Unit = {
    case refuerzoMoral: RefuerzoMoral => refuerzoMoral.apply(carta, cartasDistanciaCPU)
    case vinculoEstrecho: VinculoEstrecho => vinculoEstrecho.apply(carta, cartasDistanciaCPU)
    case _ => efectoNulo.apply()
  }

  /**
   * Método que permite agregar una carta a una zona del tablero, en la sección
   * de Clima (común para ambos, Usuario y CPU).
   * @param carta
   */
  def agregarEnClima(carta: CartaClima): Unit = {
    case escarchaMordiente: EscarchaMordiente => escarchaMordiente.apply(carta, cartasClima)
    case nieblaImpenetrable: NieblaImpenetrable => nieblaImpenetrable.apply(carta, cartasClima)
    case lluviaTorrencial: LluviaTorrencial => lluviaTorrencial.apply(carta, cartasClima)
    case climaDespejado: ClimaDespejado => climaDespejado.apply(carta, cartasClima)
    case _ => efectoNulo.apply()
  }

}