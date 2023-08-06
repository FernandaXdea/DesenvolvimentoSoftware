"""
Para criar um comentário multilinha em Python, você pode usar uma string multilinha 
(também conhecida como string de várias linhas). 
As strings multilinhas são delimitadas por três aspas (simples ou duplas) no início e no final do comentário. 
No entanto, é importante notar que esse tipo de comentário não é ignorado pelo interpretador Python e ocupará 
espaço na memória quando o código for executado. Portanto, é melhor usá-los com moderação para manter o código limpo e legível.
"""
#comentario
 #DECLARANDO VARIAVEIS

print ("\n--------------------------------------\nDECLARANDO VARIAVEIS")
#\n = quebra de linha
X = 5
X = 7
 print(X)

#TIPO INTEIRO

#print ("\n----------------\nTIPO INTEIRO")
print(X)
print(type(X))

#TIPO FLOAT

print ("\n-------\nTIPO FLOAT")
pontoflutuante = 3.5
#print(pontoflutuante)
print(type(pontoflutuante))

#TIPO BOOL

print ("\n-------\nTIPO BOOL")
booleano = True
print(booleano) #imprime o valor da varialvel
#print(type(booleano)) #imprime o tipo da vairavel

#TIPO STRING

print ("\n-------\nTIPO STRING")
texto = "TESTE"
print(texto) 
print(type(texto)) 

#CONVERSÃO ENTRE TIPOS

print ("\n-------\nCONVERSÃO ENTRE TIPOS")
numero1 = 1
texto2 = "2"

numero2 = int(texto2) # essa função converte p texto p/ inteiro
print (type(numero2))
print(numero1+numero2)

floatParaInt = int(1.0)
intParaTexto = str(10) #"10"
textoParaFloat = float("2.5") #2.5

print(type(floatParaInt))
print("Lucas"+intParaTexto)
print(type(textoParaFloat))
