#listaVazia = []

#Acessando elementos de uma lista
lista = [1,1.5,True,"texto",0,1] #O indice sempre começa em zero
lista[1] = 3.0
print(lista[1])

#len() nos da o numero de elementos contidos na lista

#FATIANDO E COPIANDO UMA LISTA
lista = [0,1,2,3,4,5,6,7,8]
lista4 = lista[0:4]
listaSliceLen = lista[4:len(lista)] #vai da posição 4 até o final da lista
listaPares = lista[0:len(lista):2] #vai do zero ao final da lista, pulando de 2 em 2
listaCopiada = lista[0:len(lista)]
listaCopy = lista.copy()
print(lista4)

# SELECIONANDO VALORES

lista = [0,1,2,3,4,5,1000,7,8]
lista.index(1000) #index é um metodo, metodo é uma função contido em uma outra classe, o resultado vai ser a posição que ele se encontra

#INSERINDO VALORES

lista = [0,1]
lista.append(3) #adiciona o valor no final da lista
lista.insert(0,4) #adiciona  na posição(ex0) o valor (ex4)
lista += [4,5,6] #adiciona ao final, junta  uma lista na outra

#REMOVENDO VALORES

lista = [0,1,0,1]
lista.remove(1) #remove o indice
lista.pop(2) #exclui a posição do indice da lista
lista.pop() # sem elemnto dentro , exclui o ultimo indice da lista
del lista[2]

#ORDENANDO VALORES

lista=[3,5,1,2,7,9,0,1]
lista.sort() #organiza as variaveis de maneira crescente
lista.reverse() # inverte a posição dos indices, nao deiza nescessariamente decrescente

#FILA PRIMEIRO A ENTRAR PRIMEIRO A SAIR, ULTIMO A ENTRA ULTIMO A SAIR
from collections import deque
fila = deque([0,1,2,3]) #deque estabele uma variavel tipo fila
fila.append(4)
fila.append(5)
fila.popleft() #tira o primeio indice
fila.popleft()

#EXEMPLO, FAZER UMA LISTA DE 0 A 10 COM FOR

lista =[]
for i in range(11):
    lista.append(2*i)

#LISTA ALINHADA

 matriz = [[1,2,3,4],
           [5,6,7,8],
           [9,10,11,12]]
 transposta =[]
 for i in range(4):
     linhaTransposta = []
     for linha in matriz:
         linhaTransposta.append(linha[i])

 '''
 Transposta = [[1,5,9],
               [2,6,10],
               [3,7,11],
               [4,8,12]]
 '''
