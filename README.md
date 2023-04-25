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

En específico, para la Entrega Parcial 1 de la Tarea 1, se aplicó la
estrategia de test-driven development para implementar los elementos básicos
del juego: Jugador y Carta, señaladas en las secciones 1.1 Jugador y 1.3 Carta del
documento [Enunciado Proyecto V1.0.1.pdf](https://www.u-cursos.cl/ingenieria/2023/1/CC3002/2/material_docente/detalle?id=6440453) en material docente del curso, a excepción de las funcionalidades
que involucren al Tablero y/o las Clasificaciones de las cartas.

A su vez, para la Tarea 1, se aplicó el concepto de herencia para las implementaciones
de las clases y métodos, además de la sobre-escritura de parámetros y métodos, y finalmente
el testeo con el método Equals.

**Descripción**

En relación a la sección 1.1 Jugador, dado que en el juego hay dos jugadores; un usuario humano
y una computadora, sumado a que éstos comparten los atributos Nombre, SeccionTablero,
ContadorGemas, MazoCartas, ManoCartas, se decidió crear un trait (interfaz) Jugador, la cual
se "extendió" o heredó en las clases Usuario y Computadora. Por otro lado, los jugadores Usuario y Computadora
tienen acciones en común, como jugar una carta de la mano, y robar carta del mazo, por lo cual
se creó el train AccionesJugador con los métodos JugarCartaMano() y RobarCartaMazo().
Dado que se debe usar Scala 2, los trait's Jugador y AccionesJugador no llevan parámetros.

En relación a la sección 1.3 Carta, dado que hay dos tipos de carta: CartaUnidad y CartaClima,
se decidió crear una trait (interfaz) Carta.

Posteriormente, se crearon los correspondientes tests para las clases Usuario, Computadora, CartaUnidad y CartaClima. 


