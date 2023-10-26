import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TryCatch {
    // o objetivo desse código é digitar as informações de forma errônea a fim de
    // gerar uma exceção
    // não é necessariamente um erro, mas sim uma ação inesperada que o usuário pode
    // cometer durante a execução do programa ex: digitar um número no lugar de uma
    // string ou vice versa
    // try - permite definir um trecho do código que esteja retornando uma execeção
    // para ser TESTADO
    // catch - permite definir um conjunto bloco de códigos que serão executados no
    // caso de uma execeção a ser definida
    // finally - permite a definição de um bloco a ser executado, com ou sem "erros"

    public static void main(String[] args) {
        // criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // o bloco TRY vai testar o código dentro do bloco em busca de uma exceção
        try {
            System.out.println("Digite seu nome");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura");
            double altura = scanner.nextDouble();

            // imprimindo os dados obtidos pelo usuario
            System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura é " + altura + "cm ");
            scanner.close();
        } // o bloco CATCH vai executar a ação perante um erro
        catch (InputMismatchException e) {
            // System.out
            System.out.println("Os campos idade e altura DEVEM ser numéricos");
        }
    }
}
