import java.util.LinkedList;
import java.util.Queue;

public class FilaContatos {
    private Queue<Contato> fila;

    public FilaContatos() {
        fila = new LinkedList<>();
    }

    public void adicionarContato(Contato contato) {
        fila.add(contato);
    }

    public Contato removerContato() {
        return fila.poll();
    }

    public boolean filaVazia() {
        return fila.isEmpty();
    }
}
