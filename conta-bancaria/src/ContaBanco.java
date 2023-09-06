import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numeroConta;
        String numeroAgencia, nomeCliente;
        double saldo = 100.00;

        System.out.print("Informe o número da sua conta (somente números): ");
        numeroConta = scan.nextInt();
        scan.nextLine();

        System.out.print("Informe o número da sua agencia: ");
        numeroAgencia = scan.nextLine();

        System.out.print("Informe seu nome: ");
        nomeCliente = scan.nextLine();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + numeroAgencia + ", conta " + numeroConta +" e seu saldo R$" + saldo +" já está disponível para saque.");


    }
}