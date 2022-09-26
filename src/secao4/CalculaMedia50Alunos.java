package secao4;

import java.util.Scanner;

public class CalculaMedia50Alunos {

	public static void main(String[] args) {
		int i, cont=0;
		double nota1, nota2, nota3, nota4, media, mediaTotal=0, total=0;
		Scanner teclado = new Scanner(System.in);
		
		for (i=1;i<=5;i++) {
			
			System.out.println("Favor informar nota 1");
			nota1 = teclado.nextDouble();
			System.out.println("Favor informar nota 2");
			nota2 = teclado.nextDouble();
			System.out.println("Favor informar nota 3");
			nota3 = teclado.nextDouble();
			System.out.println("Favor informar nota 4");
			nota4 = teclado.nextDouble();
			System.out.println("Adicione as notas do próximo aluno: ");
			cont = cont + 1;
			media = (nota1+nota2+nota3+nota4)/4;
			System.out.println("A média do aluno "+i+" é "+media);
			total = total+media;
		}
		mediaTotal = total/cont;
		System.out.println("A média da nota dos 5 alunos é "+mediaTotal);
		teclado.close();
	}

}
