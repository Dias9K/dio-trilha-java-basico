import java.util.Locale;
import java.util.Scanner;
import java.util.Random;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Olá cliente! Seja bem-vindo a sua conta ");
        System.out.println("Por favor, digite o número da sua agência:  ");
        int numeroAgencia = scanner.nextInt();
        System.out.println("Por favor, digite o número da sua conta:  ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Agora para finalizar, digite o seu nome de usuário");
        String nomeCliente = scanner.nextLine();
        float saldo = random.nextFloat(100);
        System.out.println("Olá " + nomeCliente + " " + "obrigado por criar uma conta em nosso banco, sua agência é "
                + numeroAgencia + " " + "conta" + " " + numeroConta + " " + "e seu saldo " + saldo + " "
                + "já está disponível para saque.");
        scanner.close();

    }
}