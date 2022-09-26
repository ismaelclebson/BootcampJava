package secao4;

import javax.swing.JOptionPane;

public class sequencia {

	public static void main(String[] args) {
		int n, atual;
		
		n = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de n:"));
		atual = 1;
		
		while(n>1) {
		atual = atual+3;
		n--;
		}
		JOptionPane.showMessageDialog(null, atual);
	}

}
