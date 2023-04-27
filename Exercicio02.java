package aula_estrutura_dados_01;

public class Exercicio02 {

    public static void main(String[] args) {

        // Declarar e inicializar variáveis
        double precoUnitario = 2.5;
        int quantidade = 10;
        double desconto = 0.1;
        double imposto = 0.05;

        // Calcular subtotal, desconto, imposto e total
        double subtotal = precoUnitario * quantidade;
        double valorDesconto = subtotal * desconto;
        double valorImposto = subtotal * imposto;
        double total = subtotal - valorDesconto + valorImposto;

        // Imprimir informações na tela
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Preço unitário: R$" + precoUnitario);
        System.out.println("Subtotal: R$" + subtotal);
        System.out.println("Desconto: R$" + valorDesconto);
        System.out.println("Imposto: R$" + valorImposto);
        System.out.println("Total: R$" + total);
    }
}
