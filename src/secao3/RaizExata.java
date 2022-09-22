package secao3;

import javax.swing.JOptionPane;

public class RaizExata {

	public static void main(String[] args) {
		int numero;
		double raiz, maiorValor;
	
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número para tirar a raiz"));
		raiz = Math.sqrt(numero);
		maiorValor = Math.ceil(raiz);
		
		if (raiz == maiorValor) {
			JOptionPane.showMessageDialog(null, "Existe raiz exata para o "+numero);
		
		} else 
			JOptionPane.showMessageDialog(null, "O número não tem raiz exata");
		
	}

}
