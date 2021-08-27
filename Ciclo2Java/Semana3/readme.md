# Reto 3 | Agregando una interfaz gráfica para el mini mercado | [Solución Reto 3](https://github.com/dsernag/MisionTICUSA2022/blob/main/Ciclo2Java/Semana3/Reto3.java) | [Interfaz Reto 3]([Solución Reto 3](https://github.com/dsernag/MisionTICUSA2022/blob/main/Ciclo2Java/Semana3/Reto3InterfazNetBeans))
### Enunciado

En este reto continuaremos trabajando con el sistema de inventario para el mini mercado desarrollado en el Reto 2. Nuestro objetivo es implementar una interfaz gráfica a la cual podamos incorporar las funcionalidades desarrolladas previamente. A continuación, se presenta nuevamente el contexto del problema.

Un mini mercado de barrio vende diferentes productos, usualmente frutas, dulces y algunos tipos de carne. Con el propósito de mejorar el control sobre las ventas y el inventario de la tienda, el tendero decide mandar a construir una aplicación que le permita almacenar la información de los productos y realizar algunos cálculos sobre los datos.

Adicionalmente, con el propósito de tener una especificación más clara de los requerimientos del problema usted cuenta con las siguientes historias de usuario.

| código | nombre | precio | inventario |
| --- | --- | --- | --- |
| 1 | Tangelos | 9000.0 | 67 |
| 2 | Limones | 2500.0 | 35 |
| 3 | Peras | 2700.0 | 65 |
| 4 | Arandanos | 9300.0 | 34 |
| 5 | Tomates | 8100. | 42 |
| 6 | Fresas | 9100.0 | 90 |
| 7 | Helado | 4500.0 |	41 |
| 8 | Galletas | 700.0 | 18 |
| 9 | Chocolates | 4500.0 | 80 |
| 10 | Jamon | 11000.0 | 55 |
Tabla 1: Productos disponibles en la tienda.
<br>

Adicionalmente, con el propósito de tener una especificación más clara de los requerimientos del problema usted cuenta con las siguientes historias de usuario.

|**Hisotoria de usuario** | Nro. 1 |
| --- | --- |
|**Título:** | Generar informe. |
|**Descripción** |**COMO:**	Usuario. <br> **QUIERO:** Conocer el precio de los 3 productos con los precios más altos. <br> **PARA:** Para mantener la información de la tienda actualizada.|
|**Criterios de aceptación** | Los productos deben presentarse de mayor a menor..|

<br>

|**Hisotoria de usuario** | Nro. 2 |
| --- | --- |
|**Título:** | Agregar productos. |
|**Descripción** |**COMO:**	Usuario. <br> **QUIERO:** Agregar productos nuevos a la aplicación <br> **PARA:** Para mantener la información de la tienda actualizada.|
|**Criterios de aceptación** | Se debe validar que no se agreguen campos vacíos. <br> Se debe generar un mensaje de confirmación mostrando que la operación se realizó correctamente.|

<br>

|**Hisotoria de usuario** | Nro. 3 |
| --- | --- |
|**Título:** | Modificar productos |
|**Descripción** |**COMO:**	Usuario. <br> **QUIERO:** Modificar productos. <br> **PARA:** Para mantener la información de la tienda actualizada.|
|**Criterios de aceptación** | Se debe generar un mensaje de confirmación mostrando que la operación se realizó correctamente. |

<br>

|**Hisotoria de usuario** | Nro. 4 |
| --- | --- |
|**Título:** | Eliminar productos |
|**Descripción** |**COMO:**	Usuario. <br> **QUIERO:** Eliminar productos. <br> **PARA:** Para mantener la información de la tienda actualizada.|
|**Criterios de aceptación** | Se debe validar que no se agreguen campos vacíos. <br> Se debe generar un mensaje de confirmación mostrando que la operación se realizó correctamente.|

<br>

|**Hisotoria de usuario** | Nro. 4 |
| --- | --- |
|**Título:** | Visualizar productos |
|**Descripción** |**COMO:**	Usuario. <br> **QUIERO:** Visualizar toda la información de los productos de la tienda. <br> **PARA:** Mejorar el control sobre los productos disponibles. |
|**Criterios de aceptación** | El código del producto no se debe presentarse. <br> Los campos deben presentarse en el orden nombre, precio e inventario.|

<br>

Antes de comenzar con el diseño de la interfaz gráfica debe tener disponible la solución propuesta para el Reto 2. Se debe contar con la implementación de los métodos agregar, actualizar, eliminar, generarInforme, verificarExistencia implementados en la clase BaseDatosProductos. Esta clase debe contener un HashMap listaProductos y tener cargados los datos presentados en la Tabla 1.El reto estará formado por dos partes: en la primera, modificaremos el método generarInforme y en la segunda se creará una interfaz gráfica.

**NOTA:** La calificación de la interfaz gráfica será asignada de forma manual por el profesor del curso. La evaluación automática solo se hará sobre la primera parte del reto "Actualizando el informe".

**Parte 1: Actualizando el informe.**

Debido a algunos cambios en el modelo de negocio, el tendero solicita modificar el informe generado con la información de los productos. En este caso, se requiere actualizar la función generarInforme desarrollada en el reto anterior para que muestre el nombre de los 3 productos con los precios más altos.

Por ejemplo, al generar el informe con los datos disponibles en la Tabla 1 obtendríamos:

Jamon Arandanos Fresas.

| | |
| --- | --- |
| **Entrada** |Cada uno de los casos de prueba estará compuesto por dos líneas. <br> La primera línea estará formada por una cadena de texto que identifica la operación a realizar. En este caso, las operaciones válidas son: <br> ACTUALIZAR. <br> BORRAR. <br> AGREGAR. <br> La segunda línea estará formada por 4 valores (código, nombre, precio, inventario) que representan el producto <br> el cual se quiere realizar la operación. <br> En el caso de la operación ACTUALIZAR la segunda línea debe contener el código y los nuevos valores del producto. <br> En el caso de la operación BORRAR se deben especificar todos los atributos del producto a eliminar.|
| **Salida** |La salida estará representada por una única línea formada por tres valores que representan los tres productos con los precios más altos ordenados de mayor a menor. Los nombres estarán separados por un espacio. <br><br> Estos 3 valores deben imprimirse después de realizar las operaciones solicitadas en la primera línea. <br> En caso de solicitar ACTUALIZAR o BORRAR un producto que no existe (es decir, que el código del producto no <br> encuentra en la base de datos), se debe imprimir "ERROR". <br> En caso de solicitar AGREGAR un producto cuyo código ya existe en la base de datos se debe imprimir "ERROR".|



### Casos de prueba

| | |
| --- | --- |
| **Entradas de ejemplo** | AGREGAR <br> 11 Melon 70 13 <br> BORRAR <br> 10 Jamon 15000 10 <br> ACTUALIZAR <br> 7 Helado 65000 11 <br> BORRAR <br> 14 Maiz 45000 12 |
| **Salida de ejemplo** | Jamon Arandanos Fresas <br> Arandanos Fresas Tangelos <br> Helado Jamon Arandanos <br> ERROR |

**Parte 2: Implementando una interfaz gráfica con Swing**

El dueño del almacén le entrega el siguiente diseño de la interfaz gráfica (ver figura 2). En el diseño se incluyen las ventanas emergentes que surgen como resultado de realizar algunas validaciones y los aspectos que el desea tener en la interfaz de la aplicación. Su objetivo es construir una interfaz gráfica similar a la presentada en el diseño. Lo más importante es que la interfaz permita incorporar las funcionalidades de ACTUALIZAR, BORRAR, AGREGAR e INFORMES desarrolladas en el reto anterior. Para esto, se sugiere seguir los siguientes pasos:

<img src="https://github.com/dsernag/MisionTICUSA2022/blob/main/images/javareto3.png" alt="DiseñoInterfazGráfica">
Figura 2. Diseño incial interfaz gráfica.
<br><br>

Identifique los diferentes paneles que puede contener la interfaz. Recuerde que los paneles servirán comocontenedores para los componentes (Botones, etiquetas, cuadros de texto etc.).
Luego de declarar los paneles seleccione el Layout más conveniente y agregue los componentes que aparecen en lainterfaz.
Luego de tener una apariencia similar a la presentada en el diseño, es necesario capturar y programa los eventos decada componente para que realice la acción deseada.
Se deben implementar las validaciones requeridas y presentadas en el diseño.
Luego de capturar los eventos deben enlazarse con las funciones implementadas en el reto anterior y con la nuevaversión de la función generarInforme.
Verifique el correcto funcionamiento de todos los componentes, así como de las validaciones requeridas.

### Instrucciones para la calificación automática
Antes de enviar la solución del reto, por favor tenga en cuenta los siguientes aspectos: <br> Cada caso de prueba se especifica en dos líneas. <br> Cada línea debe contener los valores de los parámetros separados por un espacio. <br> Debe existir en el código, una clase principal llamada "Reto3". <br> En la clase "Reto3" debe existir un método llamado "run". <br> El código no debe contener variable Scanner, recuerde trabajarla como variable global en la clase Reto3 (n <br> instanciarla en el método principal "run"). <br> Es importante no utilizar ningún mensaje a la hora de capturar las entradas. <br> Únicamente debe imprimir los resultados finales. No imprima valores con cálculos intermedios. <br> La clase "Reto3" no debe ser de tipo public. <br> Si utiliza clases adicionales, estas no deben ser de tipo public. <br> Recuerde que la calificación automática únicamente aplica para la primera parte del reto. No agregue código asociad <br> a la interfaz gráfica. Esta será calificada de forma manual por el profesor del curso.
