package exerciciofixacao_2.application;

import java.util.Locale;
import java.util.Scanner;

import exerciciofixacao_2.application.entities.Estoque;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Estoque estoque;

        System.out.println("Digite o nome do produto: ");
        String nome = sc.nextLine();

        System.out.println("Digite o preço do produto: ");
        double preco = sc.nextDouble();

        System.out.println("Quantidade inicial: ");
        int quantidade = sc.nextInt();

        estoque = new Estoque(nome, preco, quantidade);

        System.out.println(estoque.toString());

        System.out.println("Quantidade a adicionar: ");
        int quantidadeAdc = sc.nextInt();
        estoque.adcEstoque(quantidadeAdc);
        

        System.out.println("Dados atualizados: " + estoque.toString());

        System.out.println("Quantidade a remover: ");
        int quantidadeRmv = sc.nextInt();
        estoque.rmvEstoque(quantidadeRmv);

        System.out.println("Dados atualizados: " + estoque.toString());

        sc.close();
    }
}
