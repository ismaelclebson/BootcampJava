package secao2_2;

import javax.swing.JOptionPane;

public class desafio_22 {
	
	public static void main(String[] args) {
		int x;
		
		x = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de n:"));
		double harm = 1;
		
		while (1<x) {
			harm = harm + (double)1/x;
			x--;
		}

		JOptionPane.showMessageDialog(null, "Soma dos "+x+" da harmonica é "+harm);
	}

}
