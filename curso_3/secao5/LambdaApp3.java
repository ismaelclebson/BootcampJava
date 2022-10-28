package secao5;

import java.util.Arrays;
import java.util.List;

public class LambdaApp3 {

	public static void main(String[] args) {
		int numero = 10;
		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
		
		//Expressao lambda
		
		integers.forEach(x -> {
			x = x+numero;
			System.out.println(x);
			});
	}

}
