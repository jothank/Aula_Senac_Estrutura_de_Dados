public class Main {
    public static void main(String[] args) {

// scanner ontatos

        Contato contato1 = criarContato("Contato 1");
        Contato contato2 = criarContato("Contato 2");
        Contato contato3 = criarContato("Contato 3");

// fila de contatos

        FilaContatos filaContatos = new FilaContatos();

        filaContatos.adicionarContato(contato1);
        filaContatos.adicionarContato(contato2);
        filaContatos.adicionarContato(contato3);

        System.out.println("============================================");
        System.out.println("Fila Contatos");
        System.out.println("============================================");

        while (!filaContatos.filaVazia()) {
            Contato contato = filaContatos.removerContato();
            System.out.println("Contato removido da fila: " + contato.getNome());
        }

// pilha de contatos

        PilhaContatos pilhaContatos = new PilhaContatos();

        pilhaContatos.adicionarContato(contato1);
        pilhaContatos.adicionarContato(contato2);
        pilhaContatos.adicionarContato(contato3);

        System.out.println("============================================");
        System.out.println("Pilha Contatos");
        System.out.println("============================================");

        while (!pilhaContatos.pilhaVazia()) {
            Contato contato = pilhaContatos.removerContato();
            System.out.println("Contato removido da pilha: " + contato.getNome());
        }

// grafo de amigos

        GrafoAmigos grafoAmigos = new GrafoAmigos();

        grafoAmigos.adicionarAmizade(contato1, contato2);
        grafoAmigos.adicionarAmizade(contato2, contato3);
        grafoAmigos.adicionarAmizade(contato3, contato1);

        System.out.println("============================================");
        System.out.println("Grafo Amigos");
        System.out.println("============================================");

        System.out.println("Contato1 e Contato2 são amigos? " + grafoAmigos.saoAmigos(contato1, contato2));
        System.out.println("Contato2 e Contato3 são amigos? " + grafoAmigos.saoAmigos(contato2, contato3));
        System.out.println("Contato1 tem conexões diretas: " + grafoAmigos.conexoesDiretas(contato1));

// árvore de contatos

        System.out.println("============================================");
        System.out.println("Arvore Contatos");
        System.out.println("============================================");

        ArvoreContatos arvoreContatos = new ArvoreContatos();

        arvoreContatos.adicionarContato(contato1);
        arvoreContatos.adicionarContato(contato2);
        arvoreContatos.adicionarContato(contato3);
        arvoreContatos.imprimirContatos();

        Contato contatoEncontrado = arvoreContatos.buscarContato(contato2.getNome());

        if (contatoEncontrado != null) {
            System.out.println("Contato encontrado: " + contatoEncontrado.getNome() + " " + contatoEncontrado.getTelefone());
        } else {
            System.out.println("Contato não encontrado.");
        }

// tabela hash de contatos

        HashContatos hashContatos = new HashContatos();

        hashContatos.adicionarContato(contato1);
        hashContatos.adicionarContato(contato2);
        hashContatos.adicionarContato(contato3);

        System.out.println("============================================");
        System.out.println("Hash Contatos");
        System.out.println("============================================");

        contatoEncontrado = hashContatos.buscarContato(contato3.getNome());

        if (contatoEncontrado != null) {
            System.out.println("Contato encontrado: " + contatoEncontrado.getNome() + " " + contatoEncontrado.getTelefone());
        } else {
            System.out.println("Contato não encontrado.");
        }

        hashContatos.removerContato(contato2.getNome());

        contatoEncontrado = hashContatos.buscarContato(contato2.getNome());

        if (contatoEncontrado != null) {
            System.out.println("Contato encontrado: " + contatoEncontrado.getNome() +
                    contatoEncontrado.getTelefone());
        } else {
            System.out.println("Contato não encontrado.");
        }
    }

    private static Contato criarContato(String nomeContato) {
        String nome = InputUtils.lerString("Nome do " + nomeContato + ": ");
        String telefone = InputUtils.lerString("Telefone do " + nomeContato + ": ");
        InputUtils.limparBuffer(); // Limpa o buffer após a leitura do telefone
        return new Contato(nome, telefone);
    }
}


