package secao2_2;

import java.util.Scanner;

public class Operadores {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o primeiro valor");
		int numero1 = teclado.nextInt();
		System.out.println("Digite o segundo valor");
		int numero2 = teclado.nextInt();
		
		int soma = numero1+numero2;
		int subtracao = numero1-numero2;
		int multiplicacao = numero1*numero2;
		float divisao = (float)numero1/numero2;
		
		teclado.close();
		
		System.out.println("Soma="+soma);
		System.out.println("Subtração="+subtracao);
		System.out.println("Multiplicação="+multiplicacao);
		System.out.printf("Divisão=%.2f",divisao);

	}

}
