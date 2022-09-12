package excecao;

public class ChecadaVsNaoChecada {

	public static void main(String[] args) {
		
		try {
			geraErro1();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		
		try {
			geraErro2();
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim :)");
	}
	
	// Exceção NÃO checada ou NÃO verifica
	static void geraErro1() {
		//interrompe o fluxo
		//Lança apenas da classe throwable
		throw new RuntimeException("Ocorreu um erro bem legal #01!");
				//Runtime Exception NÃO é obrigatorio tratar o erro
	}

	// Exceção checada ou verificada
	static void geraErro2() throws Exception {
		throw new Exception("Ocorreu um erro bem legal #02!");
	}
}
