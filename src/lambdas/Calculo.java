package lambdas;

//Interface funcional s� poder ter um �nico m�todo
@FunctionalInterface
public interface Calculo {

	//M�todo abstrato (que � reconhecido pela fun��o lambda)
	double executar(double a, double b);
	
	//M�todo default � permitido
	default String legal() {
		return "legal";
	}
	
	//M�todo static tamb�m
	//Lembrando que o static N�O tem acesso ao this(inst�ncia atual)
	static String muitoLegal() {
		return "muito legal";
	}
}
