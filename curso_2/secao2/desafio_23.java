package secao2_2;

import javax.swing.JOptionPane;

public class desafio_23 {
	 

	public static void main(String[] args) {
	
		String entrada = JOptionPane.showInputDialog(null, "Insira o email");
	
		if (validacaoEmail(entrada)) {
			System.out.println("Email validado com sucesso!");
		}else
			System.out.println("Email invalidado! favor tentar novamente.");
	}
	
	public static boolean validacaoEmail(String email) {
		
		return email.matches("\\w+\\@\\w+\\.\\w{3}");
		
	}	
	
}
