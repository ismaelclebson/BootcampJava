package desafio_5;

import javax.swing.JOptionPane;

public class Q2 {

	public static void main(String[] args) {
		float quantia;
		String tipoSaque;
		int cedula200, cedula100, cedula50, cedula10, cedula2;
		
		Object opcaoSaque[] = { "NOTAS DE [R$200][R$100][R$50]", "NOTAS DE [R$100][R$50][R$10]","NOTAS DE [R$50][R$10][R$2]" };
		
		quantia = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira a quantidade que deseja sacar"));

		tipoSaque = (String) JOptionPane.showInputDialog(null,
				"Escolha as opções de cédulas disponíveis", "Efetuar saque ",
				JOptionPane.INFORMATION_MESSAGE, null,
				opcaoSaque, opcaoSaque[0]);
		
		if (tipoSaque == opcaoSaque[0]) {
			if (quantia%50 == 0) {
				if (quantia >= 200) {
					cedula200 = (int)(quantia/200);
					quantia = quantia-cedula200*200;
					JOptionPane.showMessageDialog(null, "Receberá "+cedula200+" de R$200");
				}if (quantia >= 100) {
					cedula100 = (int)(quantia/100);
					quantia = quantia-cedula100*100;
					JOptionPane.showMessageDialog(null, "Receberá "+cedula100+" de R$100");
				}if (quantia >= 50) {
					cedula50 = (int)(quantia/50);
					quantia = quantia-cedula50*50;
					JOptionPane.showMessageDialog(null, "Receberá "+cedula50+" de R$50");
				}
			}else 
			JOptionPane.showMessageDialog(null, "Não temos notas que contemplem esse valor de saque");
			
		}
		
		if (tipoSaque == opcaoSaque[1]) {
			if (quantia%10 == 0) {
				if (quantia >= 100) {
					cedula100 = (int)(quantia/100);
					quantia = quantia-cedula100*100;
					JOptionPane.showMessageDialog(null, "Receberá "+cedula100+" de R$100");
				}if (quantia >= 50) {
					cedula50 = (int)(quantia/50);
					quantia = quantia-cedula50*50;
					JOptionPane.showMessageDialog(null, "Receberá "+cedula50+" de R$50");
				}if (quantia >= 10) {
					cedula10 = (int)(quantia/10);
					quantia = quantia-cedula10*10;
					JOptionPane.showMessageDialog(null, "Receberá "+cedula10+" de R$10");
				}
			}else 
			JOptionPane.showMessageDialog(null, "Não temos notas que contemplem esse valor de saque");
			
		}
		if (tipoSaque == opcaoSaque[2]) {
			if (quantia%2 == 0) {
				if (quantia >= 50) {
					cedula50 = (int)(quantia/50);
					quantia = quantia-cedula50*50;
					JOptionPane.showMessageDialog(null, "Receberá "+cedula50+" de R$50");
				}if (quantia >= 10) {
					cedula10 = (int)(quantia/10);
					quantia = quantia-cedula10*10;
					JOptionPane.showMessageDialog(null, "Receberá "+cedula10+" de R$10");
				}if (quantia >= 2) {
					cedula2 = (int)(quantia/2);
					quantia = quantia-cedula2*2;
					JOptionPane.showMessageDialog(null, "Receberá "+cedula2+" de R$2");
				}
			}else 
			JOptionPane.showMessageDialog(null, "Não temos notas que contemplem esse valor de saque");
			
		}
	}
}




