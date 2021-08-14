"""
La tienda de Andrés vende diferentes productos, usualmente frutas, 
dulces y algunos tipos de carne. Con el propósito de mejorar el control 
sobre las ventas y el inventario de la tienda, Andrés decide construir 
una aplicación que le permita almacenar la información de los productos 
y realizar algunos cálculos sobre los datos.

En la primera parte del reto se debe construir una base de datos que almacene 
la información de los productos disponibles en la tienda. Debido a que Andrés 
no cuenta con un servidor de base de datos, solicita que temporalmente la base de
 datos sea representada mediante un diccionario de Python llamado productos que 
 tendrá por llave el código del producto y por valor una lista formada por los 
 atributos: nombre, precio e inventario. La Tabla 1 presenta los productos disponibles a la fecha.
"""
productos = {}

codigo = [i for i in range(1,11)]
nombre = ["Manzanas", "Limones", "Peras", "Arandanos", "Tomates", "Fresas", "Helado", "Galletas", "Chocolates", "Jamon"]
precio = list(map(float,[6000, 2500, 2700, 9300, 2100 , 4100, 4500, 500, 4500, 15000]))
inventario = [25 ,15 ,33 ,34 ,42 ,10 ,41 ,8 , 80, 10]

for i, val in enumerate(codigo):
    productos[val] = [nombre[i], precio[i], inventario[i]]

"""
Adicionalmente, Andrés está interesado en analizar los datos de los productos disponibles y conocer: 
el nombre del producto con el precio mayor; el nombre del producto con el precio menor; el promedio 
de precios de todos los productos y el valor total del inventario a la fecha. Este último se obtiene 
multiplicando el precio de cada producto por el inventario disponible y luego sumando todos los  resultados. 
Por ejemplo, al calcular estos 4 valores para los datos disponibles en la Tabla 1 obtendríamos :

    Producto precio mayor: Jamon
    Producto precio menor: Galletas
    Promedio de precios: 5120.0
    Valor del inventario: 1420500.0
"""
import statistics

# Definir la operación a realizar sobre el diccionario:
operacion = input("")
codigo, nombre, precio, inventario = input("").split()

# Casting de las variables:
codigo = int(codigo)
precio = float(precio)
inventario = int(inventario)

# Proceso para actualizar el diccionario de acuerdo a la operación
if operacion == "AGREGAR":
    if codigo in productos.keys():
        print("ERROR")
        exit()
    else:
        productos[codigo] = [nombre, precio, inventario]
elif operacion == "BORRAR":
    if codigo not in productos.keys():
        print("ERROR")
        exit()
    elif productos[codigo][0] != nombre or productos[codigo][1] != precio or productos[codigo][2] != inventario:
        print("ERROR")
        exit()
    else:
        productos.pop(codigo)
elif operacion == "ACTUALIZAR":
    if codigo not in productos.keys():
        print("ERROR")
        exit()
    elif productos[codigo][0] != nombre:
        print("ERROR")
        exit()
    else:
        productos[codigo] = [nombre, precio, inventario]
else:
    print("ERROR")
    exit()

# Sacar una lista con los precios y con el inventario:
precios = []
inventarios = []

for x in productos.values():
    precios.append(x[1])
    inventarios.append(x[2])

# Para hallar el producto más costoso y más económico:
p_costoso = list(productos.values())[precios.index(max(precios))][0]
p_barato = list(productos.values())[precios.index(min(precios))][0]


# Para hallar el valor del invetario y el promedio de precio
precio_inventario = []

for i in range(0,len(precios)):
    precio_inventario.append(precios[i]*inventarios[i])

valor_inventario = sum(precio_inventario)
promedio_precio = statistics.mean(precios)

# Imprimir el resultado:

print(p_costoso, p_barato, round(promedio_precio, 1), round(valor_inventario, 1))