package secao5;

import java.util.Arrays;
import java.util.List;

public class LambdaApp4 {
	
	static int numero;

	public static void main(String[] args) {
	
		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
		LambdaApp2 app = new LambdaApp2();
		
		//Expressao lambda
		
		integers.forEach(x -> {
			numero = 10;
			x = x+numero;
			app.somatorio = app.somatorio + x;
			System.out.println(x);
			});
		System.out.println(app.somatorio);
	}

}
