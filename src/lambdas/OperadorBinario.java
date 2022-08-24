package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

	public static void main(String[] args) {
		
		
		
		//Represents a function that accepts two arguments and produces a result.
		//Utilizando UMA fun��o
		BiFunction<Double, Double, String> resultado = (n1, n2) -> {
			double notaFinal = (n1 + n2) / 2;
			return notaFinal >= 7 ? "Aprovado" : "Reprovado";
		};
		
		System.out.println(resultado.apply(9.7, 4.1));
		
		
		//Represents an operation upon two operands of the same type, producing a result of the SAME TYPE as the operands.
				BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;
				System.out.println(media.apply(9.8, 5.7));
		
		//Composi��o de fun�oes - Utilizando duas fun�oes
		Function<Double, String> conceito = 
				m -> m >= 7 ? "Aprovado" : "Reprovado";
				
		System.out.println(media.andThen(conceito).apply(9.7, 5.1));
	}
}
