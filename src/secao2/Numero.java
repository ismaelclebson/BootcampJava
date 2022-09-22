package secao2;

import java.util.Scanner;

public class Numero {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o número");
		double numero = teclado.nextDouble();
		teclado.close();
		double numero_anterior = numero - 1;
		double numero_posterior = numero + 1;
		
		System.out.printf("O número anterior é %.2f e o posterior é %.2f\n", numero_anterior, numero_posterior);

	}

}
