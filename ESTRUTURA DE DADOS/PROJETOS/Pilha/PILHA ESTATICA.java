

//PILHA ESTATICA//

public class PilhaEstatica implements Pilha{
    private int[] dados; // SÓ ARMAZENA NUMEROS INTEIROS//
    private int topo = -1; //TOPO -1 QUER DIZER QUA A PILHA ESTÁ VAZIA//
    
    public PilhaEstatica (int capacidade){ //capacidade->QUANTOS ELEMENTOS NO MAXIMO ELA VAI SUPORTAR//
        dados = new int [capacidade];
    }
    
    @Override
    public boolean isVazia(){
        return topo == -1;
        //o termo is seria o mesmo que set/get retorna o valor boleano
    }
    
    @Override
    public boolean isCheia(){
        return topo == dados.length-1; //tamanho do dado é topo+1//
    }
}

// PILHA ESTATICA - ADIÇÃO//

@Override
public void adicionar(int dado) { // vois e metodo sem retorno
    if(isCheia()) {//estacheia?Dispara exeção se tiver cheia aparece o erro overflow
        throw new IllegalStateException ("Pilha Cheia");
    }
    
    topo = topo +1; //Movimenta o topo
    dados[topo] = dado; //adiciona elemento no vetor
}

// PILHA ESTATICA - REMOVER//
@Override
public int remover() {
    if (isVazia()){ // Vazia? dispara a exceção
        trhow new IllegalStateException ("Pilha Vazia"); // Use a instrução throw para gerar uma exceção. Use a instrução try para capturar e tratar exceções que podem ocorrer durante a execução de um bloco de código.
    }
    
    var valor = dados[topo]; // guarda o valor dados= valor que consta no vetor e topo a posião do topo ex:[10],[15],[-10],[50],[100], ficaria 100[5-1] => 100[4] <=
    dados[topo] = 0; //remove o elemento
    topo = topo -1; // movimenta o topo
    return valor; //retorna o valor
}

//Underflow é quanto eu tento remover um dado de uma pilha vazia

// PILHA ESTATICA - LIMPANDO//
// BASTA DEFINIR A VAIAVEL TOPO COMO -1. O OVERHEAD DA PILHA QUANDO CHEIA É 4BYTES

@Override
public void limpar() {
    for (int i =0; i<= topo; i++; {
        dados[i] = 0;
    }
    topo = -1;
}