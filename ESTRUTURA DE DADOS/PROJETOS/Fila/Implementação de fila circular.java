public class FilaCircular<T> impements Fila<T> {
  private int base = 0;
  private int topo = -1;

  private T[] dados;

  public FilaCircular(int tamanho) {
    this.dados = (T[]) new Object [tamanho];
  }
  private int mover(int posição) {
    return posição+1 ==dados.length ? 0 : posição+1;
  }
