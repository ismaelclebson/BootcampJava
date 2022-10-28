package secao5;

import java.util.Arrays;
import java.util.List;

public class LambdaApp2 {
	
	int somatorio;

	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
		
		//Expressao lambda
		
		integers.forEach((Integer x) -> {
			x = x+10;
			System.out.println(x);
			});
	}

}
