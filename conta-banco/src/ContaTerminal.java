import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        // Criar o objeto scanner para obter entrada do usuário
        Scanner scanner = new Scanner(System.in);   

        // Declaração das variáveis
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        // Entrada de dados
        System.out.println("Por favor, digite o número da conta:");
        numero = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Por favor, digite o número da agência:");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente:");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da conta:");
        saldo = scanner.nextDouble();

        // Exibir mensagem final
       System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        // Fechar o scanner
        scanner.close();

        
    }
}
