import java.util.HashMap;
import java.util.Map;

public class HashContatos {
    private Map<String, Contato> tabelaHash;

    public HashContatos() {
        tabelaHash = new HashMap<>();
    }

    public void adicionarContato(Contato contato) {
        tabelaHash.put(contato.getNome(), contato);
    }

    public Contato buscarContato(String nome) {
        return tabelaHash.get(nome);
    }

    public void removerContato(String nome) {
        tabelaHash.remove(nome);
    }
}
