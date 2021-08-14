# Ejercicio 8 | [Solución 8](https://github.com/dsernag/MisionTICUSA2022/blob/main/Ciclo1Python/Semana4/Ejercicio8.py)
## Manejo de String
### Enunciado
Escriba una función que indique si una frase es palíndroma. Una frase es palíndroma si se lee igual de derecha a izquierda que de izquierda a derecha, pero obviando los espacios en blanco y los signos de puntuación. Por ejemplo, las cadenas: Sé verla al revés, Anita lava la tina, luz azul contienen frases palíndromas.

### Instrucciones
Para solucionar este problema, se requiere que el usuario escriba una función que reciba como parámetro un String, sin espacios ni signos de puntuación. La función debe reconocer si el String dado como parámetro es una frase palíndroma. Si la frase es palíndroma la función retorna True, si es no retorna False.
___
# Ejercicio 9 | [Solución 9](https://github.com/dsernag/MisionTICUSA2022/blob/main/Ciclo1Python/Semana4/Ejercicio9.py)
## Manejo de Tuplas
### Enunciado
Realiza un programa que siga las siguientes instrucciones: Crea un conjunto llamado usuarios con los usuarios Marta, David, Elvira, Juan y Marcos Crea un conjunto llamado administradores con los administradores Juan y Marta. Borra al administrador Juan del conjunto de administradores. Añade a Marcos como un nuevo administrador, pero no lo borres del conjunto de usuarios. Muestra todos los usuarios por pantalla de forma dinámica, además debes indicar si cada usuario es administrador o no. Nota: Los conjuntos se pueden recorrer dinámicamente utilizando el bucle for de forma similar a una lista. También cuentan con un método llamado .discard(elemento) que sirve para borrar un elemento.

### Instrucciones
Para solucionar este problema, el usuario debe crear las siguientes estructuras: usuarios = {Marta, David, Elvira, Juan, Marcos} administradores = {Juan, Marta} Usando un ciclo debe indicar quién es el administrador y quién no es administrador. Imprima el resultado por pantalla
___
# Ejercicio 10 | [Solución 10](https://github.com/dsernag/MisionTICUSA2022/blob/main/Ciclo1Python/Semana4/Ejercicio10.py)
## Manejo de Listas
### Enunciado
Durante la planificación de un proyecto se han acordado una lista de tareas. Para cada una de estas tareas se ha asignado un orden de prioridad (cuanto menor es el número de orden, más prioridad). Crear una estructura del tipo cola con todas las tareas ordenadas pero sin los números de orden. Las tareas son las siguientes. tareas = [ [6, Distribución], [2, Diseño], [1, Concepción], [7, Mantenimiento], [4, Producción], [3, Planificación], [5, Pruebas] ] Nota: Para ordenar automáticamente una lista es posible utilizar el método .sort(.

### Instrucciones
Para solucionar este problema, se requiere que el usuario crea la siguiente lista tareas = [ [6, Distribución], [2, Diseño], [1, Concepción], [7, Mantenimiento], [4, Producción], [3, Planificación], [5, Pruebas] ] Con la lista creada, debe imprimir los elementos de la lista. Utilice la librería deque importándola de la siguiente manera: from collections import deque. Luego ordene los elementos por prioridad y finalmente imprima la lista ordenada. 
___
# Ejercicio 11 | [Solución 11](https://github.com/dsernag/MisionTICUSA2022/blob/main/Ciclo1Python/Semana4/Ejercicio11.py)
## Manejo de Diccionarios
### Enunciado
Durante el desarrollo de un pequeño videojuego hay que configurar y balancear cada clase de personaje jugable. Partiendo que la estadística base es 2, debe cumplir las siguientes condiciones: El caballero tiene el doble de vida y defensa que un guerrero. El guerrero tiene el doble de ataque y alcance que un caballero. El arquero tiene la misma vida y ataque que un guerrero, pero la mitad de su defensa y el doble de su alcance. Escribir un programa que muestre como quedan las propiedades de los tres personajes. Utilice los siguientes diccionarios: caballero = { vida:2, ataque:2, defensa: 2, alcance:2 } guerrero = { vida:2, ataque:2, defensa: 2, alcance:2 } arquero = { vida:2, ataque:2, defensa: 2, alcance:2 }

### Instrucciones
Para solucionar este problema, se requiere que el usuario escriba los siguientes diccionarios caballero = { vida:2, ataque:2, defensa: 2, alcance:2 } guerrero = { vida:2, ataque:2, defensa: 2, alcance:2 } arquero = { vida:2, ataque:2, defensa: 2, alcance:2 } Para hacer el balanceo, se debe asignar los valores según la descripción el personaje. Ejemplo: caballero[vida] = guerrero[vida] * 2 Al final imprima el resultado después de operar los personajes.
___
# Ejercicio 12 | [Solución 12](SOL)
## Manejo Excepciones python
### Enunciado
Realizar una función llamada agregar_una_vez() que reciba una lista y un elemento. La función debe añadir el elemento al final de la lista con la condición de no repetir ningún elemento. Además, si este elemento ya se encuentra en la lista se debe invocar un error de tipo ValueError que debe capturar y mostrar este mensaje en su lugar: Error: Imposible añadir elementos duplicados => [elemento]. Utilice la lista de elemento elementos = [1, 5, -2]

### Instrucciones
Para solucionar este problema, el usuario debe crear una funciona llamada agregar_una_vez() que reciba como parámetros una lista. Se puede definir como: elementos = [1, 5, -2] y un numero llamado (el). Capturar el error usando ValueError y mostrar el mensaje Error: Imposible añadir elementos duplicados” Como ejemplo utilice los siguiente llamados a la función: agregar_una_vez(elementos, 10) agregar_una_vez(elementos, -2) agregar_una_vez(elementos, Hola) print(elementos)
___
# Ejercicio 13 | [Solución 13](SOL)
## Ejercicios de refuerzo
### Enunciado
Escriba una función que dado un numero diga si el numero es primo o no es primo. Un numero primo es un numero que solo es divisible por 1 y por si mismo. Ejemplo, 11 es primo por que al dividirlo por 1 y por 11 su residuo es 0. En caso contrario su residuo es diferente de 0. Si el numero es primo, la función debe retorna un mensaje que diga “Es primo”. Si el numero no es primo, la función debe retornan un mensaje que diga “No es primo”.

### Instrucciones
Para solucionar este problema, el usuario debe crear una funciona llamada num_primo(n) que reciba como parámetro un numero n. El número debe ser un numero natural mayor que 2. La función debe retornar mensajes por pantalla que diga si el numero es primo o no es primo. Ejemplo; nun_primo(11) Es primo nun_primo(12) No es primo
___
# Ejercicio 14 | [Solución 14](SOL)
# Ejercicios de refuerzo
## Enunciado
Escriba una función que dado un numero n calcule sus factores primos. La función debe retornar una lista con los números primos que descomponen el numero n. Ejemplo si n= 100, la descomposición en factores primos es [2,2,5,5]

### Instrucciones
Para solucionar este problema, el usuario debe crear una función llamada factores(n). Debe retorna una lista con los factores primos del numero dado. El número debe ser un numero natural mayor que 2. Por ejemplo, si n=100, la operación de descomposición es: 100/2 = 50 50/2= 25 25/5= 5 5/5 = 1 La lista que retorna la función factores(n) es [2,2,5,5] Por ejemplo, si el numero es primo entonces la función factores(n) devuelve una lista con un solo elemento 11/11=1 La lista retorna [11]
___
# Ejercicio 15 | [Solución 15](SOL)
## Ejercicios de refuerzo
### Enunciado
Escriba una función que encuentre el máximo común divisor de dos numero naturales dados. En matemáticas, se define el máximo común divisor (abreviado gdc) de dos números naturales al mayor número entero que los divide sin dejar residuo alguno (sin que sobre algún número). Por ejemplo, el máximo común divisor de 48 y 60 es 12

### Instrucciones
Para Solucionar este problema el usuario de escribir una función que se llame gdc(m,n), que retorne el máximo común divisor de los números m,n. Los números m y n deben ser numeros naturales mayores a 1. Por ejemplo, el máximo común divisor de 48 y 60 se calcula a continuación: 48/2=24 24/2=12 12/2=6 6/2= 3 3/3=1 48=2*2*2*2*3 60/2= 30 30/2=15 15/3=5 5/5=1 60=2*2*3*5 El máximo común divisor son los factores comunes con su menor exponente: gdc(48,60)=2*2*3=12
___

# Reto 4 | [Solución Reto 4](SOL)
## Detectando fraude en los talleres de matemáticas
### Enunciado
Uno de los profesores de matemáticas de la Universidad Sergio Arboleda está comenzando a tener problemas con su memoria. Hace algún tiempo, cuando comenzó a trabajar como profesor, no únicamente recordaba los nombres y apellidos de todos sus estudiantes, sino que además contaba con una habilidad increíble para detectar fraude en los talleres de matemáticas. Estaba tan seguro de sus capacidades que mientras los estudiantes se concentraban en analizar y resolver problemas, él se sentaba en la última fila del salón a preparar futuras clases sin preocuparse por los intentos de algunos estudiantes por hacer trampa.

La habilidad del profesor se basa en su memoria fotográfica. Cuando el profesor calificaba era capaz de recordar a la perfección si había visto un taller con las mismas respuestas o no, y si las encontraba acusaba siempre al segundo estudiante de fraude. Lamentablemente, durante los últimos meses su memoria fotográfica ya no funciona como antes y ahora solo recuerda algunos de los últimos talleres que ha calificado.

Debido a estas circunstancias, el profesor ha decidido solicitar su ayuda para construir un programa en Python que le permita comprobar si la pérdida de su memoria fotográfica podría tener como consecuencia una disminución en la cantidad de copias que se detectan durante los talleres.

| | |
| --- | --- |
| **Entrada** | La entrada estará formada por dos líneas: <br> La primera línea aparecerá dos números N y K que indican el número de talleres a calificar y el número de talleres que el profesor es capaz de recordar (1≤N≤10000,1≤K≤1000) <br> La segunda línea contiene N números (entre 1 y 100) separados por espacios que representan las respuestas de cada uno de los talleres <br> Dos talleres se consideran copiados si están representados por el mismo número.|
| **Salida** |  	El programa imprimirá dos números separados por un espacio. <br><br> El primero representará el número total de talleres copiados <br> El segundo representará la cantidad de copias detectadas por el profesor considerando que al calificar un taller solo es capaz de recordar los K talleres anteriores.|

### Instrucciones para la calificación automática

Antes de enviar la solución del reto, por favor tenga en cuenta los siguientes aspectos: <br> Cada caso de prueba se especifica con dos líneas <br> Cada línea debe contener los valores de los parámetros requeridos separados por un espacio <br> Es importante no utilizar ningún mensaje a la hora de capturar las entradas, es decir, al utilizar la función input()no agregue ningún texto para capturar los datos <br> Los resultados se muestran en una única línea. Los dos valores requeridos deben estar separados por un espacio.

### Casos de prueba

| | |
| --- | --- |
| **Entradas de ejemplo** | 5 1 <br> 1 2 3 1 2 <br> 5 2 <br> 1 2 3 1 2 <br> 5 3 <br> 1 2 3 1 2 <br> 5 1 <br> 1 1 1 1 1 <br> 5 1 <br> 1 2 3 1 2 <br> 5 2 <br> 1 2 3 1 2 <br> 5 3 <br> 1 2 3 1 2  <br> 5 1 <br> 1 1 1 1 1 <br> 5 1 <br> 1 2 1 2 1 <br> 5 2 <br> 1 2 1 2 1 <br> 6 2 <br> 1 2 3 1 2 1 3 1	 <br> 7 1 <br> 1 2 3 4 5 6 7	 <br> 7 2 <br> 1 1 1 1 1 1 1|
| **Salida de ejemplo** |2 0 <br> 2 0 <br> 2 2 <br> 4 4 <br> 2 0 <br> 2 0 <br> 2 2 <br> 4 4 <br> 3 0 <br> 3 3 <br> 2 0 <br> 2 2 <br> 4 4 <br> 3 0 <br> 3 3 <br> 3 1 <br> 0 0 <br> 6 6 |
