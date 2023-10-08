import java.util.ArrayDeque;
import java.util.Deque;

public class PilhaExemplo {
    public static void main(String[] args) {
        Deque<Integer> pilha = new ArrayDeque<>();

        // Inserir elementos na pilha
        pilha.push(1);
        pilha.push(2);
        pilha.push(3);

        // Retirar elementos da pilha
        while (!pilha.isEmpty()) {
            System.out.println(pilha.pop());
        }
    }
}
