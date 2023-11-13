public class Carro {
    private String cor;
    private String modelo;
    private int capacidadeTanque;

    // construtor vazio do meuCarro
    public Carro() {

    }

    // construtor do meuCarro2
    public Carro(String cor, String modelo, int capacidadeTanque) {
        // perceba aqui também que houve uma SOBRECARGA nos construtores pois foi
        // utilizado o mesmo nome "Carro()", mas com parâmetros diferentes
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;

    }

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

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    // método calculando valor da gasosa
    double calcularValorGasosa(double preco) {
        return capacidadeTanque * preco;
    }
}