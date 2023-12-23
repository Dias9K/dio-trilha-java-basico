package Relações.Herança.PolimorfismoSobrescrita;

public class ClasseFilha1 extends ClasseMãe {

    // Essa anotação é usada para indicar que o método de uma subclasse está
    // sobrescrevendo um método da superclasse.
    @Override
    void metodo1() {
        System.out.println("Método 1 da filha 1");
    }
}
