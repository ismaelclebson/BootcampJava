package secao5;

import java.util.Arrays;
import java.util.List;

public class LambdaApp {
	
	static int var=1;

	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
		
		
		integers.forEach(x -> {
			var++;
			System.out.println(x);
		});
	}

}
