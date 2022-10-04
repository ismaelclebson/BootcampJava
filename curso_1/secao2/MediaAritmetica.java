package secao2;

import java.util.Scanner;

public class MediaAritmetica {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite as 4 notas:");
		double nota1 = teclado.nextDouble();
		double nota2 = teclado.nextDouble();
		double nota3 = teclado.nextDouble();
		double nota4 = teclado.nextDouble();
		teclado.close();
		
		System.out.printf("A média do aluno é %.2f", (nota1+nota2+nota3+nota4)/4);

	}
}
