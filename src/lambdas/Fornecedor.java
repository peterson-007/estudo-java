package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {

	public static void main(String[] args) {
		
		Supplier<List<String>> umLista = 
				//Mesmo n�o recebendo nenhum par�metro tem que colocar ()
				() -> Arrays.asList("Ana", "Bia", "Lia", "Gui");
		System.out.println(umLista.get());
	}
}
