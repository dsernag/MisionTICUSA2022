# Primero vamos a generar una lista con los números primos
# Al tener por lo menos los diez mil primeros primos, será suficiente

# Esta programa requiere dos funciones.

# Primera función, creación de la lista de números primos:
def generadorPrimos(limite):
    """ 
    Devuelve los primeros @limite números primos
    """
    numerosPrimos = [2, 3]
    # Esta función requiere dos for!

    # Primer for para hacer el append a la lista
    # Un segundo for revisará la condición
    # así, anexará solo los primos (basado en el ejercicio anterior)
    for i in range(5, limite+2, 2):
        for j in range(3, i + 2, 2):
            if i % j == 0 and j != i:
                break
            elif j == i:
                numerosPrimos.append(j)
    return numerosPrimos
    # Recomiendo hacer debug para entender el procedimiento!!!

# Ahora la segunda función para sacar los factores primos:
def factoresPrimos(numero):
    # Invocamos la función anterior para obtener el primer millón
    numerosPrimos = generadorPrimos(10000)

    # Para separar el número de entrada del que se operará
    resultado_division = numero

    # Lista donde se almacenaran los factores
    factores = []

    # Haremos un for recorriendo cada valor de los primos generados
    # Y dentro haremos un while para el append
    for i in numerosPrimos:
        while (resultado_division % i == 0 and resultado_division != 1):
            factores.append(i)
            resultado_division /= i
        if resultado_division == 1:
            print(factores)
            break

# Advertimos del algoritmo:
print("El siguiente programa funciona para números menores a 10mil")

# Pedir el input del usuario:
entero = int(input("Ingrese un número para obtener sus factores: "))

# Corremos la función que de por sí imprime
factoresPrimos(entero)