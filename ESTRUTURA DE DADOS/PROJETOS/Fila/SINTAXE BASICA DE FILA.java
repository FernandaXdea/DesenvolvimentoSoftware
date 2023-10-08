import java.util.LinkedList;
import java.util.Queue;

public class FilaExemplo {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        // Adicionar elementos à fila
        fila.offer("Item 1");
        fila.offer("Item 2");
        fila.offer("Item 3");

        // Remover e processar elementos da fila
        while (!fila.isEmpty()) {
            String item = fila.poll();
            System.out.println("Processando: " + item);
        }
    }
}
