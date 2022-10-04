package desafio_2;

import javax.swing.JOptionPane;

public class Q2 {
	
	public static void main(String[] args) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o numero para calcular o fatorial"));
		int somas = soma(5);
		System.out.println("Soma dos "+numero+" elementos é "+somas);
	}
	
	
	public static int soma(int num) {
		if(num == 0) {
			return 0;
		}return num+soma(num-1);
	}
}
