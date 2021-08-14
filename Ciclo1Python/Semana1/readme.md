# Ejercicio 1 [Solución](https://github.com/dsernag/MisionTICUSA2022/blob/main/Ciclo1Python/Semana1/Ejercicio1.py)
## Operaciones matemáticas con números en Python

### Enunciado
Realiza un programa que cumpla con el siguiente algoritmo, utilizando siempre que sea posible, operadores en asignación: Guarda en una variable numero_magico el valor 12345679 (sin el 8) Asignar a otra variable numero_usuario. Hay que especificar que sea entre 1 y 9 (asegúrate que es un número) Multiplica el numero_usuario por 9 en sí mismo Multiplica el numero_magico por el numero_usuario en sí mismo Finalmente muestra el valor final del numero_magico por pantalla.

### Instrucciones

Para la solución de este problema, se requiere que el usuario ingrese un número entero y el sistema realice el cálculo respectivo para hallar la multiplicación. Para esto se debe usar la siguiente expresión. (multiplicación = numero_usuario X numero_magico). Por último, realizar la impresión por pantalla de la multiplicación.
___

# Reto 1 [Solución](https://github.com/dsernag/MisionTICUSA2022/blob/main/Ciclo1Python/Semana1/Reto1.py)
## Calculando los descuentos sobre mi salario

### Enunciado
Un empleado desea conocer a cuánto dinero equivalen los descuentos exigidos por la ley en relación con los pagos que la compañía para la que trabaja le realiza mensualmente. Con el propósito de verificar el valor total de los descuentos decide construir un programa en Python que le permita verificar el valor de su salario antes y después de realizar los descuentos. Después de consultar sobre la normatividad Colombiana y revisar con detalle su contrato laboral nota que debe tener en cuenta los siguientes aspectos:

El valor de una hora de trabajo normal se obtiene dividiendo el salario base sobre 160. Este valor corresponde a la jornada laboral establecida en el contrato (40 horas a la semana y 4 semanas al mes).
Las horas extras se liquidan con un recargo del 35% sobre el valor de una hora normal.
Debido a buen desempeño de un empleado la empresa ocasionalmente otorga bonificaciones de 2.5% del salario base.
El salario total antes de descuentos se calcula como la suma del salario base, más el valor de las horas extras, más las bonificaciones (si las hay).
Se descontará 4.5% del salario total antes de descuentos para el plan obligatorio de salud.
Se descontará 5% del salario total antes de descuentos para el aporte a pensión.
Se descontará 2% del salario total antes de descuentos para caja de compensación.


Luego de considerar toda esta información, Camilo decide construir un programa que permita a cualquier empleado de la empresa verificar si los pagos son correctos.

| | |
| --- | --- |
| **Entrada** | El programa recibirá 3 parámetros: <br> El salario base del empleado <br> La cantidad de horas extras se representa a través de un número entero positivo. En caso de no realizar horas extras durante el mes, se ingresará el valor 0 <br> Si hubo bonificaciones se ingresará el valor 1, de lo contrario el valor 0.|
| **Salida** | El programa debe imprimir 2 valores: <br> El valor a pagar al empleado luego de realizar los descuentos de ley. El resultado debe imprimirse con un número decimal <br> El salario total del empleado antes de descuentos. El resultado debe imprimirse con un número decimal.|

### Instrucciones para la calificación automática

Antes de enviar la solución del reto, por favor tenga en cuenta los siguientes aspectos: <br> Cada caso de prueba se especifica en una única línea <br> Cada línea debe contener los valores de los parámetros separados por un espacio <br> Es importante no utilizar ningún mensaje a la hora de capturar las entradas, es decir, al utilizar la función input()no agregue ningún texto para capturar los datos <br> Como ejemplo considere el caso de prueba 1000000 0 0, el cual corresponde a un trabajador con una salario base de 1000000 con 0 horas extras y sin bonificaciones <br> El resultado debe imprimirse con un número decimal.

### Casos de prueba

| | |
| --- | --- |
| **Entradas de ejemplo** | 1000000 0 0 </br> 2355255 2 1 <br> 1000000 0 0 <br> 2355255 2 1 <br> 1000000 5 0 <br> 1501500000.25 3 1 <br> 00.0 0.0 <br> 10.9 1.0 |
| **Salida de ejemplo** | 885000.0 1000000.0 </br> 2171685.0 2453881.3 <br> 885000.0 1000000.0 <br> 2171685.0 2453881.3 <br> 922335.9 1042187. <br> 1394290.1 1575469.0 <br> 0.0 0.0 <br> 0.9 1.0 |
