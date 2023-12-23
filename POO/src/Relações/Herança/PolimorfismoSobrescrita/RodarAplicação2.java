package Relações.Herança.PolimorfismoSobrescrita;

public class RodarAplicação2 {
    public static void main(String[] args) {
        
        ClasseMãe[] classes = new ClasseMãe[]{new ClasseFilha1(), new ClasseFilha2(), new ClasseMãe()};

        for (ClasseMãe classe : classes) {
            classe.metodo1();
        }
        
        System.out.println("");

        for (ClasseMãe classe : classes) {
            classe.metodo2();
        }
        
        System.out.println("");

        ClasseFilha2 classeFilha2 = new ClasseFilha2();
        classeFilha2.metodo2();
    }
}
