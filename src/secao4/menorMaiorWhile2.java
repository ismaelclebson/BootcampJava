package secao4;

import java.util.Scanner;

public class menorMaiorWhile2 {

	public static void main(String[] args) {
	
		double numero, numeroMaior, numeroMenor;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Favor informar valor");
		numero = teclado.nextDouble();
		
		numeroMenor = numero;
		numeroMaior = numero;
		
		do {
			if(numero != 0);
				if (numero < numeroMenor)
					numeroMenor = numero;
				else if (numero > numeroMaior)
					numeroMaior = numero; 
			
				System.out.println("Favor informar valor");
				numero = teclado.nextDouble();
			
			
		}while(numero != 0);
		System.out.println("O menor valor é: "+numeroMenor+"\nO Maior valor é: "+numeroMaior);
		teclado.close();
		

	}

}
