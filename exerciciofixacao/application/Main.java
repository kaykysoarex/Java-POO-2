package exerciciofixacao.application;

import java.util.Locale;
import java.util.Scanner;

import exerciciofixacao.entities.Conta;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Conta conta;

        System.out.print("Digite o numero da conta: ");
        int numeroConta = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite o nome do usuário: ");
        String nome = sc.nextLine();

        System.out.print("Deseja iniciar a conta com um deposito? (s/n): ");
        char response = sc.next().charAt(0);

        if (response == 's') {
            System.out.print("Informe o valor de deposito: ");
            double depositoInicial = sc.nextDouble();
            conta = new Conta(numeroConta, nome, depositoInicial);
        } else {
            conta = new Conta(numeroConta, nome);
        }

        System.out.println(conta);

        System.out.println("Digite um valor de deposito: ");
        double valorDeposito = sc.nextDouble();
        conta.deposito(valorDeposito);

        System.out.println("Atualização dos dados da conta: ");
        System.out.println(conta);

        System.out.println("Digite um valor de saque: ");
        double valorSaque = sc.nextDouble();
        conta.saque(valorSaque);

        System.out.println("Atualização dos dados da conta: ");
        System.out.println(conta);

        sc.close();
    }
}