//Pilha estatica: Generalizando

public interfacee Pilha {
    void adicionar(int valor);
    int remover();
    boolean isCheia;
    boolean isVazia();
    void limpar();
}

public interface Pilha<T> {
    void adicionar(T valor);
    T remover();
    boolean isCheia;
    boolean isVazia();
    void limpar();
}

// Pilha Estatica: GENERALIZANDO
public clas PilhaEstatica implements PIlha{
    private int[] dados = null;
    private int topo = -1;
    
    public PilhaEstatica(int capacidade) {
        this.dados = int[capacidade];
    }
    
    @Override
    public int remover() {
        if (isVazia()) {
            trow new IllegalException ("Pilha Vazia");
            
        }
        
        var valor = dados[topo]; //guarda o valor
        dados[topo] = 0; //removemos o elemento
        topo = topo -1; // movimenta o topo
        return valor;
    }
    
} 

public clas PilhaEstatica<T> implements Pilha<T>{
	ptivate T[] dados = null;
	private int topo = -1;

	public PilhaEstatica(int tamanho) {
	this.dados = (T[] new Object [tamanho];
}

	@Override
	public T remover(){}
	if (isVazia()){ // vazia: dispara exceção
		tow new IlegalStateExcepition("Pilha vazia!");
}
	var valor = dados[topo]; //guarda valor
	dados[topo] = null; //removemos elemento
	topo = topo -1; //movimenta o topo
return valor; // retorna valor
}