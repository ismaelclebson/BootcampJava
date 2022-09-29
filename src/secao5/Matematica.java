package secao5;

import java.util.Scanner;

public class Matematica {
	
		public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Inserir o valor da tabuada");
		int numero = teclado.nextInt();
		tabuada(numero);
		teclado.close();
	}

	public static void tabuada(int numero)
	{
		int total;
		for(int i=1;i<=10;i++)
		{
			total = numero * i;
			System.out.println(numero+"x"+i+"="+total);
		}
	}
	
}
