# Ejercicio 16 | [Solución 16](SOL)
## Manejo de String
### Enunciado
Escriba una función que indique si una frase es palíndroma. Una frase es palíndroma si se lee igual de derecha a izquierda que de izquierda a derecha, pero obviando los espacios en blanco y los signos de puntuación. Por ejemplo, las cadenas: Sé verla al revés, Anita lava la tina, luz azul contienen frases palíndromas.

### Instrucciones
Para solucionar este problema, se requiere que el usuario escriba una función que reciba como parámetro un String, sin espacios ni signos de puntuación. La función debe reconocer si el String dado como parámetro es una frase palíndroma. Si la frase es palíndroma la función retorna True, si es no retorna False.
___
# Ejercicio 9 | [Solución 9](SOL)
## Manejo de Tuplas
### Enunciado
Realiza un programa que siga las siguientes instrucciones: Crea un conjunto llamado usuarios con los usuarios Marta, David, Elvira, Juan y Marcos Crea un conjunto llamado administradores con los administradores Juan y Marta. Borra al administrador Juan del conjunto de administradores. Añade a Marcos como un nuevo administrador, pero no lo borres del conjunto de usuarios. Muestra todos los usuarios por pantalla de forma dinámica, además debes indicar si cada usuario es administrador o no. Nota: Los conjuntos se pueden recorrer dinámicamente utilizando el bucle for de forma similar a una lista. También cuentan con un método llamado .discard(elemento) que sirve para borrar un elemento.

### Instrucciones
Para solucionar este problema, el usuario debe crear las siguientes estructuras: usuarios = {Marta, David, Elvira, Juan, Marcos} administradores = {Juan, Marta} Usando un ciclo debe indicar quién es el administrador y quién no es administrador. Imprima el resultado por pantalla
___
# Ejercicio 10 | [Solución 10](SOL)
## Manejo de Listas
### Enunciado
Durante la planificación de un proyecto se han acordado una lista de tareas. Para cada una de estas tareas se ha asignado un orden de prioridad (cuanto menor es el número de orden, más prioridad). Crear una estructura del tipo cola con todas las tareas ordenadas pero sin los números de orden. Las tareas son las siguientes. tareas = [ [6, Distribución], [2, Diseño], [1, Concepción], [7, Mantenimiento], [4, Producción], [3, Planificación], [5, Pruebas] ] Nota: Para ordenar automáticamente una lista es posible utilizar el método .sort(.

### Instrucciones
Para solucionar este problema, se requiere que el usuario crea la siguiente lista tareas = [ [6, Distribución], [2, Diseño], [1, Concepción], [7, Mantenimiento], [4, Producción], [3, Planificación], [5, Pruebas] ] Con la lista creada, debe imprimir los elementos de la lista. Utilice la librería deque importándola de la siguiente manera: from collections import deque. Luego ordene los elementos por prioridad y finalmente imprima la lista ordenada. 
___
# Ejercicio 11 | [Solución 11](SOL)
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

# Reto 5 | [Solución Reto 5](SOL)
## Inventario para un supermercado de víveres
### Enunciado
La tienda de Andrés vende diferentes productos, usualmente frutas, dulces y algunos tipos de carne. Con el propósito de mejorar el control sobre las ventas y el inventario de la tienda, Andrés decide construir una aplicación que le permita almacenar la información de los productos y realizar algunos cálculos sobre los datos.

En la primera parte del reto se debe construir una base de datos que almacene la información de los productos disponibles en la tienda. Debido a que Andrés no cuenta con un servidor de base de datos, solicita que temporalmente la base de datos sea representada mediante un diccionario de Python llamado productos que tendrá por llave el código del producto y por valor una lista formada por los atributos: nombre, precio e inventario. La Tabla 1 presenta los productos disponibles a la fecha. 

| código | nombre | precio | inventario |
| --- | --- | --- | --- |
| 1 | Manzanas | 6000.0 | 25 |
| 2 | Limones | 2500.0 | 15 |
| 3 | Peras | 2700.0 | 33 |
| 4 | Arandanos | 9300.0 | 34 |
| 5 | Tomates | 2100.0 | 42 |
| 6 | Fresas | 4100.0 | 10 |
| 7 | Helado | 4500.0 |	41 |
| 8 | Galletas | 500.0 | 8 |
| 9 | Chocolates | 4500.0 | 80 |
| 10 | Jamon | 15000.0 | 10 |

Tabla 1: Productos disponibles en la tienda.

Para simular de una manera más realista la base de datos, es necesario construir 3 funciones que representen las operaciones de: AGREGAR, ACTUALIZAR y BORRAR los productos disponibles. Se debe implementar una función independiente por cada una de las acciones mencionadas. En este caso, para poder realizar las operaciones de ACTUALIZAR o BORRAR es necesario especificar todos los atributos del producto.

Adicionalmente, Andrés está interesado en analizar los datos de los productos disponibles y conocer: el nombre del producto con el precio mayor; el nombre del producto con el precio menor; el promedio de precios de todos los productos y el valor total del inventario a la fecha. Este último se obtiene multiplicando el precio de cada producto por el inventario disponible y luego sumando todos los resultados. Por ejemplo, al calcular estos 4 valores para los datos disponibles en la Tabla 1 obtendríamos :
 <br> Producto precio mayor: Jamon <br> Producto precio menor: Galletas <br> Promedio de precios: 5120.0 <br> Valor del inventario: 1420500.0

| | |
| --- | --- |
| **Entrada** | Cada uno de los casos de prueba estará compuesto por dos líneas. <br> La primera línea estará formada por una cadena de texto que identifica la operación a realizar. En este caso, las operaciones validas son <br> ACTUALIZAR <br> BORRAR <br> AGREGAR <br> La segunda línea estará formada por 4 valores (código, nombre, precio, inventario) que representan el producto sobre el cual se quiere realizar la operación <br> En el caso de la operación ACTUALIZAR la segunda línea debe contener el código y los nuevos valores del producto <br> En el caso de la operación BORRAR se deben especificar todos los atributos del producto a eliminar.|
| **Salida** | La salida estará representada por una única línea formada por cuatro valores: <br> Nombre del producto con el precio mayor <br> Nombre delproducto con el precio menor <br> Promedio de precios <br> Valor del inventario. <br> Estos 4 valores deben imprimirse después de realizar las operaciones solicitadas en la entrada de datos <br> Los valores numéricos deben imprimirse con un número decimal <br> En caso de solicitar ACTUALIZAR o BORRAR un producto que no existe (es decir, que el código del producto no se encuentra en la base de datos), s <br> imprimir 'ERROR' <br> En caso de solicitar AGREGAR un producto cuyo código ya existe en la base de datos se debe imprimir 'ERROR'.|
### Instrucciones para la calificación automática

Antes de enviar la solución del reto, por favor tenga en cuenta los siguientes aspectos: <br> Cada caso de prueba se especifica con dos líneas <br> Cada línea debe contener los valores de los parámetros requeridos separados por un espacio <br> Es importante no utilizar ningún mensaje a la hora de capturar las entradas, es decir, al utilizar la función input() no agregue ningún texto para captur <br> los datos <br> Los resultados se muestran en una única línea. Los dos valores requeridos deben estar separados por un espacio.

### Casos de prueba

| | |
| --- | --- |
| **Entradas de ejemplo** | AGREGAR <br> 11 Melon 70 13 <br> BORRAR <br> 10 Jamon 15000 10 <br> ACTUALIZAR <br> 7 Helado 65000 11 <br> BORRAR <br> 14 Maiz 45000 12 <br> BORRAR 10 Jamon 15000 10	 <br> AGREGAR 11 Melon 70 13 <br> ACTUALIZAR 7 Helado 65000	 <br> BORRAR 14 Maiz 45000 12	 <br> AGREGAR 12 Maiz 70000 1 <br> ACTUALIZAR 10 Jamon 500 10	 <br> BORRAR 3 Peras 2700 33	 <br> BORRAR 15 Papa 1500 10	 <br> ACTUALIZAR 15 Papa 1500 10	 <br> AGREGAR 3 Peras 2700 33 |
| **Salida de ejemplo** | Jamon Melon 4660.9 1421410.0 <br> Arandanos Galletas 4022.2 1270500.0 <br> Helado Galletas 11170.0 1951000.0 <br> ERROR <br> Arandanos Galletas 4022.2 1270500.0 <br> Jamon Melon 4660.9 1421410.0	 <br> 11 Helado Galletas 11170.0 1951000.0 <br> ERROR <br> Maiz Galletas 11018.2 1490500.0	 <br> Arandanos Galletas 3670.0 1275500.0 <br> Jamon Galletas 5388.9 1331400.0 <br> ERROR <br> ERROR <br> ERROR |







