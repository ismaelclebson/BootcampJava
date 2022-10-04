package secao4;

import java.util.Scanner;

public class maiorNumero {

	public static void main(String[] args) {
		int i;
		double numero, numeroMaior=-9999;
		Scanner teclado = new Scanner(System.in);
		
		for (i=0;i<=5;i++) {
			System.out.println("Informe o numero: ");
			numero = teclado.nextInt();
			if (numero > numeroMaior)
				numeroMaior = numero;
		}
		System.out.println("O numero menor é "+numeroMaior);
		teclado.close();
	}

}
