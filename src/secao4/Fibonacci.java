package secao4;

import javax.swing.JOptionPane;

public class Fibonacci {

	public static void main(String[] args) {
		int n, atual, anterior_2, anterior_1, termo9=0, termo10=0, termo100=0, termo10000=0;
		
		//n = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de n:"));
		anterior_2 = 1;
		anterior_1 = 1;
		atual = 0;
		
		for(n=3;n<=10000;n++){

			atual = anterior_1+anterior_2;
			anterior_1=anterior_2;
			anterior_1=atual;
			if (n==9)
				termo9=atual;
			else if (n==10)
				termo10=atual;
			else if (n==100)
				termo100=atual;
			else if (n==10000)
				termo10000=atual;
				
			//System.out.println(atual);
			//n--;
		}
		JOptionPane.showMessageDialog(null, "termo9="+termo9);
		JOptionPane.showMessageDialog(null, "termo10="+termo10);
		JOptionPane.showMessageDialog(null, "termo100="+termo100);
		JOptionPane.showMessageDialog(null, "termo10000="+termo10000);
	}

}
