package secao3;

import javax.swing.JOptionPane;

public class CaixaEletronico {

	public static void main(String[] args) {
		float quantia;
		int cedula100, cedula50, cedula10;
		
		quantia = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira a quantidade que seja sacar"));
		if (quantia%10 == 0) {
			if (quantia >= 100) {
				cedula100 = (int)(quantia/100);
				quantia = quantia-cedula100*100;
				JOptionPane.showMessageDialog(null, "Receberá "+cedula100+" de 100");
			}if (quantia >= 50) {
				cedula50 = (int)(quantia/50);
				quantia = quantia-cedula50*50;
				JOptionPane.showMessageDialog(null, "Receberá "+cedula50+" de 50");
			}if (quantia >= 10) {
				cedula10 = (int)(quantia/10);
				quantia = quantia-cedula10*10;
				JOptionPane.showMessageDialog(null, "Receberá "+cedula10+" de 10");
			}
		}else JOptionPane.showMessageDialog(null, "Não contemplamos esse valor para saque");
			
				

	}

}
