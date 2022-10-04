package secao2_2;

import javax.swing.JOptionPane;

public class FaturamentoTrimestral {

	public static void main(String[] args) {
		//int vendasJaneiro=15000, vendasFevereiro=23000, vendasMarco=17000;
		
		
		int vendasJaneiro=Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o faturamento do mes de Janeiro"));
		int vendasFevereiro=Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o faturamento do mes de Fevereiro"));
		int vendasMarco=Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o faturamento do mes de Março"));
		
		int faturamentoTrimestral = vendasJaneiro + vendasFevereiro + vendasMarco;
		
		JOptionPane.showMessageDialog(null, "Resultado do Faturamento Trimestral:"+faturamentoTrimestral);

	}

}
