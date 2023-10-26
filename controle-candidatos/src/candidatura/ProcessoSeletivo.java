package candidatura;

public class ProcessoSeletivo {
    public static void main(String[] args) {
    // invocação do método analisando o salario pretendido dos candidatos
    //conforme o parâmetro do método
    analisarCandidato(1900.0);
    analisarCandidato(2200.0);
    analisarCandidato(2000.0);
    }

    //criação do método que será responsável por fazer o processo seletivo
    static void analisarCandidato(double salarioPretendido){
        double salarioBase=2000.0;
        if (salarioBase > salarioPretendido){
        System.out.println("Ligar para o candidato");}
        else if(salarioBase==salarioPretendido){
            System.out.println("Ligar para o candidato com contra proposta");
        }
        else{
            System.out.println("Aguardando os demais candidatos");
        }
    }
}