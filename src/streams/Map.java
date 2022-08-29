package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {
	
	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		
		List<String> marcas = Arrays.asList("BMW ", "Audi ", "Honda ");
		                   //m é aleatório
		marcas.stream().map(m -> m.toUpperCase()).forEach(print);
		
		// UnaryOperator<String> maiuscula = n -> n.toUpperCase();
		UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
		// UnaryOperator<String> grito = n -> n + "!!! ";
				
		System.out.println("\n\nUsando composiÃ§Ã£o...");
		marcas.stream()
			.map(Utilitarios.maiuscula)
			.map(primeiraLetra)
			.map(Utilitarios::grito)
			.forEach(print);
	}
}

/*O MAP na verdade é uma função que vai te ajudar a transformar uma estrutura de dados em um outro estrutura
de dados do MESMO TAMANHO só que com os dados TRANSFORMADOS, ou seja, com os dados mapeados e qual é a
regra para mapear esses dados.*/