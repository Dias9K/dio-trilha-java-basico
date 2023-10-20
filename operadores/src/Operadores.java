import java.util.Scanner;

public class Operadores {
    public static void main(String[] args) {
        // operador lógico E (&&) só executa se as duas condições impostas são verdadeiras
        // operador lógico OU (||) só executa se apenas UMA das condições é verdadeira
        // e isso vale tanto para tipos booleanos quanto para tipos inteiros ou reais

        String nome = "Gabriel";
        int idade = 23;
        double peso = 58.5;
        char sexo = 'M';
        boolean doadorOrgao = true;
        // classes que representam "tipos" precisam anteceder com palavra-chave "new" e
        // o nome da classe correspondente informando parâmetros
        // em outras palavras, é criado um objeto como se fosse uma variável
        // Date dataNascimento = new Date();

        double soma = 10.5 + 15.7;
        int subtração = 113 - 25;
        int multiplicação = 20;
        int divisão = 15 / 3;
        // resto da divisão
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20 / 4);

        // o operador de adição (+), se utilizado em variáveis de texto
        // realizará a "concatenação de textos"
        String nomeCompleto = "LINGUGAGEM" + "JAVA";
        System.out.println(nomeCompleto);

        // qual o resultado das expressões abaixo?
        String concatenacao = "?";
        System.out.println(concatenacao);

        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + 1;
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + "1";
        System.out.println(concatenacao);

        concatenacao = "1" + 1 + 1 + 1;
        System.out.println(concatenacao);

        concatenacao = "1" + (1 + 1 + 1);
        System.out.println(concatenacao);
        // sempre que detectado uma string para atribuição, a mesma é parada e a
        // seguinte tarefa é a concatenação
        // em outras palavras, para de somar o que quer que seja, e passa a trabalhar
        // apenas com as stings,
        // mesmo que hajam números inteiros depois.

    }
}
