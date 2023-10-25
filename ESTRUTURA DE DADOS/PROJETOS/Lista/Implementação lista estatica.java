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
