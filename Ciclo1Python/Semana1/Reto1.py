#Salario base del empleado
salario_base, horas_extra, bonificacion = input("").split()

#Convertir cada entrada en el dato correspondiente
salario_base = float(salario_base)
horas_extra = int(horas_extra)
bonificacion = int(bonificacion)

#Calcular el valor de una hora extra
#Y el valor a pagar de horas extras
hora_laboral = salario_base/160
valor_hora_extra = hora_laboral + hora_laboral*0.35

salario_extra = valor_hora_extra * horas_extra

#Hallar la bonificacion:
bonificacion_extra = bonificacion * (salario_base*0.025)

#Hallar el salario antes de descuentos:
salario_antes_descuentos = salario_base + salario_extra + bonificacion_extra

#Los parafiscales:
salud = salario_antes_descuentos * 0.045
pension = salario_antes_descuentos * 0.05
compensacion = salario_antes_descuentos * 0.02

salario_despues_descuentos = salario_antes_descuentos - salud - pension - compensacion

print(round(salario_despues_descuentos,1), round(salario_antes_descuentos,1))