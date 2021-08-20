# Ejercicio 2 | Manejo de tipos de datos en Python | [Solución 2](https://github.com/dsernag/MisionTICUSA2022/blob/main/Ciclo1Python/Semana2/Ejercicio2.py)
### Enunciado
Identifica el tipo de dato (int, float, string o list) de los siguientes valores literales:,Para la solución de este problema, se requiere que el usuario ingrese los datos y realice la validación del tipo de dato. Se requiere que se escriba el dato ingresado, se imprima por consola y luego se imprima qué tipo de dato es.

### Instrucciones
Para la solución de este problema, se requiere que el usuario ingrese los datos y realice la validación del tipo de dato. Se requiere que se escriba el dato ingresado, se imprima por consola y luego se imprima qué tipo de dato es.
___
# Ejercicio 3 | Ejercicio PEP 8 | [Solución 3](https://github.com/dsernag/MisionTICUSA2022/blob/main/Ciclo1Python/Semana2/Ejercicio3.py)
### Enunciado
Siguiendo la recomendaciones de PEP 8, describir y solucionar el error del siguiente bloque de instrucciones n = 10 if n> 5: print “n es grande”

### Instrucciones
Para solucionar este problema, el usuario deberá asegurarse que el bloque de instrucciones tenga en cuenta las sugerencias de PEP8, identifique si el problema es de indentación, máxima longitud de línea, líneas en blanco, espacios en blanco, codificación de archivo fuente. Escriba correctamente el código para obtener un resultado que cumpla con la condición.
___
# Reto 2 | Récords de la Fórmula 1 | [Solución Reto 2](https://github.com/dsernag/MisionTICUSA2022/blob/main/Ciclo1Python/Semana2/Reto2.py)
### Enunciado

Con el propósito de mejorar la medición de los récords relacionados con la máxima velocidad alcanzada por un vehículo en un tramo de la pista, los directivos de la Fórmula 1 han decidido implementar radares de tramo para mantener la lista de récords actualizados.

Los radares de tramo funcionan colocando dos cámaras en dos puntos alejados de una pista con el fin de comprobar cuánto tiempo tarda un piloto recorrer dicho tramo. Estos radares no mide la velocidad de paso, sino el tiempo de paso representado como la velocidad media de un piloto en un trayecto con una longitud determinada.

Formalmente, los radares de tramo se basan en el teorema de Lagrange (también conocido como el teorema de valor medio o de Bonnet-Lagrange), el cual nos dice que dice tenemos una función continua en un intervalo cerrado, y derivable en un intervalo abierto, entonces algún punto de ese intervalo abierto la función tendrá una derivada instantánea igual a la pendiente media de la curva en el intervalo cerrado.

Aunque estos conceptos pueden asustar en un principio, su interpretación es muy simple: si un piloto recorre un trayecto de la pista con una velocidad media es de 100 Km/h, necesariamente en algún punto del trayecto su velocidad habrá sido de 100 Km/h. Esto quiere decir que si la velocidad media de un piloto supera la velocidad registrada en el récord actual, gracias al teorema anterior, sabremos que en algún punto del trayecto el piloto superó la velocidad de dicho récord. Por ejemplo, si colocamos las cámaras separadas 10 Km en un tramo cuyo récord de velocidad es de 110 Km/h, y un piloto tarda 5 minutos en ser visto por la segunda cámara, sabremos que su velocidad media ha sido de 120 Km/h, y por lo tanto, el piloto superó el récord actual.

Usted hace parte del equipo de desarrollo encargado de construir el software que procesará los datos registrados por las cámaras. Su misión es crear un programa en Python que permita saber si un piloto supero un récord o no.

| | |
| --- | --- |
| **Entrada** | El programa recibirá 3 parámetros: </br>La distancia en metros que separa dos cámaras.</br>El actual récord de velocidad para ese trayecto en (Km/h).</br>El tiempo en segundos que tarda el piloto en recorrer el trayecto.|
| **Salida** | El programa imprimirá una línea indicando si el piloto superó el récord o no. Se debe considerar lo siguiente: <br> Imprimirá VELOCIDAD NORMAL si el piloto no superó el récord <br> Imprimirá NUEVO RECORD si se superó la velocidad registrada en el récord actual en menos de un 20% <br> Imprimirá ENTREVISTA si el récord fue superado en un 20% o más de la velocidad registrada en el récord actual. En este caso se realizará una entrevista en medios deportivos <br> Debido a que los sistemas pueden fallar y registrar valores errados (por ejemplo, indicando que el tiempo que ha tardado el piloto es negativo). En esos casos, se deberá imprimir ERROR|

### Instrucciones para la calificación automática

Antes de enviar la solución del reto, por favor tenga en cuenta los siguientes aspectos: <br> Cada caso de prueba se especifica en una única línea <br> Cada línea debe contener los valores de los parámetros separados por un espacio <br> Es importante no utilizar ningún mensaje a la hora de capturar las entradas, es decir, al utilizar la función input() no agregue ningún texto para capturar los datos <br> Como ejemplo considere el caso de prueba 9165 110 300, el cual corresponde a la medición entre dos cámaras separadas por 9165 metros; una récord de velocidad de 110 (Km/h) y un piloto que tard <br> segundos en recorrer el trayecto <br> Los resultados deben imprimirse siempre en mayúscula sostenida.

### Casos de prueba

| | |
| --- | --- |
| **Entradas de ejemplo** | 9165 110 300 </br> 9165 110 299 </br> 1000 -50 -100 </br> 12000 100 359 <br> 9165 110 300 <br> 9165 110 299 <br> -1000 -50 -100 <br> 12000 100 359 <br> 12000 -100 359 <br> 12000 100 433 <br> 12000 100 431 <br> 12000 100 360 <br> 12000 100 361 |
| **Salida de ejemplo** | VELOCIDAD NORMAL </br> NUEVO RECORD </br> ERROR </br> ENTREVISTA <br> VELOCIDAD NORMA <br> NUEVO RECOR <br> ERRO <br> ENTREVIST <br> ERRO <br> VELOCIDAD NORM <br> NUEVO RECOR <br> ENTREVIST <br> NUEVO RECORD |
