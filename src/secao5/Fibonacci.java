package secao5;

import java.util.Scanner;

public class Fibonacci {
	
		public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Favor informar o n�mero");
		int numero = teclado.nextInt();
		fibo(numero);
		teclado.close();
	}
	
	
	public static void fibo(int numero)
	{
		
		int anterior_1 = 1;
		int anterior_2 = 1;
		int atual = 0;
		System.out.print(anterior_1+","+anterior_2+",");
		
		for(int i =3; i<=numero; i++){ 
			atual = anterior_1 + anterior_2;
			anterior_1 = anterior_2;
			anterior_1 = atual;
			System.out.print(atual+",");
		}		
	}
	
}
