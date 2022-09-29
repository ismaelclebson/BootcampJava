package secao4;

import javax.swing.JOptionPane;

public class NumeroPrimo {

	public static void main(String[] args) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira seu valor: "));
		int numeroDivisores = 0;
		
		for (int i=numero; i>0; i--) {
			
			if(numero%i == 0) {
				numeroDivisores++;
			
				}
		}
		if (numeroDivisores > 2)
			JOptionPane.showInternalMessageDialog(null, "O numero "+numero+" não é primo!");
		else
			JOptionPane.showInternalMessageDialog(null, "O numero "+numero+" é primo!");
		}

}


