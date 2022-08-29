package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		BinaryOperator<Integer> soma = (ac, n) -> ac + n;
		
		Integer total1 = nums.parallelStream().reduce(soma).get();
		System.out.println(total1);
		
		//Como o par�metro � passado, n�o � necess�rio o .get()
		Integer total2 = nums.stream().reduce(100, soma);
		System.out.println(total2);
		
		// Resultado foi um Opcional<Integer>...
		nums.stream()
			.filter(n -> n > 5)
			.reduce(soma)
			.ifPresent(System.out::println);
	}
}


/*Reduce � uma fun�ao "terminal", assim como forEach*/