package desafio_5;

import javax.swing.JOptionPane;

public class Q1 {

	public static void main(String[] args) {
		float quantia;
		int cedula200, cedula100, cedula50;
		
		quantia = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira a quantidade que seja sacar"));
		if (quantia%50 == 0) {
			if (quantia >= 200) {
				cedula200 = (int)(quantia/200);
				quantia = quantia-cedula200*200;
				JOptionPane.showMessageDialog(null, "Receberá "+cedula200+" de 200");
			}if (quantia >= 100) {
				cedula100 = (int)(quantia/100);
				quantia = quantia-cedula100*100;
				JOptionPane.showMessageDialog(null, "Receberá "+cedula100+" de 100");
			}if (quantia >= 50) {
				cedula50 = (int)(quantia/50);
				quantia = quantia-cedula50*50;
				JOptionPane.showMessageDialog(null, "Receberá "+cedula50+" de 50");
			}
		}else 
		JOptionPane.showMessageDialog(null, "Não temos notas que contemplem esse valor de saque");

	}

}
