#   elif é quando coloca um if dentro de outro if (if>elif>else) testar multiplas opções
#                   ELIF X if-ELSE
# if estaChovendo:       |       if estaChovendo:
#   fiqueEmCasa()        |           fiqueEmCasa()
# elif temSuga:          |      else:
#   vaParaPiscina()      |        if temSunga:
# else:                  |             vaParaPiscina()
#   vaBrincar()          |        else:
#                        |         vaBrincar()

#n1 = 7
#n2 = 3

if n1== n2:
   print("numeros iguais")
elif n1 < n2:
   print("n1 menor que n2")
else: #else não tem codicional enxemplo ele não faz n1>n2, se as concições acima for falso o else executa
    print("n1 maior que n2")