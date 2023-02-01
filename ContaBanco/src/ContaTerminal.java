import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, digite o seu nome completo: ");
        String nomeCliente = scan.nextLine();

        System.out.println("Por favor, agora digite o número da Agência: ");
        String agencia = scan.next();

        System.out.println("Agora digite o número da Conta: ");
        while (!scan.hasNextInt()) {
            System.out.println("Valor Inválido! Digite o número da Conta: ");
            scan.next();
        }
        int numero = scan.nextInt();

        System.out.print("Por favor, informe o valor a ser depositado: ");
        double saldo = Double.parseDouble(scan.next());

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$" + saldo + " já está disponível para saque.");
    }

}