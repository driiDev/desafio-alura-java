import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        System.out.println("Qual seu nome? ");
        String nome = tc.nextLine();
        System.out.println("Sua conta é: Corrente ou Poupança?");
        String tipoConta = tc.nextLine();
        double saldo = 0;
        int opcao = 0;

        System.out.println("*****************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n*****************");

        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Depositar valor
                3 - Tranferir valor
                4 - Sair
                """;

        while (opcao != 4){
            System.out.println(menu);
            opcao = tc.nextInt();

        switch (opcao){
            case 1:
                System.out.println("O seu saldo é: R$ " + saldo);
                break;
            case 2:
                System.out.println("Qual valor deseja depositar? ");
                double valorDepositar = tc.nextDouble();
                saldo += valorDepositar;
                System.out.println("Valor depositado com sucesso!");
                System.out.println("Saldo atualizado: R$ " + saldo);
                break;
            case 3:
                System.out.println("Qual valor deseja tranferir? ");
                double valorTranferido = tc.nextDouble();
                if (valorTranferido > saldo) {
                    System.out.println("Você não pode realizar essa transação. Saldo insuficiente!");
                    break;
                } else{
                    saldo -= valorTranferido;
                    System.out.println("Valor tranferido com sucesso!");
                    System.out.println("Saldo atualizado: R$ " + saldo);
                }
                break;
            case 4:
                break;
            default:
                System.out.println("Opção inválida!");
            }
        }
    }
}