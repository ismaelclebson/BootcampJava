package secao4;

import java.util.Scanner;

public class Fatorial {


	public static void main(String[] args) {
		
		double fatorial = 1;
		int numero, i;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Favor informar o numero");
		numero = teclado.nextInt();
		i = numero;
		
		do{
			fatorial = fatorial * i;
			i--; 
		}while (i >=1); 
		
		System.out.println("O fatorial do numero: "+numero+"! = "+fatorial);
		teclado.close();
	}

}
