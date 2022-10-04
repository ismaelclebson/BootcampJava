package secao3;

import java.util.Scanner;

public class MediaAritmetica {

	public static void main(String[] args) {
		float nota1, nota2, nota3, nota4, frequencia;
	
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite as 4 notas:");
		nota1 = teclado.nextFloat();
		nota2 = teclado.nextFloat();
		nota3 = teclado.nextFloat();
		nota4 = teclado.nextFloat();
		frequencia = teclado.nextFloat();
		teclado.close();
		float media = (float)(nota1+nota2+nota3+nota4)/4;
		
		System.out.printf("A média do aluno é %.2f\n", media);
		
		
		if ((media < 5) || (frequencia < 75)){
			System.out.println("O aluno foi aprovado!");
		}else
			System.out.println("O aluno foi aprovado");

	}
}
