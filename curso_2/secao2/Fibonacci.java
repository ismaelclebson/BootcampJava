package secao2_2;

import javax.swing.JOptionPane;

public class Fibonacci {

	public static void main(String[] args) {
		int n, atual, anterior_2, anterior_1, soma;
		
		anterior_2 = 1;
		anterior_1 = 1;
		atual = anterior_1 + anterior_2;
		soma = anterior_1 + anterior_2+atual;
		System.out.print(anterior_1+","+anterior_2+","+atual);
		
		
		for(n=4;n<=20;n++){
			
			anterior_1 = anterior_2;
			anterior_2 = atual;
			atual = anterior_1+anterior_2;
			soma = soma + atual;

			System.out.println(atual+",");
			//System.out.println(atual);
			//n--;
		}
		double media = soma/20;
		JOptionPane.showMessageDialog(null, "Media da soma dos termos da série="+soma);;

		JOptionPane.showMessageDialog(null, "Media da soma dos termos da série="+media);;

	}

}
