nome = "Fernanda"
sobrenome= "Xdea"
print ("Nome",nome+" "+sobrenome, sep=': ')

#FORMATAR VARIAVEL
idade = 8.234
print("Idade: id" % idade)

arquivo = open("ARQUIVO.TXT", "a") # qunado é "W" eu estou escredendo, quando é "A" estou adicionando informação no arquivo
print("Arquivo Salvo dois", file=arquivo)
arquivo.close() #é uma função que fecha o objeto