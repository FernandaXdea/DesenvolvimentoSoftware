// Pilha encadeada


public class Pilha Encadeada <T> implements Pilha<T> {
	private static class No<T> {
		public No anterior;
		public T dado;
}
	private No<T> topo = null; //null ultima posição da lista
	@Override
	public boolean isCheia() {
		return false;
}
	@Override
	public boolean isVazia() {
retunr topo == null;
}

//ADICIONANDO O VALOR 10 (ADIÇÃO)

@Override
public void  adicionar (T valor) {
	var novo = new No<T>(); // cria o no
	novo.dado = valor; // e associa do dado
	novo.anterior = topo; // associa o anterior ao topo
	topo= novo;  // atualiza o topo
}

//Removendo o valor
@Override
public T remover() {
	if (isVazia()){ //vazia? dispara exceção
		trow new IllegalStateExcepition("Pilha vazia!");
}
	var dado = topo.dado; // dado a ser removido
	topo = topo.anterior; // atualiza o topo
	return dado;
}

//Limpando a pilha

@Override
public void limpar() {
	topo=null;
}