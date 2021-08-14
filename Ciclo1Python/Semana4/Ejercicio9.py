# Valores de entrada
usuarios = {"Marta", "David", "Elvira", "Juan", "Marcos"}
administradores = {"Juan", "Marta"}

# Descripción del paso a paso
# 1 Borra a Juan de administradores
administradores.remove("Juan")

# 2 Añade a Marcos como nuevo admin
administradores.add("Marcos")
# 3 Checar quien es admin:
for user in usuarios:
    print(user, end = " ")
    if user in administradores:
        print("es admin")
    else:
        print("no es admin")