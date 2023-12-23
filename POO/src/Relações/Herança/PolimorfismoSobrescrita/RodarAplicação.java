package Relações.Herança.PolimorfismoSobrescrita;

public class RodarAplicação {
    public static void main(String[] args) {
        Funcionário funcionario = new Funcionário();

        // UPCAST - quando um objeto de uma subclasse é tratado como um objeto da
        // superclasse. Sempre funciona pois todo objeto é compatível com o tipo no qual
        // ele foi derivado. Todo gerente, vendedor e faxineiro são funcionários.
        Funcionário gerente = new Gerente();
        Funcionário vendedor = new Vendedor();
        Funcionário faxineiro = new Faxineiro();

        // DOWNCAST - quando um objeto de uma superclasse é tratado como um objeto da
        // subclasse. O que lança uma ClassCastException se o objeto não for realmente
        // uma instância da subclasse. Nem todo funcionário é vendedor, o que causa uma exceção.
        Vendedor vendedor_ = (Vendedor) new Funcionário();

    }
}