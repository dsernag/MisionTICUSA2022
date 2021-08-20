# Ejercicio 16 | Manejo de archivos Python | [Solución 16](https://github.com/dsernag/MisionTICUSA2022/blob/main/Ciclo1Python/Semana5/personas.py)
### Enunciado
Crear un programa llamado personas.py que lea los datos de un archivo de texto y que transforme cada fila en un diccionario y lo añada a una lista llamada personas. Luego recorre las personas de la lista y para cada una muestra de forma amigable todos sus campos. Se debe crear el archivo personas.txt que contenga la siguiente información: 1;Carlos;Pérez;05/01/1989 2;Manuel;Hernandez;26/12/1983 3;Rosa;Campos;12/06/1971 4;David;García;25/07/2006 Los campos del diccionario serán por orden: id, nombre, apellido y nacimiento.

### Instrucciones
Para solucionar este problema, el usuario debe crear en una misma carpeta dos archivos, uno llamado personas.txt que será el archivo con la información para procesar y el archivo personas.py que será el archivo donde se escribe el programa. Al leer el archivo con Python, es posible que halla errores de codificación al mostrar algunos caracteres. Se puede indicar la codificación del archivo manualmente durante la apertura como argumento en el open, por ejemplo con UTF-8: open(..., encoding=utf8) Después de leer el archivo guarde la información en un diccionario y realice el procesamiento planteado.

___

# Reto 5 | Inventario para un supermercado de víveres | [Solución Reto 5](https://github.com/dsernag/MisionTICUSA2022/blob/main/Ciclo1Python/Semana5/Reto5.py)
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







