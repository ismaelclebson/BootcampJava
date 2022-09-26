package secao4;

import javax.swing.JOptionPane;

public class CalculaMedia {

	public static void main(String[] args) {
		double somaValor=0, cont=0, x;
		x = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de x:"));
		
		while (x != -1) {
			somaValor = somaValor + x;
			cont++;
			x = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de x:"));
		}
		System.out.println("Média="+somaValor/cont);
		
	}

}
