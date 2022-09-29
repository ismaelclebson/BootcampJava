package secao4;

import java.util.Scanner;

public class numeroEstrelas {

	public static void main(String[] args) {
		
		int i, numero_linhas;
		String estrela = "*";
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Favor informar o numero de linhas");
		numero_linhas = teclado.nextInt();
		
		for(i=1; i<=numero_linhas;i++){
			
			System.out.println(estrela);
			estrela = estrela + "*";
		}
		teclado.close();
	}

}
