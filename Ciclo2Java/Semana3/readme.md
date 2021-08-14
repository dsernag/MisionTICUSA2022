# Ejercicio 20 [Solución](https://github.com/dsernag/MisionTICUSA2022/blob/main/Ciclo2Java/Semana2/Reto20.java)
___

# Reto 3 [Solución](https://github.com/dsernag/MisionTICUSA2022/blob/main/Ciclo2Java/Semana2/Reto2.java)
## Inventario para el mini mercado

### Enunciado
Un mini mercado de barrio vende diferentes productos, usualmente frutas, dulces y algunos tipos de carne. Con el propósito de mejorar el control sobre las ventas y el inventario de la tienda, el tendero decide mandar a construir una aplicación que le permita almacenar la información de los productos y realizar algunos cálculos sobre los datos.

Luego de discutir por un tiempo sobre lo que debería hacer la aplicación, logran construir el siguiente diagrama de casos de uso.

<img src="https://github.com/dsernag/MisionTICUSA2022/blob/main/imagesjavareto2.png" alt="ExplicacionMiniMercado">

Usted es contratado para desarrollar el sistema de inventario con las funcionalidades presentadas en el diagrama de casos de uso en el lenguaje de programación Java. Debido a que esta es una etapa inicial en el desarrollo de la aplicación, la base de datos será representada temporalmente mediante un HashMap llamado listaProductos que tendrá por llave el código del producto y por valor una instancia de la clase Producto que tendrá como atributos código, nombre, precio e inventario. La Tabla 1 presenta los productos disponibles a la fecha en el almacén.

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
Su misión es implementar todas las funcionalidades presentadas en el diagrama de casos de uso. Para esto es necesario construir 3 métodos que representen las operaciones de agregar, actualizar y eliminar. Estas funciones deben implementar una clase con el nombre BaseDatosProductos que contenga el HashMap listaProductos.

Adicionalmente, el tendero desea generar un informe que contenga: el nombre del producto con el precio mayor; el nombre del producto con el precio menor; el promedio de precios de todos los productos y el valor total del inventario a la fecha. Este último se obtiene multiplicando el precio de cada producto por el inventario disponible y luego sumando todos los resultados. Este método debe llamarse generarInforme implementarse en la clase BaseDatosProductos.

Por ejemplo, al generar el informe con los datos disponibles en la Tabla 1 obtendríamos: <br> Producto precio mayor: Jamon. <br> Producto precio menor: Galletas. <br> Promedio de precios: 6140.0. <br> Valor del inventario: 3503500.0.

Para evitar errores a la hora de agregar, actualizar y borrar productos, se debe implementar un método llamado verificarExistencia que permitirá comprobar si el producto existe o no en la base de datos. Este método debe implementarse en la clase BaseDatosProductos.

| | |
| --- | --- |
| **Entrada** |Cada uno de los casos de prueba estará compuesto por dos líneas. <br> La primera línea estará formada por una cadena de texto que identifica la operación a realizar. En este caso, las operaciones válidas son <br> ACTUALIZAR <br> BORRAR <br> AGREGAR <br> La segunda línea estará formada por 4 valores (código, nombre, precio, inventario) que representan el producto sobre el cual se quiere realizar la operación <br> En el caso de la operación ACTUALIZAR la segunda línea debe contener el código y los nuevos valores del producto <br> En el caso de la operación BORRAR se deben especificar todos los atributos del producto a eliminar.|
| **Salida** | La salida estará representada por una única línea formada por cuatro valores: <br><br> Nombre del producto con el precio mayor. <br> Nombre delproducto con el precio menor. <br> Promedio de precios. <br> Valor del inventario. <br> Estos 4 valores deben imprimirse después de realizar las operaciones solicitadas en la primera línea. <br> Los valores numéricos deben imprimirse con un número decimal. <br> En caso de solicitar ACTUALIZAR o BORRAR un producto que no existe (es decir, que el código del producto no se encuentra en la base de datos), se debe imprimir 'ERROR'.En caso de solicitar AGREGAR un producto cuyo código ya existe en la base de datos se debe imprimir 'ERROR'.|

### Instrucciones para la calificación automática

Antes de enviar la solución del reto, por favor tenga en cuenta los siguientes aspectos: <br> Cada caso de prueba se especifica en dos líneas <br> Cada línea debe contener los valores de los parámetros separados por un espacio <br> Debe existir en el código, una clase principal llamada ´Reto2´ <br> En la clase ´Reto2´ debe existir un método llamado ´run´ <br> El código no debe contener variable Scanner, recuerde trabajarla como variable global en la clase Reto2 (no instanciarla en el método principal ´run´) <br> Es importante no utilizar ningún mensaje a la hora de capturar las entradas <br> Únicamente debe imprimir los resultados finales. No imprima valores con cálculos intermedios <br> La clase ´Reto2´ no debe ser de tipo public <br> Si utiliza clases adicionales, estas no deben ser de tipo public.

### Casos de prueba

| | |
| --- | --- |
| **Entradas de ejemplo** | AGREGAR <br> 11 Melon 70 13 <br> BORRAR <br> 10 Jamon 15000 10 <br> ACTUALIZAR <br> 7 Helado 65000 11 <br> BORRAR <br> 14 Maiz 45000 12|
| **Salida de ejemplo** | Jamon Melon 5588.2 3504410.0 <br> Arandanos Galletas 5600.0 2898500.0 <br> Helado Galletas 12190.0 4034000.0 <br> ERROR |
