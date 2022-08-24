package lambdas;

public class CalculoTeste2 {

	public static void main(String[] args) {
		
		//Exemplo de fun�ao lambda
		//A vari�vel calc � do tipo Calculo, que possui um �nico m�todo
		//Dessa forma, o java sabe que a lambda atribuida tem que bater com par�metros e o retorno do mesmo tipo
		Calculo calc = (x, y) -> { return x + y; };
		System.out.println(calc.executar(2, 3));
		
		//Quando N�O coloca as chaves {}, automaticamente aquilo que foi colocado ser� um retorno
		calc = (x, y) -> x * y;
		System.out.println(calc.executar(2, 3));
		
		//No Javascript => No Java ->
		
		System.out.println(calc.legal());
		System.out.println(Calculo.muitoLegal());
	}
}
