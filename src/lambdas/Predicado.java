package lambdas;

import java.util.function.Predicate;

//Exemplo de uso de mais uma interface funcional do java
public class Predicado {

	public static void main(String[] args) {
						//is - padrão para boolean
		Predicate<Produto> isCaro = 
				prod -> (prod.preco * (1 - prod.desconto)) >= 750;
		
		Produto produto = new Produto("Notebook", 3893.89, 0.15);
		System.out.println(isCaro.test(produto));
	}
}
