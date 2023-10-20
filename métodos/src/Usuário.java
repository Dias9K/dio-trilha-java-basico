public class Usuário {
    public static void main(String[] args) {
        // primeiro vem a "SmartTv", que é a classe de outro arquivo do projeto,
        // semelhante a declaração de um tipo primitivo e o nome que vem depois será
        // usado para as atribuições
        // cria um novo objeto no new "SmartTv"
        SmartTv smartTv = new SmartTv();
        // detalhe que as variáveis da classe do objeto em questão são usadas aqui como
        // "métodos"
        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        // os métodos precisam estar programados no objeto que se deseja manipular
        // chama o método "ligar" da classe SmartTv
        smartTv.ligar();
        System.out.println("NOVO STATUS -> TV ligada? " + smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();

        smartTv.diminuirCanal();
        smartTv.diminuirCanal();

        smartTv.atribuirCanal(24);
        System.out.println("Volume atual: " + smartTv.volume);

    }
}
