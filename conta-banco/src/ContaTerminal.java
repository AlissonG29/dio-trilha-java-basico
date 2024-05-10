import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Cria um Scanner para ler os dados do terminal
        Scanner scanner = new Scanner(System.in);

        // Solicita e lê os dados da conta bancária
        System.out.print("Por favor, digite o número da conta: ");
        int numero = scanner.nextInt();

        scanner.nextLine(); // Limpa o buffer

        System.out.print("Por favor, digite o número da agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Por favor, digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o saldo da conta: ");
        double saldo = scanner.nextDouble();

        // Fecha o scanner após a leitura dos dados
        scanner.close();

        // Exibe a mensagem com os dados fornecidos pelo usuário
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco,");
        System.out.println("sua agência é " + agencia + ", conta " + numero + " e seu saldo R$ " + saldo + " já está disponível para saque.");
    }
}