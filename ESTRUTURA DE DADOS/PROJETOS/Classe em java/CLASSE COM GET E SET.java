public class Pessoa {
    private String nome;
    private int idade;

    public void setNome(String novoNome) {
        // Pode adicionar validações aqui, se necessário
        this.nome = novoNome;
    }

    public String getNome() {
        // Pode aplicar formatação ou lógica adicional aqui, se necessário
        return this.nome;
    }

    public void setIdade(int novaIdade) {
        // Pode adicionar validações aqui, se necessário
        this.idade = novaIdade;
    }

    public int getIdade() {
        // Pode aplicar lógica adicional aqui, se necessário
        return this.idade;
    }
}
