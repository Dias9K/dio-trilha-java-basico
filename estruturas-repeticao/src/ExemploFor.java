public class ExemploFor {
	public static void main(String[] args) {
		int ex = 0;
		if (ex == 1) {

			// LAÇO FOR (criação da variável contadora; condição de validação;
			// incrementação)
			for (int carneirinhos = 1; carneirinhos <= 20; carneirinhos++) {
				System.out.println(carneirinhos + " - Carneirinhos");
			}

			for (int i = 0; i <= 10; i = i + 5)
				System.out.println(i);
		} else {

			String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };
			// o método lenght é usado para contar o tamanho da variável da string aluno
			// ou seja, tem 4 strings, vai ter 4 loops
			for (int x = 0; x < alunos.length; x++)
			//alunos[x] imprime o valor correspondente a posição do array	
			System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);

			// FOR-EACH (<criação da variável>: <array>)
			// sem a necessidade de usar um laço for, é criada uma variável local e
			// a cada interação com o :array a ser comparado, a local receberá o seu valor
			// e fará 1 loop a cada fim de interação
			for(String aluno:alunos){
				System.out.println("Nome do aluno é: " + aluno);
			}
		}
	}
}