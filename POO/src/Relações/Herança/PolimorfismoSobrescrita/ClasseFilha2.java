package Relações.Herança.PolimorfismoSobrescrita;

public class ClasseFilha2 extends ClasseMãe {
    
    @Override
    void metodo1(){
        System.out.println("Método 1 da filha 2");
    }
    
    @Override
    void metodo2(){
        System.out.println("Método 2 da filha 2");
    }
    
}