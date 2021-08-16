# Lectura del archivo
archivo = open('datospersonas.txt', 'r', encoding = "utf8")

# Saltar la primera linea
next(archivo)

# La lista donde se almacenará cada diccionario:
listaPersonas = []
for line in archivo:
    codigo, nombre, apellido, nacimiento = line.split()
    # Se debe crear un diccionario para cada iteracíón
    dictTemporal = {}
    dictTemporal.update({"codigo" : codigo,
                        "nombre" : nombre,
                        "apellido" : apellido,
                        "nacimiento" : nacimiento})
    # Append a la lista
    listaPersonas.append(dictTemporal)

# Cerrar el archivo
archivo.close()

# Imprimir los valores de la lista de diccionarios:
for persona in listaPersonas:
    print("\n||Código:", persona["codigo"], 
          "||Nombre:", persona["nombre"],
          "||Apellido:", persona["apellido"], 
          "||F. de Nacimiento:", persona["nacimiento"], end = " ")