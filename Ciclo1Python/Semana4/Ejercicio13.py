# Versión clásica:

def esPrimo(numero):
    # Los pares nunca serán primos
    if numero % 2 == 0:
        print("No es primo")
        return

    # Manejo de los primeros números base:
    if numero ==1:
        print("No es primo")
        return
    elif numero in [2, 3]:
        print("Es primo")
        return

    # Contador desde el número 3 hasta el número
    # Al final se verifica que se recorrió todo el for
    # sin encontrar ningun múltiplo del número
    for i in range(3, numero + 2, 2):
        if numero % i == 0 and numero != i:
            print("No es primo")
            return
        elif i == numero:
            print("Es primo")
            return

# Entrada
entrada = int(input("Ingrese un número para verificar sí es primo: "))
esPrimo(entrada)
