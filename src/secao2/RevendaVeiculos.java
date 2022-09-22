package secao2;

import java.util.Scanner;

public class RevendaVeiculos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o modelo e o preco do veiculo:");
		String modelo = teclado.next();
		double preco = teclado.nextDouble();
		teclado.close();
		
		System.out.println("Valor da entrada é R$"+preco*0.5+" e o saldo restante é 12 vezes sem juros de R$"+(preco*0.5)/12+" do "+modelo);

	}


}
