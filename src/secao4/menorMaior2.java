package secao4;

import java.util.Scanner;

public class menorMaior2 {

	public static void main(String[] args) {
		int i, count=0;
		double numero, numeroMaior=-9999, numeroMenor=9999, media=0;
		Scanner teclado = new Scanner(System.in);
		
		for (i=0;i<=5;i++) {
			count++;
			System.out.println("Informe o numero: ");
			numero = teclado.nextInt();
			if (numero > numeroMaior)
				numeroMaior = numero;
			else if (numero < numeroMenor)
				numeroMenor = numero;
			media = media + numero;
		}
		media = media/count;
		System.out.println("O numero menor é "+numeroMenor+", o maior numero é "+numeroMaior+" e a média é "+media);
		teclado.close();
	}
}
