package secao2;

import java.util.Scanner;

public class Jantar {

	public static void main(String args[]) {
	    Scanner preco = new Scanner(System.in);
	    System.out.println("Digite o valor do jantar: ");
	    double valoraPagar = preco.nextDouble();
	    preco.close();
	    double taxaGarcom = valoraPagar*0.1;
	    double totalaPagar = valoraPagar + taxaGarcom;
	    System.out.printf("A taxa do garçom é %.2f\n", taxaGarcom);
	    System.out.printf("O valor total a pagar é %.2f\n", totalaPagar);
	  } 
}
