# Programacion Multihilo

## Actividades

### ACTIVIDAD 1x01

Escribe una clase *Fibonacci* que se ejecute como en un hilo y que realice el cálculo de los N primeros
números de la sucesión de Fibonacci. Esta sucesión comienza con los números 1 y 1; el siguiente elemento
es la suma de los dos elementos anteriores (1, 1, 2, 3, 5, 8, 13, 21,...).  

El parámetro N será indicado cuando se instancie un objeto de esta clase.
Codifica una clase *Actividad1x01* que pida al usuario un valor para N e instancie dos objetos de la clase
anterior. Haz que se ejecuten en orden. Prueba con valores altos para la N.

### ACTIVIDAD 1x02

Escribe una clase *Tic* y otra clase *Tac* que sean derivadas de Thread. La primera clase mostrará en
pantalla 100 veces la palabra TIC, y la segunda clase hará lo mismo con la palabra TAC. Dentro del bucle,
utiliza el método sleep para que dé tiempo a ver las palabras que se van mostrando y captura la excepción
InterrupterException.
Codifica una clase *Actividad1x02* que cree dos objetos de las clases anteriores e intenta que se
ejecuten de forma simultánea. Observa el resultado de la ejecución.
