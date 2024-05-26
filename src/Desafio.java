import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Tony Stark";
        String tipoConta = "Corrente";
        double saldo = 1599.99;
        int opcao = 0;

        System.out.println("***********************");
        System.out.println("\nNome do Cliente:" + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n*********************");

        Scanner leitura = new Scanner(System.in);
        String menu = """
                ** Digite sua opcao **
                1 - Consultar Saldo
                2 - Transferir Valor
                3 - Receber Valor
                4 - Sair
                """;

        while (opcao!= 4){
            System.out.println(menu);
            opcao = leitura.nextInt();
        }
    }
}

