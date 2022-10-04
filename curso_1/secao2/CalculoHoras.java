package secao2;

import java.util.Scanner;

public class CalculoHoras {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a quantidade de dias de viagem");
		double dias_viagem = entrada.nextInt();
		System.out.println("Digite a quantidade de horas de viagem");
		double horas_viagem = entrada.nextInt();
		entrada.close();
		
		double total_horas = dias_viagem*24 + horas_viagem; 
		
		System.out.println("O numero de horas da viagem foi de "+total_horas);

	}
	
}
