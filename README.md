# Gwen't

![http://creativecommons.org/licenses/by/4.0/](https://i.creativecommons.org/l/by/4.0/88x31.png)

This work is licensed under a
[Creative Commons Attribution 4.0 International License](http://creativecommons.org/licenses/by/4.0/)


**Contexto:**

Este repositorio corresponde al proyecto consistente en un clon (simplificado)
del juego de cartas [_Gwent_](https://www.playgwent.com/en) desarrollado por [_CD PROJEKT RED_](https://cdprojektred.com/en/) para su franquicia de videojuegos The Witcher.
A grandes rasgos el juego tendrá dos jugadores, uno controlado por el usuario y otro controlado por la computadora.
Cada jugador tendrá un mazo y una mano de cartas que puede jugar en un tablero en una partida al mejor de tres
rondas.

Se continua el trabajo realizado para la Entrega Parcial 1 y Tarea 1.

En específico, para la Entrega Parcial 3 de la Tarea 2, se aplicó la
estrategia de *double dispatch* para implementar la acción de jugar 
una carta específica en secciones específicas del tablero, por medio 
de clases y métodos adecuados según las restricciones que tiene cada 
tipo de carta y tablero del juego, señaladas en las secciones 1.2 Tablero y 1.3 Cartas del
documento [Enunciado Proyecto V1.0.2.pdf](https://www.u-cursos.cl/ingenieria/2023/1/CC3002/2/material_docente/detalle?id=6465061) 
en material docente del curso, así evitando usar pattern matching.

**Descripción**

En relación a la sección 1.2 Tablero, dado que en el juego hay 
3 zonas de combate para cada jugador, sumado a una zona de clima
que comparten ambos, se decidió crear una clase abstracta para el
tablero, en el que se heredarán 4 clases para los 4 tableros. Además, 
se instancian los 4 tableros como valores dentro de la clase abstracta AbstractTablero,
y así un Jugador puede acceder a los 4 tableros.

En relación a los métodos, primero se define el método
jugarCartaMano(carta: Carta), el que utiliza la seccion del tablero
en el que el Jugador jugará la carta, en el método
_seccionTablero.anadirCarta(carta). Este método se declara en la clase abstracta
AbstractTablero, y se implementa en las 4 clases hijas de esta clase abstracta,
las cuales corresponden a los 4 tableros. Se overridea el método anadirCarta en cada subclase
y se llama a un método anadirCarta específico para cada tablero, el que se define
en cada subclase. Estos métodos se declaran en el trait/interfaz Carta, y se overridean en 
y se definen en cada subclase de Carta (3 clases de carta de tipo unidad y 1 clase para cartas de tipo clima).

Posteriormente, se crearon los correspondientes tests para las clases Jugador,
CartaClima, CartaUnidadAsedio, CartaUnidadCuerpo, CartaUnidadDistancia, TableroAsedio,
TableroCuerpo, TableroDistancia y TableroClima. 


