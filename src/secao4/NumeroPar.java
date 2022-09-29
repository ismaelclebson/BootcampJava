package secao4;

import java.util.Scanner;

public class NumeroPar {
	
	public static void main(String[] args) {
		
		int a, b, i;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Favor informar o A");
		a = teclado.nextInt();
		System.out.println("Favor informar o B");
		b = teclado.nextInt();
		
		/*for (i = a+1; i<b; i++) {
			if (i%2 == 0) {
				System.out.println("O numero "+i+" é par");
				}
			}
		}*/
		if (a>=b) {
			
			for (i = b+1; i<a; i++) {
			
				if (i%2 == 0) {
					System.out.println("O numero "+i+" é par");
				}
			}
		}else {
			for (i = a+1; i<b; i++) { 
				if (i%2 == 0) {
					System.out.println("O numero "+i+" é par");
				}
			}
		}teclado.close();
	}
}
