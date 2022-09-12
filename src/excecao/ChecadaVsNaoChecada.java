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
	
	// Exce��o N�O checada ou N�O verifica
	static void geraErro1() {
		//interrompe o fluxo
		//Lan�a apenas da classe throwable
		throw new RuntimeException("Ocorreu um erro bem legal #01!");
				//Runtime Exception N�O � obrigatorio tratar o erro
	}

	// Exce��o checada ou verificada
	static void geraErro2() throws Exception {
		throw new Exception("Ocorreu um erro bem legal #02!");
	}
}
