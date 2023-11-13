public class Carro {
    private String cor;
    private String modelo;
    private double capacidadeTanque;
    
//     // objeto
//     Carro meuCarro = new Carro(cor, modelo, capacidadeTanque);
//     // construtor do meuCarro
//     public Carro(String cor, String modelo, int capacidadeTanque) {
//         this.cor = cor;
//         this.modelo = modelo;
//         this.capacidadeTanque = capacidadeTanque;
// }
// getters e setters
    public String getCor() {
        return cor;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public double getCapacidadeTanque() {
        return capacidadeTanque;
    }
    
    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }
    
    //método calculando valor da gasosa
    double calcularValorGasosa(double preco){
        return capacidadeTanque * preco;
    }
    
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.setCor("branco");
        meuCarro.setModelo("Honda");
        meuCarro.setCapacidadeTanque(55);
        System.out.println("A cor desse carro é: " + meuCarro.getCor());
        System.out.println("O modelo desse carro é: " + meuCarro.getModelo());
        System.out.println("O valor para encher o tanque dessa máquina é: R$ " + meuCarro.calcularValorGasosa(5.50));
        
        Carro meuCarro2 = new Carro();
        meuCarro2.setCor("roxo");
        meuCarro2.setModelo("Ferrari");
        meuCarro2.setCapacidadeTanque(61);
        System.out.println("A cor desse carro é: " + meuCarro2.getCor());
        System.out.println("O modelo desse carro é: " + meuCarro2.getModelo());
        System.out.println("O valor para encher o tanque dessa máquina é: R$ " + meuCarro2.calcularValorGasosa(5.50));
        
        Carro meuCarro3 = new Carro();
        meuCarro3.setCor("azul");
        meuCarro3.setModelo("Foda");
        meuCarro3.setCapacidadeTanque(10000);
        System.out.println("A cor desse carro é: " + meuCarro3.getCor());
        System.out.println("O modelo desse carro é: " + meuCarro3.getModelo());
        System.out.println("O valor para encher o tanque dessa máquina é: R$ " + meuCarro3.calcularValorGasosa(5.50));
    }
}