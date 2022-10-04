package secao3;

import javax.swing.JOptionPane;

public class IdadeNadador {

	public static void main(String[] args) {
		int idade;
		
		idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira sua idade"));
		if ((idade >= 0) && (idade<=100)) {
			if (idade >= 18) {
				JOptionPane.showMessageDialog(null, "Categoria Adulta");
			}else if (idade >= 14) {
				JOptionPane.showMessageDialog(null, "Categoria Junenil B");
			}else if (idade >= 12) {
				JOptionPane.showMessageDialog(null, "Categoria Junenil A");
			}else if (idade >= 9) {
				JOptionPane.showMessageDialog(null, "Categoria Infantil C");
			}else if (idade >= 6) {
				JOptionPane.showMessageDialog(null, "Categoria Infantil B");
			}else if (idade >= 0) {
				JOptionPane.showMessageDialog(null, "Categoria Infantil A");
			}
		}else JOptionPane.showMessageDialog(null, "Valor errado inserido!");
			
				

	}

}
