package secao2;

import java.util.Scanner;

public class JantarPizza {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o valor da conta é");
		double valoraPagar = teclado.nextDouble();
		System.out.println("Quantidade de clientes");
		int clientes = teclado.nextInt();
		teclado.close();
		
		double valorPagoCada = valoraPagar / clientes;
		
		System.out.println("Valor pago por cada um será "+valorPagoCada);

		
	}

}
