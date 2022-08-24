package lambdas;

public class CalculoTeste2 {

	public static void main(String[] args) {
		
		//Exemplo de funçao lambda
		//A variável calc é do tipo Calculo, que possui um único método
		//Dessa forma, o java sabe que a lambda atribuida tem que bater com parâmetros e o retorno do mesmo tipo
		Calculo calc = (x, y) -> { return x + y; };
		System.out.println(calc.executar(2, 3));
		
		//Quando NÃO coloca as chaves {}, automaticamente aquilo que foi colocado será um retorno
		calc = (x, y) -> x * y;
		System.out.println(calc.executar(2, 3));
		
		//No Javascript => No Java ->
		
		System.out.println(calc.legal());
		System.out.println(Calculo.muitoLegal());
	}
}
