import java.util.ArrayList;
//permite a criação de lista de arrays, melhor controle que o array tradicional "String[] variavel = {}"
import java.util.Collections;
//permite muitas coisas, mas basicamente serve para controlar os dados dos arrays
import java.util.Scanner;

public class BancoOrganizadorAtivos {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // cria um array sem nenhum valor atribuído
    ArrayList<String> ativos = new ArrayList<>();
    // PRESTAR ATENÇÃO NESSA SINTAXE

    // Entrada dos tipos de ativos
    int quantidadeAtivos = scanner.nextInt();// quantas entradas o usuário irá digitar

    // Entrada dos códigos dos ativos
    for (int i = 0; i <= quantidadeAtivos; i++) {
      String codigoAtivo = scanner.nextLine(); // cria uma variável que receberá a entrada do Scanner
      ativos.add(codigoAtivo);// utiliza aquela mesma variável para ir atribuindo os valores EM LOOP no array
    }
    scanner.close(); // fecha o scanner para evitar vazamento (?)

    // ordena os ativos em ordem alfabética com a biblioteca Collections.
    Collections.sort(ativos);

    // imprime a lista de ativos ordenada usando o FOR EACH
    // primeiro cria uma variável temporária que vai receber os valores e depois
    // coloca o nome do array para ir mostrando os valores
    for (String nome : ativos) {
      System.out.println(nome);
    }
  }
}