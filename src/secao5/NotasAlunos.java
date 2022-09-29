package secao5;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class NotasAlunos {

	public static void main(String[] args) {
		
		int i,j,aprovados=0,reprovados=0;
		double soma=0,media=0;
		String nome;
		String listaAlunos[] = new String[5];
		boolean situacaoAlunos[] = new boolean[5];
		double notasAlunos[][] = new double[5][4];
		
		Scanner teclado = new Scanner(System.in);		

		for(i=0;i<5;i++)
		{
			nome = JOptionPane.showInputDialog("Digite o nome do Aluno");
			listaAlunos[i] = nome;
			
			for(j=0;j<4;j++)
			{
				System.out.println("Favor informar a nota do aluno");
				notasAlunos[i][j] = teclado.nextDouble();
				soma = soma + notasAlunos[i][j];
			}
			media = soma/4;
			if(media < 5)
				situacaoAlunos[i] = false;
			else
				situacaoAlunos[i] = true;
			soma = 0;
		}
		for(i=0;i<5;i++)
		{
			if(situacaoAlunos[i])
				aprovados++;
			else
				reprovados++;
		}
		System.out.println("Aprovados="+aprovados);
		System.out.println("Reprovados="+reprovados);
		
		teclado.close();
	}

}
