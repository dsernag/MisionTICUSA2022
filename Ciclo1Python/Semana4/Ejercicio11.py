# Diccionarios de entrada:

caballero = { "vida":2, "ataque":2, "defensa": 2, "alcance":2 } 
guerrero = { "vida":2, "ataque":2, "defensa": 2, "alcance":2 } 
arquero = { "vida":2, "ataque":2, "defensa": 2, "alcance":2 }
names = ["caballero", "guerrero", "arquero"]
dict_init = [caballero, guerrero, arquero]

print("Las estadísticas iniciales son las siguientes:")
for i, elem in enumerate(dict_init):
    print(names[i], elem)

# El caballero tiene el doble de vida y defensa que un guerrero
caballero["vida"] = guerrero["vida"] * 2
caballero["defensa"] = guerrero["defensa"] * 2

# El guerrero tiene el doble de ataque y alcance que un caballero
guerrero["ataque"] = caballero["ataque"] * 2
guerrero["alcance"] = caballero["alcance"] * 2

# El arquero tiene la misma vida y ataque que un guerrero,
# pero la mitad de su defensa y el doble de su alcance
arquero["vida"] = guerrero["vida"]
arquero["ataque"] = guerrero["ataque"]
arquero["defensa"] = guerrero["defensa"] // 2
arquero["alcance"] = guerrero["alcance"] * 2

dict_final = [caballero, guerrero, arquero]

print("\nLas estadísticas finales son las siguientes:")
for i, elem in enumerate(dict_final):
    print(names[i], elem)

