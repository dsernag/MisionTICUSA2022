# Traer la lista de tareas:
lista_tareas = [ [6, "Distribución"], 
                [2, "Diseño"],
                [1, "Concepción"],
                [7, "Mantenimiento"],
                [4, "Producción"],
                [3, "Planificación"],
                [5, "Pruebas"] ]
# Comando para ordenar la lista:
lista_tareas.sort()
# definir una variable que almacene el índice y el número asociado

# Imprimir los pasos sin el número:
for element in lista_tareas:
    print(element[1])
