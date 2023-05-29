import java.util.Stack;

public class PilhaContatos {
    private Stack<Contato> pilha;

    public PilhaContatos() {
        pilha = new Stack<>();
    }

    public void adicionarContato(Contato contato) {
        pilha.push(contato);
    }

    public Contato removerContato() {
        return pilha.pop();
    }

    public boolean pilhaVazia() {
        return pilha.isEmpty();
    }
}
