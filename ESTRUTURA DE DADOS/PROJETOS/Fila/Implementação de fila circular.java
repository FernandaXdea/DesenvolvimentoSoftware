public class FilaCircular<T> impements Fila<T> {
  private int base = 0;
  private int topo = -1;

  private T[] dados;

  public FilaCircular(int tamanho) {
    this.dados = (T[]) new Object [tamanho];
  }
  private int mover(int posição) {
    return posição+1 ==d ados.length ? 0 : posição+1;
  }

@Override
public boolean is Vazia() {
  return topo== -1;
}

@Override
public boolean isCheia() {
  return !isVazia && mover (topo) == base; // na proxima movimentação, o topo está sobre a basse.
}

//FILA CIRCULAR- ADIÇÃO -> ADICIONA-SE PELO TOPO
@Override
public void adicionar(T valor) {
  if (isCheia()) { //esta cheia?Dispara exceção
    trow new IllegalStationException ("fila cheia");
  }
  topo = mover(topo);
  dados [topo] = valor;
}

// FILA CIRCULAR -REMOÇÃO -> REMOVE-SE DA BASE
@Override
public T remover () {
  if (isVazia()) {  //esta vazia?Dispara exceção
    trow new IllegalStationException ("fila vazia");
  }
  T dado = dados[base];
  if (base == topo) {//ultimo elemento?
    limpar();
  }else {
    dados[base] = null;
    base = mover(base);
  }
  return dado;
  }

// FILA CIRCULAR -LIMPEZA
@Override 
public void limpar() {
  base = 0;
  topo = -1;
  for (int i=0; i <dados.length; i++){
    dados[i] = null;
  }
}













