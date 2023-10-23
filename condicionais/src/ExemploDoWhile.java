// é importada uma biblioteca de aleatoriedade(random)
import java.util.Random;
public class ExemploDoWhile {
    public static void main(String[] args) {
		System.out.println("Discando...");
		
		do {
			//excutando repetidas vezes até alguém atender
			System.out.println("Telefone tocando");
		
		}while(tocando());
		
		System.out.println("Alô !!!");
	}
    // cria um método para que o telefone seja atendido ou não, aleatoriamente
	private static boolean tocando() { // de 3 vezes que foi chamado, 1 delas foi atendida(???)
		boolean atendeu = new Random().nextInt(3)==1;
		System.out.println("Atendeu? " + atendeu);
		//negando o ato de continuar tocando
		return ! atendeu;
	}
}