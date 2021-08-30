# Ejercicio 20 | Operaciones CRUD con JDBC | [Solución 20](https://github.com/dsernag/MisionTICUSA2022/blob/main/Ciclo2Java/Semana4/Ejercicio20.java)
### Enunciado e instrucciones
1. Para este ejercicio debemos crear una base de datos en MySQL llamada Fábrica con una tabla con el mismo nombre. Esta tabla debe contener los atributos:

**Tabla: Fábrica**
* numero_fabrica: llave primaria y tipo numérico
* cantidad_empleados: tipo numérico
* pais: tipo texto
* gerente: tipo texto

2. Se deben agregar 4 registros a la base de datos utilizando MySQLWorkbech (puede ser cualquier tipo de información)

3. Utilizando Java, declare las siguientes clases:
    * **DBConnection**: esta clase contendrá un método llamado getConnection() el cual
realizará la conexión a la base de datos.
    * **FabricaJDBC**: esta clase contendrá la implementación de las operaciones CRUD
para la base de datos Fábrica con ayuda de las funcionalidades ofrecidas por JDBC
    * **Main**: esta clase contendrá el método principal donde se realizarán las pruebas

4. Luego de tener las tres clases implementadas, realice las siguientes operaciones:
    * Agregue dos registros nuevos a la base de datos
    * Imprima todos los registros de la base de datos
    * Seleccione uno de los registros que agregó en el segundo punto y actualice la cantidad de empleados a 33
    * Elimine alguno de los registros agregados con anterioridad

5. En cada operación verifique que los cambios se vean reflejados en la base de datos.

6. Puede tomar como ejemplo la presentación realizada sobre JDBC.
___

# Reto 4 | Realizando consultas a nuestra base de datos | [Tabla `producto`](https://github.com/dsernag/MisionTICUSA2022/blob/main/Ciclo2Java/Semana4/producto.sql)| [Solución Reto 4](https://github.com/dsernag/MisionTICUSA2022/blob/main/Ciclo2Java/Semana4/Reto4.sql)
### Enunciado

En este reto continuaremos trabajando con el sistema de inventario para la tienda de víveres desarrollado en el Reto 2 y 3. Nuestro objetivo es realizar consultas SQL a una base datos que contiene la información de los productos disponibles en el almacén. A continuación, se presenta nuevamente el contexto del problema.

Un almacén de víveres vende diferentes productos, usualmente frutas, dulces y algunos tipos de carne. Con el propósito de mejorar el control sobre las ventas y el inventario de la tienda, el dueño del almacén decide construir una aplicación que le permita almacenar la información de los productos y realizar algunos cálculos sobre los datos disponibles. En este momento la aplicación tiene una base de datos que cuenta con una tabla llamada Productos. La información disponible en la tabla se presenta a continuación.

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

Con el fin de verificar el correcto funcionamiento de la base de datos, usted debe construir consultas SQL para obtener la siguiente información. (**NOTA:** Para este caso solo se utilizará consultas de tipo SELECT).

1. Obtener el nombre y el inventario de los productos con un precio mayor o igual a 9200 en orden ascendente por nombre.

2. Obtener el promedio de precios de todos los productos en la tabla. Utilice el alias 'promedio' para la respuesta obtenida.

3. Obtener el nombre y el precio de todos los productos que comienzan con 'A' o con 'P' en orden ascendente.

4. Obtener el numero total de productos cuyos precios están entre 3000 y 10000. Utilice el alias 'total' para la respuesta obtenida.

5. Obtener valor total del inventario. Este valor se obtiene multiplicando el precio de cada producto por el inventario disponible y luego sumando todos los resultados. Utilice el alias 'total_inventario' para la respuesta obtenida.

### Instrucciones para la calificación automática
Para este reto todas las consultas son de tipo SELECT.<br> Para aquellas consultas que requieren un alias verifique se sea exactamente el indicado.<br> Si necesita ordenar los resultados de la consulta recuerde que puede utilizar la instrucción ORDER BY.<br> La base de datos ya se encuentra creada. Solo debe crear la consulta para obtener la información requerida.<br> Coloque todas las consultas en el orden solicitado.<br> Las consultas deben terminar con un punto y coma ";".