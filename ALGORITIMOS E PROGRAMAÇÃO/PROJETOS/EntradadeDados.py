#SINTAXE: VARIAVEL = input ("mensagem ao usuario")

nome = input("Digite o seu nome")
saudação = "Olá, " + nome
print(saudação)

try:
 num1 = int (input ("Digite o primeiro numero")) #Para somar tem que tranformar o numero em inteiro ou da erro na soma
 num2 = int (input ("Digite o segundo numero"))
except: # só executa se a tentativa falhar TRY
 print("Você deve inserir um numero inteiro")
else:
 print (num1 + num2)
