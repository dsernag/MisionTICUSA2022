#Dos entradas:

N, K= input("").split()


N = int(N)
K = int(K)

talleres = input("").split()
talleres = list(map(int, talleres))

#Con este diccionario vemos cuántas veces se repite el valor
#En la lista de talleres
copias = dict()
for i in talleres:
    if i in copias.keys():
        copias[i] += 1
    else:
        copias[i] = 1

#Contamos el total de copias        
count_copias = 0
for cod,var in copias.items():
    if var > 1:
        count_copias += (var-1)

#Revisemos el total de fraudes
fraudes = 0

for x, elemnto in enumerate(talleres):
    if x < K:
        continue
    for k in range(1,K+1):
        if elemnto == talleres[x-k]:
            fraudes += 1
if fraudes > count_copias:
    fraudes = count_copias
print(count_copias, fraudes)
