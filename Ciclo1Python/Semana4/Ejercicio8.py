# Pedir al usuario la frase:
frase = input("Ingrese una palabra o frase sin espacios ni puntuación,\
para verificar sí es palindroma:\n")

# Función para verificar eso:
def palindromaChecker(palabra_frase):
    limit = - 1
    verificador = []
    for i, element in enumerate(palabra_frase):
        if palabra_frase[i] == palabra_frase[limit - i]:
            verificador.append(True)
        else:
            verificador.append(False)
    if any(verificador):
        return "La frase ES palindroma"
    else:
        return "La frase NO ES palindroma"
print(palindromaChecker(frase))