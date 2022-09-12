package excecao;

public class Basico {

	public static void main(String[] args) {
		
		Aluno a1 = null;
		
		try {
			imprimirNomeDoAluno(a1);			
		} catch(Exception excecao) { //N�O � recomendado tratar o erro de forma gen�rica
			System.out.println("Ocorreu um erro no momento "
					+ "de imprimir o nome do usuário");
		}
		
		
		//Selecionar e com o bot�o direito - SORROUND WITH - TRY CATCH BLOCK		
		try {
			System.out.println(7 / 0);
		} catch (ArithmeticException e) {
			 System.out.println("Ocorreu o erro: " + e.getMessage());
		}
		
		System.out.println("Fim :)");
	}
	
	public static void imprimirNomeDoAluno(Aluno aluno) {
		System.out.println(aluno.nome);
	}
}
