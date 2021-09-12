# Ejercicio 21 | SPRING DATA JDBC | [Solución 21](https://github.com/dsernag/MisionTICUSA2022/tree/main/Ciclo2Java/Semana5/Ejercicio21)
### Enunciado e instrucciones

1. Para este ejercicio debemos crear una base de dato en MySQL llamada Personas con una tabla con el mismo nombre. Esta tabla debe contener los atributos:

**Tabla: Personas**
* id_persona: llave primaria y tipo numérico
* nombre: tipo texto
* apellido: tipo texto
* profesión: tipo texto
* ciudad: tipo texto

Por el momento no debemos ingresar ningún registro a la base de datos. Los agregaremos
usando Spring Data JDBC.

2. Construya un proyecto utilizando Spring Boot y agregue Spring Data JDBC y el driver para MySQL al proyecto

3. Construya una clase llamada Persona que representará la tabla en la base de datos y agregue todos los atributos y anotaciones necesarios. Adicionalmente, agregue los métodos get, set y el método ToString

4. Implemente una interfaz llamada RepositorioPersona e implemente la interfaz
`CrudRepository<T, I>` para poder acceder a los métodos para la manipulación de datos.

5. Luego de tener la interfaz implementada, realice las siguientes operaciones:
    * Agregue dos registros a la base de datos
    * Imprima todos los registros de la base de datos
    * Cuente la cantidad de registros en la base de datos
    * imprima los datos de la persona con el id_persona = 2
    * Cambie la información de alguno de los registros de la base de datos
    * Elimine el registro de la persona id_persona = 2

6. En cada operación verifique que los cambios se vean reflejados en la base de datos
___
# Reto 5 | Sistema de inventario para el mini-mercado usando el patrón MVC y Spring Data JDBC   [Solución Reto 5](https://github.com/dsernag/MisionTICUSA2022/blob/main/Ciclo2Java/Semana5/)

### Enunciado
En este reto continuaremos trabajando con el sistema de inventario para la tienda desarrollado en el Reto 2 y reto 3. Nuestro objetivo es lograr implementar de forma completa la aplicación utilizando el patrón MVC y el Framework Spring Data JDBC. A continuación, se presenta nuevamente el contexto del problema.

Un mini-mercado vende diferentes productos, usualmente frutas, dulces y algunos tipos de carne. Con el propósito de mejorar el control sobre las ventas y el inventario de la tienda, el dueño del almacén decide construir una aplicación que le permita almacenar la información de los productos y realizar algunos cálculos sobre los datos disponibles.Con el propósito detener una especificación más clarasobre lo que debería hacer la aplicación, el dueño del almacén le pide ayuda a un amigo que tiene conocimientos en desarrollo de software para que lo oriente en el proceso. Luego de discutir por un tiempo sobre lo que debería hacer la aplicación, logran construir el siguiente diagrama de casos de uso.

<img src="https://github.com/dsernag/MisionTICUSA2022/blob/main/images/javareto2.png">
<br> <br> 

**Parte 1: Creando una base de datos en MySQL**

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

Estos registros deben ingresarse a la base de datos utilizando MySQL Workbech. Serán utilizados más adelante para realizar pruebas.

**Parte 2: Implementando el controlador con Spring Data JDBC.**

Para esta parte debemos seguir los siguientes pasos:<br>

<br> Crear un proyecto en NetBeans llamado inventarioAPP.
<br> Incluir Spring Boot y agregar 'Spring Data JDBC' y 'MySQL Driver' como parte de las dependencias del proyecto.
<br> Configurar el archivo 'application.properties' con las credenciales a la base de datos.
<br> Crear 3 paquetes: modelo, vista ycontrolador.
<br> En el paquete modelo, declare una clase llamada Producto que representará la tabla en la base de datos. No olvide agregar las anotaciones a la clase para definir cuál atributo será la llave primaria.
<br> En el paquete modelo declare una interfaz llamada RepositorioProducto que herede de CrudRepository. Este repositorio nos permitirá utilizar las funciones CRUD sin ninguna implementación adicional.
<br> En el Paquete controlador, declare una clase llamada ControladorProducto. Esta clase tendrá como atributo una instancia de RepositorioProducto.
<br> En la clase ControladorProducto implemente los métodos CRUD para la tabla Productos y un método informe que obtenga el nombre del producto con el precio mayor; el nombre del producto con el precio menor; el promedio de precios de todos los productos y el valor total del inventario a la fecha. Este último se obtiene multiplicando el precio de cada producto por el inventario disponible y luego sumando todos los resultados.
<br> Verifique el correcto funcionamiento de los métodos implementados.

**Parte 3: Implementando la Vista con Swing.**
Luego de implementar el modelo y el controlador con la ayuda de Spring Data JDBC, el dueño del almacén le entrega el siguiente diseño de la interfaz gráfica (ver figura 2). En el diseño se incluyen las ventanas emergentes que surgen como resultado de realizar algunas validaciones.Esta interfaz el la misma construida en el reto 3. El código debe alojarse en el paquete vista declarado anteriormente (Esta interfaz es la misma desarrollada en el reto 3).

<img src="https://github.com/dsernag/MisionTICUSA2022/blob/main/images/javareto3.png" alt="DiseñoInterfazGráfica">
Figura 1. Diseño incial interfaz gráfica.
<br><br>

Por ejemplo, si se trata de agregar un producto y existe algún campo vacío, se deberá generar una ventana emergente que informe que todos los campos son obligatorios. Cundo se agrega, se borra o se actualiza un producto se debe generar una ventana informando que el proceso fue exitoso. Al presionar el botón 'Actualizar Producto' se generará una ventana emergente con los campos a actualizar y presentando la información del producto que se encuentra seleccionado en la tabla. Cada que se realice una operación sobre los datos de la tabla, esta debe actualizarse nuevamente de manera automática.

Por otro lado, el botón llamado 'Informes' genera una ventana emergente con los datos obtenidos al evaluar el método generar informe. Para cumplir con el patrón MVC debemos garantizar que los eventos sean capturados por el controlador y no directamente por la vista.

Finalmente, para facilitar el desarrollo de la aplicación, el dueño del almacén le entrega una lista de verificación con todas las funcionalidades que se espera desarrollar.

### Comprobando las funcionalidades

| | **Descripción de la funcionalidad** | **Completado** |
| --- | --- | --- |
| 1 | Crear Base de datos en MySQL. | |
| 2 | Insertar los registros Tabla 1 en la Base de datos. | |	
| 3 | Implementar los métodos acceso a datos utilizando Spring Data JDBC. | |	
| 4 | Implementar función para borrarProducto en el controlador. | |	
| 5 | Implementar función para AgregarProducto en el controlador. | |	
| 6 | Implementar función para ActualizarProducto en el controlador. | |	
| 7 | Implementar la interfaz gráfica con Swing. | |
| 8 | Capturar los eventos generados por los botones 'Agregar Producto', 'Borrar producto' y 'actualizar producto' en el controlador. | |	
| 9 | Implementar validación sobre campos vacios para agregar producto. | |
| 10 | Implementar validación sobre campos vacios para actualizar producto.  | |
<br>

### Instrucciones para la calificación automática
<br> En la plataforma MasterTech, dónde se agregan los archivos de soporte, se debe adjuntar un archivo .zip que contenga todo el proyecto.
<br> La evaluación de las buenas prácticas se hará únicamente sobre el archivo "controlador.java". Para esto se debe agregar el código fuente al editor y dar clic en el botón calificar. En este caso, no se harán pruebas unitarias.<br> Únicamente se revisarán las reglas de buenas prácticas como en los retos anteriores.
<br> Antes de presentar la solución del reto a su formador, verifique que la aplicación cumple con todos los elementos requeridos.