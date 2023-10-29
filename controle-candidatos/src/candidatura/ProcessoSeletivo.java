package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String[] candidatos = { "Felipe", "Márcia", "Julia", "Paulo", "Augusto" };
        for (String candidatoLigado : candidatos) //primeiro seleciona o candidato a qual se refere 
        {
        entrandoEmContato(candidatoLigado); //puxa o método que determinará se o contato foi estabelecido
        }
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas =1; // contador para o número de tentativas
        boolean continuarTentando = true;
        boolean atendeu=false;
        do {
            atendeu= atender(); //puxa o método que gera TRUE depois de 3 tentativas
            continuarTentando = !atendeu;
            // se o candidato atender, a variável "atendeu" se torna verdadeira e o loop para
            // se não, a varíavel continua falsa e o loop continua
            if (continuarTentando) {
                tentativasRealizadas++;
            }
            else
            System.out.println("Contato realizado com o candidato!");

        } while (continuarTentando && tentativasRealizadas<=3);

        if (atendeu) {
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativa");
        } else {
          System.out.println("Não conseguimos contato com " + candidato + ", número máximo de tentativas atingido!");  
        }
    }

    static boolean atender(){
       //de 3 tentativas de contato, uma delas terá que retornar o valor 1 (verdadeiro) e não 0 (falso)
    return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados() {
        String[] candidatos = { "Felipe", "Márcia", "Julia", "Paulo", "Augusto" };
        System.out.println("Imprimindo a lista dos candidatos com o seu respectivo índice...");
        for (int indice = 0; indice < candidatos.length; indice++) // utiliza o laço for para trabalhar com o array
        {
            System.out.println(
                    "O candidato de número " + indice + " é " + candidatos[indice] + " e ele(a) foi selecionado(a)");
            // utiliza o contador do for para mostrar o número do candidato e também para
            // atribuir o seu endereço no systemOut
        }

        System.out.println("Os candidatos selecionados foram: ");
        // o laço FOR EACH cria uma variável temporária que será utilizada para mostrar
        // o conteúdo do array
        // ou seja, para cada "candidato" pegue uma informação da lista de "candidatos"
        for (String candidato : candidatos) {
            System.out.println(candidato);
        }
    }

    static void selecaoCandidatos() {
        String[] candidatos = { "Felipe", "Márcia", "Julia", "Paulo", "Augusto", "Mônica", "Fabrício", "Mirela",
                "Daniela", "Jorge" };
        // objetivo: selecionar 5 candidatos
        int candidatosSelecionados = 0; // máximo de 5 candidatos
        int candidatoAtual = 0; // contador do array
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) // length quantifica o conteúdo no
                                                                                 // índice do array
        {
            String candidato = candidatos[candidatoAtual]; // percorre o array de candidatos e pega o dado no índice
            double salarioPretendido = valorPretendido(); // puxa o método e atribui um valor aleatório
            System.out
                    .println("O candidato(a) " + candidato + " solicitou este valor de salário: " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato(a) " + candidato + " foi selecionado(a) para a vaga");
                candidatosSelecionados++; // incrementa +1 candidato até 5
            }
            candidatoAtual++; // incremento necessário para puxar o índice do próximo candidato
        }

    }

    // método que gera o valor de salário pretendido aleatoriamente
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0); // vai gerar um valor aleatório entre 1800 e 2200
    }

    // criação do método que será responsável por fazer o processo seletivo de
    // acordo com o valor dos salários base e pretendidos
    // a variável é declarada vazia dentro dos (parâmetros)
    // só recebe os valores de comparação na invocação do método
    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para candidato(a)");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato(a) com contra proposta");
        } else {
            System.out.println("Aguardando os demais candidatos(as)");
        }
    }
}