package secao4;

import javax.swing.JOptionPane;

public class FuncaoSeno {

	public static void main(String[] args) {
		double senx,x;
		x = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de n:"));
		senx = 0;
		for (int i=1, n=1;i<=2;i++) {
			if (i%2==0){			
				senx = senx+(Math.pow(x, n))/n;	
			}else{
				senx = senx-(Math.pow(x, n))/n;
			}
			n += 2;	
		}
		JOptionPane.showMessageDialog(null, senx);
	}

}
