#Las tres entradas del problema
distancia, record, t_trayecto = input("").split()

distancia = float(distancia)
record = float(record)
t_trayecto = float(t_trayecto)

record_actual = (distancia/1000) / (t_trayecto/3600)
record_a_superar = record + (record*0.2)

if distancia < 0 or record < 0 or t_trayecto < 0:
    print("ERROR")
elif record >= record_actual:
    print("VELOCIDAD NORMAL")
elif record_actual > record and record_actual < record_a_superar:
    print("NUEVO RECORD")
elif record_actual >= record_a_superar:
    print("ENTREVISTA")
