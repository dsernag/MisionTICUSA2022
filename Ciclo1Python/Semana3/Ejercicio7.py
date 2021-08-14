# Ingresar la cantidad de números
print("Por favor establezca la cantidad de números que va a ingresar:")
cantidad = int(input())

# Recolectar los números:
numbers = []
for entry in range(1,cantidad+1):
    numero = int(input())
    numbers.append(numero)

suma = 0
size = len(numbers)
for element in numbers:
    suma += element
print("El promedio de los números ingresados es: ", "{:.2f}".format(suma/size))