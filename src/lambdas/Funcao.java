package lambdas;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {
		
		Function<Integer, String> parOuImpar = // operador ternário ?if :else
				       numero -> numero % 2 == 0 ? "Par" : "Impar";
		
		Function<String, String> oResultadoE = 
				valor -> "O resultado Ã©: " + valor;
				
		Function<String, String> empolgado = 
				valor -> valor + "!!!";
				
		Function<String, String> duvida = 
				valor -> valor + "???";
				
				
		//Composição de funções
		String resultadoFinal1 = parOuImpar
				.andThen(oResultadoE)
				.andThen(empolgado)
				.apply(32); //função parOuImpar tem o 1º parâmentro Int
		System.out.println(resultadoFinal1);

		String resultadoFinal2 = parOuImpar
				.andThen(oResultadoE)
				.andThen(duvida)
				.apply(33);
		System.out.println(resultadoFinal2);
		
		System.out.println(parOuImpar.apply(32));
	}
}
