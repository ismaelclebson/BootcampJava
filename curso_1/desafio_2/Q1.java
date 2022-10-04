package desafio_2;

import javax.swing.JOptionPane;

public class Q1 {

	public static void main(String[] args) {
		int i, soma=0, numero;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o numero de elementos da série"));
		
		for (i=1; i<=numero; i++) {
			soma = soma + i;
			
		}System.out.println("Soma dos "+numero+" elementos é "+soma);
	}

}
