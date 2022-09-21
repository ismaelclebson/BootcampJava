package secao2;

import javax.swing.JOptionPane;

public class JantarPlus {
	
	public static void main(String args[]) {

		float valorConta = Float.parseFloat(JOptionPane.showInputDialog("Insira o valor da conta:"));
		Object[] taxas = { "15", "18", "22"};
		Object taxa = JOptionPane.showInputDialog(null,
				"Escolha qual tava deseja pagar:", "Taxas",
				JOptionPane.INFORMATION_MESSAGE, null,
				taxas, taxas[0]);
		
	    float taxaGarcom = (valorConta*(Float.parseFloat((String)taxa)))/100;
	    float totalaPagar = valorConta + taxaGarcom;
	    JOptionPane.showMessageDialog(null, "A taxa do garçom é R$"+ taxaGarcom);
	    JOptionPane.showMessageDialog(null, "O valor total do jantar a ser pago é de R$"+totalaPagar);

	  } 

}


