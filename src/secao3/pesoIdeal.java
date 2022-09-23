package secao3;

import javax.swing.JOptionPane;

public class pesoIdeal {

	public static void main(String[] args) {
		double altura, pesoIdealHomem, pesoIdealMulher;
		String sexo;
		altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a altura"));
		sexo = JOptionPane.showInputDialog(null, "Insira o sexo");
		if (sexo.equalsIgnoreCase("H")) {
			pesoIdealHomem = (altura*72.7)-58;
			JOptionPane.showMessageDialog(null, "O peso ideal do homem é de "+pesoIdealHomem);
		}else {
			pesoIdealMulher = (altura*62.1)-44.7;
			JOptionPane.showMessageDialog(null, "O peso ideal da mulher é de "+pesoIdealMulher);
		}
	}
		

}
