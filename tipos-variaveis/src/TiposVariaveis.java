public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
   double salarioMinimo = 1300.32;

   short numeroCurto = 10;
   int numeroNormal = numeroCurto;
           //não é permitido converter um tipo primitivo maior para um menor, porém, é possível converter um menor para o maior, pois este o comporta
            //ex: short -> int
            //para converter um maior para menor é preciso usar o cast <(short) int;>, seria como se o valor maior fosse visto como menor
            //e portanto, compatível.
   short numeroCurto2 = (short) numeroNormal;
   // para declarar uma constante, é preciso colocar a palavra "final" antes do seu tipo e que toda a variável seja escrita em CAIXA ALTA.
   final double VALOR_PI = 3.14;

   String meuNome = "GABRIEL DIAS";
   System.out.println(meuNome);
}
}
