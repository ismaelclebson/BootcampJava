package desafio_1;

import javax.swing.JOptionPane;

public class Q2 {

	public static void main(String[] args) {
		int i, cont, j, numero, seq=2;
		
		
		numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o numero de elementos da série"));
		for (i=numero, j=0, cont=0; i>0; i--, j++) {
			seq = seq + cont;
			cont = 2*j+1;
			System.out.print(seq+" ,");
		}
	}

}
