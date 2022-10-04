package secao5;

import javax.swing.JOptionPane;

public class Aluno {

	public static void main(String[] args) {
		
		int i;
		String nome;
		String listaAlunos[] = new String[5];
	
		for(i=0;i<5;i++){
			nome = JOptionPane.showInputDialog("Digite o nome do Aluno");
			listaAlunos[i] = nome;			
		}
		
		String nomes = "";
		for(i=0;i<5;i++){
			nomes = nomes + listaAlunos[i] + "\n";		
		}JOptionPane.showConfirmDialog(null, nomes);
	}

}
