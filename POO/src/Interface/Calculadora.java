package Interface;

public class Calculadora implements OperaçãoMatemática {

    @Override
    public void soma(double a, double b) {
        System.out.println("Soma = " + (a + b));

    }

    @Override
    public void subtracao(double a, double b) {
        // É OBRIGATÓRIO colocar a operação matemática dentro de parênteses, para que
        // seja avaliado primeiro o seu resultado e depois seja feita a sua
        // concatenação.
        // "Subtração = " + a é avaliado primeiro. Isso resulta em uma
        // string, Em seguida, -b é avaliado. Como a operação anterior resultou em uma
        // string, o Java tenta concatenar essa string com -b, o que não é válido.
        System.out.println("Subtração = " + (a - b));

    }

    @Override
    public void multiplicacao(double a, double b) {
        System.out.println("Multiplicação = " + a * b);

    }

    @Override
    public void divisao(double a, double b) {
        System.out.println("Divisão = " + a / b);

    }

    public static void main(String[] args) {
         Calculadora calcula = new Calculadora();
         calcula.soma(3,2);
         calcula.subtracao(3,2);
         calcula.multiplicacao(3,2);
         calcula.divisao(3,2);
        }
}