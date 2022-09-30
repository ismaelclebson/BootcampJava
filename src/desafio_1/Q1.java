package desafio_1;

import javax.swing.JOptionPane;

public class Q1 {

	public static void main(String[] args) {
		int i, cont, numero, seq=1;
		
		
		numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o numero de elementos da série"));
		for (i=numero, cont=0; i>0; i--, cont++) {
			seq = seq + cont;
			System.out.print(seq+" ,");
		}
	}

}
