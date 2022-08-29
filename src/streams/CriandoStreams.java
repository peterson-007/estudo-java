package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		Consumer<Integer> println = System.out::println;
		
							   //stream.of � um m�todo est�tico
		Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n");
		langs.forEach(print);
		
		//Criando stream com array
		String[] maisLangs = { "Python ", "Lisp ", "Perl ", "Go\n" };		
		Stream.of(maisLangs).forEach(print);
		
		//Criando stream com Classe Arrays
		//M�todo stream passa o array como par�metro
		Arrays.stream(maisLangs).forEach(print);
		//Passando o "subconjunto" do array
		Arrays.stream(maisLangs, 1, 4).forEach(print);
		
		//Geranco stream com Collections
		List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin\n");
		outrasLangs.stream().forEach(print);
		outrasLangs.parallelStream().forEach(print);//No parallelStream os dados N�O s�o exibidos na ordem
		
		//Streams infinitas
		// Stream.generate(() -> "a").forEach(print);
		Stream.iterate(0, n -> n + 1).forEach(println);
	}
}

/* Quando a interface Collection � usada, o usu�rio deve se ocupar da itera��o (por exemplo, mediante foreach, la�o for melhorado);
 * essa abordagem � chamada de ITERA��O EXTERNA.
 *
 *  Em contrapartida, a biblioteca Streams recorre � ITERA��O INTERNA; ela se ocupa da itera��o e de armazenar em algum lugar
 *  o valor da stream resultante; o usu�rio s� fornece uma fun��o dizendo o que deve ser feito. */
 