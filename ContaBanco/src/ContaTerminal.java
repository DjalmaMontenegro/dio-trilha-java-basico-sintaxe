import java.util.Scanner;

public class ContaTerminal {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String agencia,nomeCliente,mensagem;
        double saldo;
        int numero;
           
        System.out.println("Por favor, digite a Agência: ");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta: ");
        numero = scanner.nextInt();
        scanner.nextLine(); // inserir linha linha
        
        System.out.println("Por favor, digite o Nome do Cliente: ");
        nomeCliente = scanner.nextLine();
        
        System.out.println("Por favor, digite o Saldo: ");
        saldo = scanner.nextDouble();
        
        scanner.close();
        
        mensagem = "Olá " + nomeCliente.concat(", obrigado por criar uma conta em nosso banco, o número da sua agência é ")
                          .concat(agencia).concat(" , e o da sua conta é ")
                          .concat(String.valueOf(numero)).concat(" e seu saldo ")
                          .concat(String.valueOf(saldo)).concat(" já está disponível para saque.");
        
        System.out.println(mensagem);
    }
}