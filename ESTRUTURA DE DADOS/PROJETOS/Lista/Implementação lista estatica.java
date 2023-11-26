//Estrutura incial
public class ListaEstatica<T> implements Lista<T> {
  privateT[] dados;
  private int tamanho;
  public ListaEstatica(int capacidade) {
    this.dados =(T[]) new Object [capacidade];
  }
}

//Informações
@Override
public int getTamanho(){ //tamanho da lista, a lista pode ter capacidade 10 mas o tamanho pode ser 5
  return tamanho;
}

public int getCapacidade(){ //qnt maxima de elementos que posso incluir na lista
  return dados.length;
}

@Override
public boolean isVazia() {
  return getTamanho() == 0;
}

@Override
public boolean isCheia() { //qnd o tamanho for igual a capacidade
  return getTamanho() == getCapacidade;
}

// Adição
@Override
public void adicionar (int pos, T valor) {
  if (isCheia()) {
    throw new IllegalStatwExcepition("Lista cheita"); //overflow
  }
  Objects.checkIndex(pos, tamanho+1); //testa se os indices saõ validos

  //move os dados para a direita
  for (int i = tamanho-1; i >= pos; i--) {
    dados [i+1]=dados[i];
  }
  dados[pos] =valor; //insere o dado
    tamanho = tamanho +1; // aumenta o tamanho
}

//Adicinar ao final da lista
@Override
public void adicionar (T valor) {
  adicionar (tamanho, valor);
}

//excluir , movimentar da esquerda para a direita  e tirara a referencia do ultimo elemento
@Override
public T remover (int pos) {
  Objects,checkIndex (pos,tamanho); // validação da posição
T dado = dados [pos]; // dado a ser retornado
//move os elementos para a esquerda
for (int i = pos, i < tamanho-1; i++) {
  dados[i] = dados [i+1];
}
dados[tamanho-1] = null; // elimina o ultimo dados
tamanho = tamanho-1; // reduz o tamanho da lista
return dado;
}

//Limpeza: remover todas as referencias e define o tamanho 0
@Override                                 |    | @Override
public void limpar() {                    | OU | public void limpar() {
  for (int i =0; i< getTamanho(); i++) {  |    | Arrays.fill(dados,0, getTamanho(), null);
    dados[i] = null;                      |    |tamanho = 0; }
  }
  tamanho =0;
}

//ACESSO DIRETO: ACESSA O INDICE DO VETOR DIRETAMENT. sIMILAR AOS [] DE UM VETOR.
@Override
public T get(int pos {
  Objects.checkIndex (00, tamanho);
return dados [pos];
}
@Override
public void set (int pos, T valor) {
  Objects.checkIndex(pos,tamanho);
  dados [pos] = valor;
}

// BUSCA DE ELEMENTOS(NÃO É POSSIVEL BUSCAR ELEMENTOS INTERMEDIARIOS_USA-SE ITERAÇÃO PARA ISSO_)

public static boolean equals (Object a, Object b) {
  return (a==b) || (a != null && a.equals(b)); // testa se as identidades são iguais   
}
_____________________
@Override
public int indice (T valor) {
  for (int i =0; i< tamanho; i ++ {
    if (Objects.equals (valor, dados[i])){
      return i;
    }
  }
return -1
}

// ITERAÇÃO: PECORRE A LISTA DO PRIMEIRO AO ULTIMO ELEMENTO
  int atual = -1;
whilw ((atual=1) < getTamanho()){
  atual = atual +1;
  T dado = dados[atual];

  //usa o elemento
  System.out.println(dado)
}
 //ITERAÇÃO: E SE FOSSE UMA FILA ENCADEADA?
No<T> atual = null;

while  (!isVazia() && atual !=topo) {
  atual = (atual == null ? baze : atual.proximo;
  T dado = atual.dado;

  System.out.println(dado);
}

//ITERAÇÃO: A ITERAÇÃO LISTA BASSA A ESTENDER INTERABLE

public interface Lista<T> extebds Iterable<T>{   
}
//ITERATOR: obj capaz de percorrer a lista

private class ListaIterator implements Iterator<T> {
  @Override
  public boolean hasNext() {
    return (atual+1) < getTamanho();
  }
  @Override
  public T next(){
    atual = atual+1;
    return dados[atual];
  }
}

//IMPLEMENTAÇÃO ITERABLE
@Override
public Iterator<T> iterator() {
  return new ListaIterator();
}
    //AGORA PODE SE REESCREVER O WHILE:
var iterator = iterator();
while (iterator.hasNext()) {
  T dado = iterator.next();
  //usa o elemento
  System.out.println(dado);
}
  // OU PODE UTILIZAR O FOR EACH(plê-se para cada...)
for(var valor : lista){
  System.out.println(valor);
}
  // ou pode usar o lambda
lista.forEach(valor -> System.out.println(valor));
  









