package secao4;

import java.util.Scanner;

public class NumeroDecrescente {

	public static void main(String[] args) {
		int i, numero;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Favor informar o núemro");
		numero = teclado.nextInt();
		teclado.close();
		for (i=numero;i>0;i--) {
			
			System.out.println(i);
		}
		
	}

}
