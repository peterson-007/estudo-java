package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

	public static void main(String[] args) {
		
		//Para tipos genéricos apenas classe
		//double primitivo NÃO é permitido
		BinaryOperator<Double> calc = (x, y) -> { return x + y; };
		System.out.println(calc.apply(2.0, 3.0));
		
		calc = (x, y) -> x * y;
		System.out.println(calc.apply(2.0, 3.0));

		//BinaryOperator Represents an operation upon two operands of the SAME TYPE, producing a result of the SAME TYPE as the operands.
		BinaryOperator<Integer> calc2 = (x, y) -> { return x + y; };
		System.out.println(calc2.apply(2, 3));
		
		calc = (x, y) -> x * y;
		System.out.println(calc2.apply(2, 3));
	}
}
