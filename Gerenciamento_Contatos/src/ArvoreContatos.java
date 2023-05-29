import java.util.Comparator;
import java.util.TreeSet;

public class ArvoreContatos {
    private TreeSet<Contato> arvore;

    public ArvoreContatos() {
        arvore = new TreeSet<>(Comparator.comparing(Contato::getNome));
    }

    public void adicionarContato(Contato contato) {
        arvore.add(contato);
    }

    public Contato buscarContato(String nome) {
        for (Contato contato : arvore) {
            if (contato.getNome().equals(nome)) {
                return contato;
            }
        }
        return null;
    }

    public void imprimirContatos() {
        for (Contato contato : arvore) {
            System.out.println(contato.getNome() + ": " + contato.getTelefone());
        }
    }
}
