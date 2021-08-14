#Lista preliminar para separar
lista = [12, 14, 16, 89, 12, 32, 45, 21, 33, 31, 90, 28, 32, 13, 2, 3]

# Función para separar pares e impares

def separar(lista_numeros):
    pares = []
    impares = []
    for elem in lista_numeros:
        if elem % 2 == 0:
            pares.append(elem)
        else:
            impares.append(elem)
    return pares, impares

pares, impares = separar(lista)

print("Lista original", lista, "\nPares", pares, "\nImpares", impares)