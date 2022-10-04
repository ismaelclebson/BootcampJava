package desafio_4;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Q1 {

	public static void main(String[] args){
		int i,j,maior, menor;
		
		Scanner teclado = new Scanner(System.in);
		int I[][] = new int[3][3];
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
	
				I[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira numero"));
				
			}
		}
		teclado.close();
		
		maior = I[0][0];
		menor = I[0][0];
		
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++)
			{
				if (I[i][j] > maior) {
					maior = I[i][j];
				}else if(I[i][j] < menor){
					menor = I[i][j];
				}
			}
		}JOptionPane.showMessageDialog(null, "O menor numero é "+menor+" o maior numero é "+maior);
		
	}

}
