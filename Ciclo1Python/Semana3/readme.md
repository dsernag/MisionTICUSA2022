# Ejercicio 4 | [Solución 4](SOL)
## Manejo de Funciones Python
### Enunciado
Realizar una función separar() que tome una lista de números enteros y devuelva dos listas ordenadas. La primera con los números pares, y la segunda con los números impares

### Instrucciones
Para la solución de este problema, se requiere que el usuario escriba un script y defina una función llamada separar(). Como parámetro de entrada recibe una lista de numero de enteros. La lista debe crearla como lista=[1,2,3,4]. La función devuelve dos listas de la forma: lista1=[Numeros pares], lista2=[numeros impares]
___
# Ejercicio 5 | [Solución 5](SOL)
## Manejo de IF
### Enunciado
Realizar un programa que lea dos números por teclado y permita elegir entre 3 opciones en un menú: Mostrar una suma de los dos números Mostrar una resta de los dos números (el primero menos el segundo) Mostrar una multiplicación de los dos números En caso de no introducir una opción válida, el programa informará que la opción no es correcta.
Dificultad

### Instrucciones
Para la solución de este problema, se requiere que el usuario escriba un script en donde se enumeren tres posibilidades. En cada posibilidad, el usuario deberá ingresar dos números, los cuales tendrá que operar según la opción escogida. La primera opción será la suma (numero1+numero2) La segunda será la resta (numero1 - numero 2) La tercera opción es la multiplicación de los números (numero1 * numero2). Si hay un error al ingresar los números, se debe colocar un mensaje que indique: información incorrecta
___
# Ejercicio 6 | [Solución 6](SOL)
## Manejo de While
### Enunciado
Realiza un programa que pida al usuario un número entero del 0 al 9, y que mientras el número no sea correcto se repita el proceso. Luego debe comprobar si el número se encuentra en la lista de números y notificarlo. Sugerencia: La sintaxis valor in lista permite comprobar fácilmente si un valor se encuentra en una lista (devuelve True o False)

### Instrucciones
Para la solución de este problema, se requiere que el usuario escriba un script y utilice la estructura While. Se debe tener como prueba una lista llamada numero=[1,2,3] Con números enteros del 0 al 9. Se debe solicitar al usuario ingresar el número que quiera comprobar. Ejemplo, si la lista de números tiene la siguiente estructura: numero=[1,3,5,9] y se ingresa por consola el numero 8, debe salir un mensaje que diga que él numero 8 no se encuentra en la lista. Si el número que se coloca está en la lista, sale un mensaje que indique, el numero x esta en la lista
___
# Ejercicio 7 | [Solución 7](SOL)
## Manejo de For
### Enunciado
Realiza un programa que pida al usuario cuantos números quiere introducir. Luego lee todos los números que se han introducido y se realiza una operación de media aritmética

### Instrucciones
Para solucionar este problema, se requiere que el usuario ingrese una cantidad limitada de números por consola. El programa debe solicitar la cantidad de números a ingresar. Con los números ingresados debe realizar el calculo de la media. Este calculo es la suma de todos los números dividido por el total de números sumados. Ejemplo, se ingresan los números 1,2,4,5, el calculo es 1+2+4+5/4.
___
# Reto 3 | [Solución Reto 3](SOL)
## Elección Sede Mundial 
### Enunciado
La FIFA se encuentra preparando con casi 10 años de anticipación, la realización de la Copa Mundial de Fútbol 2030, la cual será especial debido a que este año se cumplen 100 años del primer mundial de fútbol realizado en Uruguay. El primer reto para realizar esta cita mundialista consiste en seleccionar la sede. Al ser una fiesta tan importante, nadie quiere estar fuera y muchos son los países que se postulan, pero solo unos pocos pueden realmente aplicar ya que los requerimientos son realmente difíciles de cumplir. Dentro de los principales criterios de selección de candidatos se encuentran los países que puedan garantizar:

Tener 12 o más estadios aprobados por la FIFA.

Que el estadio que menor capacidad tenga, sea de por lo menos 35000 espectadores.

Que el estadio que se ubique a mayor altura sobre el nivel del mar no se encuentre a más de 1500 msnm.

Que al menos 3 equipos de su liga local hayan ganado un título internacional de clubes.

La FIFA también quiere conocer la cantidad total del dinero que las empresas locales y el gobierno están dispuestos a asignar al proyecto de realización de la Copa Mundial de la FIFA, así que la postulación también incluye este valor. La cifra será dada en Millones de dólares, así cuando la propuesta diga 100, el comité evaluador entenderá que son cien millones de dólares.

Usted ha sido seleccionado para liderar el equipo de desarrollo encargado en la selección de los países que se pueden postular y así establecer el primer filtro para la FIFA, así que debe construir el software que procesará los datos de las bases de datos registradas en el sistema de postulaciones.Su misión es crear un programa en Python que permita mostrarle al comité de selección de sede la lista de los países que cumplen con los requerimientos y por supuesto el valor que estas posibles sedes están en condición de aportar.

| | |
| --- | --- |
| **Entrada** | La entrada estará conformada por N + 1 líneas: <br> La primera línea recibirá un número N que equivale a la cantidad de registros en la base de datos de postulantes. Cada registro representa un país que se quiere postular para ser sede del mundial <br> Cada una de las siguientes N líneas estará formada por 5 números separados por espacios que representan las diferentes características de una sede. Por ejemplo,la fila 15 45000 500 4 800 represen <br> una sede con 15 estadios aprobados por la FIFA, el estadio más pequeño tiene una capacidad de 45000 aficionados, el estadio con mayor altura se encuentra a 500 metros sobre el nivel del mar y  <br> liga local tiene 4 equipos que han ganado títulos internacionales. El capital que está dispuesto a invertir es de800 millones de dólares. |
| **Salida** | El programa imprimirá el valor que está dispuesto a invertir cada una de las sedes de la base de datos que cumplen con todos los criterios de la FIFA. <br> Si no existe ningún registro en la base de datos que cumpla los criterios de la FIFA, el programa imprimirá 'NO DISPONIBLE'.|
### Instrucciones para la calificación automática

Antes de enviar la solución del reto, por favor tenga en cuenta los siguientes aspectos: <br> Cada línea debe contener los valores de los parámetros separados por un espacio <br> Es importante no utilizar ningún mensaje a la hora de capturar las entradas, es decir, al utilizar la función input()no agregue ningún texto para capturar los datos <br> El resultado ´NO DISPONIBLE´ siempre debe imprimirse en mayúscula <br> Los números no deben llevar separador de miles ni decimales.

### Casos de prueba

| | |
| --- | --- |
| **Entradas de ejemplo** | 6 </br> 12 35000 700 3 110 </br> 12 25000 1900 1 110 </br>12 30000 1700 3 80 </br>10 30000 1500 1 100 </br>10 35000 1100 3 90 </br>10 25000 0 1 100 </br> 5 </br> 14 40000 2200 1 80 </br> 12 30000 2400 3 80 </br> 10 35000 400 3 100 </br> 12 40000 1000 2 90 </br> 10 25000 1300 1 100 </br> 3 </br> 10 30000 1600 1 90 </br> 12 35000 1700 3 100 </br> 12 25000 200 1 110  <br> 6  <br> 12 35000 700 3 110  <br> 12 25000 1900 1 110  <br> 12 30000 1700 3 80  <br> 10 30000 1500 1 100  <br> 10 35000 1100 3 90  <br> 10 25000 0 1 100 <br> 5  <br> 14 40000 2200 1 80 <br> 12 30000 2400 3 80 <br> 10 35000 400 3 100 <br> 12 40000 1000 2 90 <br> 10 25000 1300 1 100 <br> 3 <br> 10 30000 1600 1 90 <br> 12 35000 1700 3 100 <br> 12 25000 200 1 110  <br> 4 <br> 14 40000 100 1 80 <br> 12 40000 300 3 100 <br> 12 35000 1400 2 100 <br> 14 25000 1700 2 80 <br> 6 <br> 14 25000 900 3 90 <br> 12 25000 1900 1 80 <br> 14 40000 1600 3 110 <br> 14 30000 400 1 110 <br> 12 35000 1900 3 80 <br> 12 30000 600 2 90 <br> 3 <br> 12 35000 400 2 90 <br> 10 25000 1400 2 100 <br> 12 30000 1700 1 90|
| **Salida de ejemplo** |  	110 </br> NO DISPONIBLE </br> NO DISPONIBLE <br> 110 <br> NO DISPONIBLE <br> NO DISPONIBLE <br> 100 <br> NO DISPONIBLE <br> NO DISPONIBLE|
