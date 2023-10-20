public class SmartTv {
    boolean ligada = false;
    int canal = 12;
    int volume = 25;

    // criação de métodos para manipular o valor dos atributos da classe
    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        volume++;
        System.out.println(volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.println(volume);

    }

    public void aumentarCanal(){
        canal++;
        System.out.println(canal);
    }

    public void diminuirCanal(){
        canal--;
        System.out.println(canal);
    }

    //método para o usuário escolher para qual canal mudar
    // tendo uma nova variável dento do parâmetro, na classe do usuário
    // é possível colocar um valor dentro do parâmetro do método chamado
    public void atribuirCanal(int novoCanal){
canal = novoCanal;
        System.out.println(canal);

    }

}
