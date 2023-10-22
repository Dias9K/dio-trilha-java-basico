public class ResultadoEscolar {
    public static void main(String[] args) {
        // condicional composta (if e else - duas condições
        int nota = 6;

        if (nota >= 7)
            System.out.println("Aprovado");

        // condicional encadeada, sempre retornam true ou false
        // se a condição anterior for falsa,
        // estabelece uma nova a ser seguida
        else if (nota >= 5 && nota < 7)
            System.out.println("Prova de recuperação");

        else
            System.out.println("Reprovado");

        // operador ternário
        // diferente de C o resultado dos fluxos podem ser em strings
        String resultado = nota >= 7 ? "Aprovadoternario" : nota >= 5 && nota < 7 ? "Recuperaçãoternario" : "Reprovadoternario";
        System.out.println(resultado);
    }
}