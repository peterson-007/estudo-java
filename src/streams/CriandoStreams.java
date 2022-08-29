package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		Consumer<Integer> println = System.out::println;
		
							   //stream.of é um método estático
		Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n");
		langs.forEach(print);
		
		//Criando stream com array
		String[] maisLangs = { "Python ", "Lisp ", "Perl ", "Go\n" };		
		Stream.of(maisLangs).forEach(print);
		
		//Criando stream com Classe Arrays
		//Método stream passa o array como parâmetro
		Arrays.stream(maisLangs).forEach(print);
		//Passando o "subconjunto" do array
		Arrays.stream(maisLangs, 1, 4).forEach(print);
		
		//Geranco stream com Collections
		List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin\n");
		outrasLangs.stream().forEach(print);
		outrasLangs.parallelStream().forEach(print);//No parallelStream os dados NÃO são exibidos na ordem
		
		//Streams infinitas
		// Stream.generate(() -> "a").forEach(print);
		Stream.iterate(0, n -> n + 1).forEach(println);
	}
}

/* Quando a interface Collection é usada, o usuário deve se ocupar da iteração (por exemplo, mediante foreach, laço for melhorado);
 * essa abordagem é chamada de ITERAÇÃO EXTERNA.
 *
 *  Em contrapartida, a biblioteca Streams recorre à ITERAÇÃO INTERNA; ela se ocupa da iteração e de armazenar em algum lugar
 *  o valor da stream resultante; o usuário só fornece uma função dizendo o que deve ser feito. */
 