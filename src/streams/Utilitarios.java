package streams;

import java.util.function.UnaryOperator;

public class Utilitarios {
	
	//Construtor privado
	//N�o precisa instanciar a classe pois os m�todos j� s�o estaticos
	private Utilitarios() {
		
	}

	public final static UnaryOperator<String> maiuscula =
			n -> n.toUpperCase();
	
	public final static UnaryOperator<String> primeiraLetra =
			n -> n.charAt(0) + "";
	
	public final static String grito(String n) {
		return n + "!!! ";
	}
}
