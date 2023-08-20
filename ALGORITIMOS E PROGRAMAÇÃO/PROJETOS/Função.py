#DEFINIÇÃO DE UMA FUNÇÃO
def adicionaDois(numero): #função com argumento e retorno
    numero+= 2
    return numero
inteiro = 10
inteiro = adicionaDois(inteiro)

print(inteiro)

def PrimeiraFunc():  #função sem argumento
    print("Esta é minha primeira função")

#FUNÇÕES COM MUTIPLOS ARGUMENTOS
def mutiplica(n1,n2):
    return n1*n2
#argumentos com valor padrão
def multiplica(num1=3, num2=3):
    return num1*num2
print(multiplica())

#Funções com numero indeterminado de argumentos
def multiplicaNumeros(*varArgs): #com o varArgs consigo passar um numero quaisquaer de elementos e consigo prosseçar quaisquer, recebe os argumentos como uma lista /sequencia por isso conseguimos usar o for
    total = 0
    for arg in varArgs:
        total*= arg
        return total
    print(multiplicaNumeros(3,2,1,3,0)) #multiplica o anterior pelo proximo

#DEFININDO EXPRESSOES COM LAMBDA
#lambda pode ser definido como lambda       x,y:          x*y
#.............................EXPRESSÃO..ARGUMENTOS.....INSTRUÇÃO          A INSTRUÇÃO SEMPRE É DEVOLVIDA
f= lambda x,y: x*y
print (f(2,4))

#lAMBDA COM ARGUMENTOS PADROES
f = lambda x,y=3: x*y
print(f(2))

#lambda explicitando argumentos

f=lambda x,y,w: x*y*w
print(f(w=2,y=3,x=1))

#escopo de função
def tres():
    x=3
    x=2
    tres()
    print(x)

#DOCUMENTANDO FUNÇÕES
 def somaTres(x):
     '''SOMA 3 NA VARIAVEL PASSADA COMO ENTRADA'''
     x+=3
     print(somaTres.__doc__) #o pythom documenta esse comentario de ''' e armagena no __doc__
