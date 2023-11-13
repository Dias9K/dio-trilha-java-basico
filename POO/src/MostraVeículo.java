public class MostraVeículo {
    public static void main(String[] args) {
        // repare que no construtor da classe Carro, o mesmo se encontra sem parâmetros
        // e sem métodos setters, pois estes serão definidos abaixo
        Carro meuCarro = new Carro();
        meuCarro.setCor("Azul com preto");
        meuCarro.setModelo("Honda (kkk)");
        meuCarro.setCapacidadeTanque(55);
        System.out.println("A cor desse carro é: " + meuCarro.getCor());
        System.out.println("O modelo desse carro é: " + meuCarro.getModelo());
        System.out.println("A capacidade máxima do tanque é: " + meuCarro.getCapacidadeTanque() + " litros");
        System.out.println("O valor para encher o tanque dessa máquina é: R$ " + meuCarro.calcularValorGasosa(5.50));
        System.out.println("PRÓXIMO CARRO");
        // foi criado um construtor que faz o papel dos setters e os implementa no
        // construtor da classe Carro e os métodos getters repassam essa informação aqui
        Carro meuCarro2 = new Carro("Vermelho", "Ferrari", 69);
        System.out.println("A cor desse carro é: " + meuCarro2.getCor());
        System.out.println("O modelo desse carro é: " + meuCarro2.getModelo());
        System.out.println("A capacidade máxima do tanque é: " + meuCarro2.getCapacidadeTanque() + " litros");
        System.out.println("O valor para encher o tanque dessa máquina é: R$ " + meuCarro2.calcularValorGasosa(5.50));

    }
}
