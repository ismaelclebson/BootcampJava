package secao3;

import javax.swing.JOptionPane;

public class desafio2 {

	public static void main(String[] args) {
		double n, fatorial;
		
		n = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de n:"));
		fatorial = n;
		
		while(n>1) {
		fatorial = fatorial*(n-1);
		n--;
		}
		JOptionPane.showMessageDialog(null, fatorial);
	}

}
