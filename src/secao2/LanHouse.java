package secao2;

import java.util.Scanner;

public class LanHouse {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int hora = teclado.nextInt();
		int minuto = teclado.nextInt();
		teclado.close();
		
		double totalMinutos = hora*60 + minuto;
		System.out.println(totalMinutos);

    
		double totalPagar = Math.round(totalMinutos/15)*2;
		
		System.out.println("Preço a pagar é de "+totalPagar);
  } 
}
