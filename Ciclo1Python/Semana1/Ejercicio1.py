# Número mágico:
nmagico = 12345679

#Escoja el número
print("Escoja un número de 1 a 9")
numero_usuario = int(input())

#Transformaciones
numero_usuario *= 9
nmagico *= numero_usuario

#Imprimir el resultado
print("El número mágico es:", nmagico)
