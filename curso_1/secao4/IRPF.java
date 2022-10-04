package secao4;

import javax.swing.JOptionPane;

public class IRPF {

	public static void main(String[] args) {
		
		double imposto, renda, salarioLiquido;
		int numeroDependentes, numeroContribuintes = 1;
		String numeroCpf, nome;
		
		while(numeroContribuintes != -1)
		{
			nome = JOptionPane.showInputDialog("Digite o seu Nome");
			numeroCpf = JOptionPane.showInputDialog("Digite o seu Cpf");
			numeroDependentes = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero de dependentes"));
			renda = Double.parseDouble(JOptionPane.showInputDialog("Digite o sua renda mensal"));
			 
			salarioLiquido = renda - (numeroDependentes*189.59) - 0.11*renda;
			
			if (salarioLiquido <= 1903.98)
			{
				imposto = 0;
				JOptionPane.showMessageDialog(null, "O contribuinte "+nome+" é isento!");
			}
			else if (salarioLiquido <= 2826.65)
			{
				imposto = 0.075*salarioLiquido - 142.80;
				JOptionPane.showMessageDialog(null, "O IRPF do contribuinte "+nome+"e de R$"+imposto);
			}
			else if (salarioLiquido <= 3751.05)
			{
				imposto = 0.15*salarioLiquido - 354.80;
				JOptionPane.showMessageDialog(null, "O IRPF do contribuinte "+nome+" e de R$"+imposto);
			}
			else if (salarioLiquido <= 4664.68)
			{
				imposto = 0.225*salarioLiquido - 636.13;
				JOptionPane.showMessageDialog(null, "O IRPF do contribuinte "+nome+" e de R$"+imposto);
			}
			else if (salarioLiquido > 4664.68)
			{
				imposto = 0.275*salarioLiquido - 869.36;
				JOptionPane.showMessageDialog(null, "O IRPF do contribuinte "+nome+" e de R$"+imposto);
			}			
		}
	}

}
