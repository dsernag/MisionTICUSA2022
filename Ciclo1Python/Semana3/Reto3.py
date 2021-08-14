#Definir la cantidad de equipos a ingresar:
n_times = int(input(""))

diccionario = dict()

for n in range(1,n_times+1):
    estadios, estadio_peque, estadio_altura, liga_local, capital = input("").split()

    estadios = float(estadios) 
    estadio_peque = float(estadio_peque)
    estadio_altura = float(estadio_altura)
    liga_local = float(liga_local)
    capital = int(capital)

    if estadios < 12 or estadio_peque < 35000 or estadio_altura > 1500 or liga_local < 3:
        pass
    else:
        diccionario[n] = capital

if len(diccionario) == 0:
    print("NO DISPONIBLE")
else:
    for x in diccionario.values():
        print(x)
