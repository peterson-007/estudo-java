package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {

	public static void main(String[] args) {
		
		UnaryOperator<Integer> maisDois = n -> n + 2;
		UnaryOperator<Integer> vezesDois = n -> n * 2;
		UnaryOperator<Integer> aoQuadrado = n -> n * n;
		
		
								   //Ordem do andThen:
		int resultado1 = maisDois   //1�
				.andThen(vezesDois) //2�
				.andThen(aoQuadrado)//3�
				.apply(0);
		System.out.println(resultado1);
		
									//Ordem do compose:		
		int resultado2 = aoQuadrado //3�
				.compose(vezesDois) //2�
				.compose(maisDois)  //1�
				.apply(0);
		System.out.println(resultado2);
	}
}
