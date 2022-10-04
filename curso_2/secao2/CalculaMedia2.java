package secao2_2;

import java.util.Scanner;

public class CalculaMedia2 {

	public static void main(String[] args) {
		
		int maior, menor;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Favor informar o valor");
		int valor = teclado.nextInt();
		
		double soma_valor = 0;
		int cont = 0;
		maior = menor = valor;
		while(valor != -1)
		{
			soma_valor = soma_valor + valor;
			cont++;
			if (valor>maior)
				maior = valor;
			else if (valor<menor)
				menor = valor;
			
			System.out.println("Favor informar o valor");
			valor = teclado.nextInt();			
		}
		
		System.out.println("Maior valor é "+maior);
		System.out.println("Menor valor é "+menor);
		System.out.println("Média="+soma_valor/cont);
		teclado.close();
	}

}
