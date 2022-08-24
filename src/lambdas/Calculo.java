package lambdas;

//Interface funcional só poder ter um único método
@FunctionalInterface
public interface Calculo {

	//Método abstrato (que é reconhecido pela função lambda)
	double executar(double a, double b);
	
	//Método default é permitido
	default String legal() {
		return "legal";
	}
	
	//Método static também
	//Lembrando que o static NÃO tem acesso ao this(instância atual)
	static String muitoLegal() {
		return "muito legal";
	}
}
