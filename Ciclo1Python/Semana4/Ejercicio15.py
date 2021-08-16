# Este ejercicio puede ser realizado con una librería básica de phyton
# como lo es math
from math import gcd

# Obtener las entradas:
print("El siguiente programa calcula el máximo común entre dos números.")
print("Por favor digite dos números enteros positivos seguidos por un espacio: ")

numeros = input().split()
n_ints = list(map(int, numeros))
n1, n2 = n_ints[0], n_ints[1]

print("El máximo común divisor es: ", gcd(n1, n2))