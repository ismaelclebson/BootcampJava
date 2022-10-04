package secao3;

import javax.swing.JOptionPane;

public class AvaliacaoNota {

	public static void main(String[] args) {
		int idade;
		
		idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira sua idade"));
		if ((idade >= 0) && (idade<=100)) {
			if (idade >= 90) {
				JOptionPane.showMessageDialog(null, "Conceito Excelente");
			}else if (idade >= 70) {
				JOptionPane.showMessageDialog(null, "Conceito bom");
			}else if (idade >= 50) {
				JOptionPane.showMessageDialog(null, "Conceito Regular");
			}else if (idade >= 0) {
				JOptionPane.showMessageDialog(null, "Conceito Insuficiente");
			}
		}else JOptionPane.showMessageDialog(null, "Valor errado inserido!");
			
	}

}
