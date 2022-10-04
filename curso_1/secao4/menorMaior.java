package secao4;

import java.util.Scanner;

public class menorMaior {

	public static void main(String[] args) {
		int i;
		double numero, numeroMaior=-9999, numeroMenor=9999;
		Scanner teclado = new Scanner(System.in);
		
		for (i=0;i<=5;i++) {
			System.out.println("Informe o numero: ");
			numero = teclado.nextInt();
			if (numero > numeroMaior)
				numeroMaior = numero;
			else if (numero < numeroMenor)
				numeroMenor = numero;
		}
		System.out.println("O numero menor é "+numeroMenor+" e o maior numero é "+numeroMaior);
		teclado.close();
	}
}
