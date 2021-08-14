# Lista prueba
listaPrueba = [x for x in range(1, 10)]

# Ingresar dato de entrada
print("Ingrese un número para ver sí está en la lista:")
numero = int(input())

# Verificar y volver a solicitar
while(numero not in listaPrueba):
    print("El número no está en la lista, vuelve a intentar")
    numero = int(input())
print("El número", numero, "se encuentra en la lista")