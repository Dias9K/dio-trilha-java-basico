public class Operadores3 {
    public static void main(String[] args) {
        int a, b;
        a=6;
        b=6;

        // a fórmula do operador ternário é:
        // <expressão condicional(booleana true ou false)> ? <atribuição caso true> : <atribuição caso false>         
        String resultado = a==b ? "verdadeiro":"falso";
        System.out.println(resultado);

        String nome1 = "DIAS";
        String nome2 = new String ("DIAS");
        // ao comparar objetos (new String) é utilizado o método .equals()
        System.out.println(nome1.equals(nome2));
        
        int numero1 = 1;
        int numero2 = 2;
        boolean simNao = numero1 == numero2;
        System.out.println("O número 1 é igual ao número 2? " + simNao);
        
        simNao = numero1 != numero2;
        System.out.println("O número 1 é igual ao número 2? " + simNao);
    }
}