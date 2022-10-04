package secao3;

import java.util.Scanner;

public class Numero {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o número");
		double numero = teclado.nextDouble();
		teclado.close();
		
		
		if (numero%2 == 0) {
			System.out.println("O número é par");
		}

	}

}
