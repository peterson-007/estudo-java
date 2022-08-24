package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {

	public static void main(String[] args) {
		
		UnaryOperator<Integer> maisDois = n -> n + 2;
		UnaryOperator<Integer> vezesDois = n -> n * 2;
		UnaryOperator<Integer> aoQuadrado = n -> n * n;
		
		
								   //Ordem do andThen:
		int resultado1 = maisDois   //1º
				.andThen(vezesDois) //2º
				.andThen(aoQuadrado)//3º
				.apply(0);
		System.out.println(resultado1);
		
									//Ordem do compose:		
		int resultado2 = aoQuadrado //3º
				.compose(vezesDois) //2º
				.compose(maisDois)  //1º
				.apply(0);
		System.out.println(resultado2);
	}
}
