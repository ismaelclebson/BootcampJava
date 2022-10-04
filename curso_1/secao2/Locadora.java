package secao2;

import java.util.Scanner;

public class Locadora {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o nome e duração do filme:");
		String nome = teclado.next();
		int horas = teclado.nextInt();
		int minutos = teclado.nextInt();
		teclado.close();
		
		System.out.printf("Nome do filme é %s com duração de %d minutos", nome, horas*60 + minutos);
	}
}
