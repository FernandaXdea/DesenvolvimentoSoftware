public interface Lista<T> {
  //INFORMAÇÕES
  boolean isVazia();
  boolean isCheia();
  int getTamanho();

  //incluisão de itens
  void adicionar (T valor);
  void adicionar (int pos, T valor);

  //exclusão de itens
  void limpar();
  T remover (int pos);

  //acesso direto a valores da lista
  T get (int pos);
  void set(int pos, T valor);

  //metodo para buscar itens
  int indice(T valor);
  int ultimoIndice(T valor);
}
