import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GrafoAmigos {
    private Map<Contato, List<Contato>> grafo;

    public GrafoAmigos() {
        grafo = new HashMap<>();
    }

    public void adicionarAmizade(Contato contato1, Contato contato2) {
        grafo.computeIfAbsent(contato1, k -> new ArrayList<>()).add(contato2);
        grafo.computeIfAbsent(contato2, k -> new ArrayList<>()).add(contato1);
    }

    public boolean saoAmigos(Contato contato1, Contato contato2) {
        List<Contato> conexoes = grafo.get(contato1);
        return conexoes != null && conexoes.contains(contato2);
    }

    public List<String> conexoesDiretas(Contato contato) {
        List<Contato> conexoes = grafo.getOrDefault(contato, new ArrayList<>());
        List<String> nomesConexoes = new ArrayList<>();

        for (Contato conexao : conexoes) {
            nomesConexoes.add(conexao.getNome());
        }

        return nomesConexoes;
    }

}
