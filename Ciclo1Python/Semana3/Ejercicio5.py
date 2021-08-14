def calculador (num1, num2):
    print("\nPor favor seleccione el número de la operación a realizar\
        \n1)Suma\n2)Resta\n3)Multiplicación")
    mensaje = input()

    if mensaje in ["1", "2", "3"]:
        if mensaje == "1":
            return "\nEl resultado de la operación es: " + str(num1 + num2)
        elif mensaje == "2":
            return "\nEl resultado de la operación es: "+ str(num1 - num2)
        elif mensaje == "3":
            return "\nEl resultado de la operación es: "+ str(num1 * num2)
    else:
        return "\nNO ESCOGISTE UN NÚMERO VÁLIDO"

#Obtener los números y pasarlo a number (Entrada String)
print("Ingrese un par de números para operar")
number1, number2 = (input().split())
number1, number2 = int(number1), int(number2)
print(calculador(number1, number2))