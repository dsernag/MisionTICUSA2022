# Lista de elementos definida por el problema:
elementos = [1, 5, -2]

# Creación de la función con elTry y si no levantar la excepeción
valor = int(input("Ingrese un número: "))
def agregar_una_vez(valor_agregar, lista_elementos):
    if valor_agregar in lista_elementos:
        raise ValueError("El número que está intentado ingresar ya está en la lista")
    else:
        lista_elementos.append(valor_agregar)
        print("La lista de elementos quedó: ", lista_elementos)

agregar_una_vez(valor, elementos)