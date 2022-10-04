package secao2;

import java.util.Scanner;

public class OpcoesPagamento {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Qual o preço do produto?");
		double preco = teclado.nextDouble();
		teclado.close();
		
		System.out.printf("Pagamento a vista é de %.2f e a prazo é de 3 vezes de %.2f\n", preco*0.9, preco/3);
		
	}
}
