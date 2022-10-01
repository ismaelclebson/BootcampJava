package desafio_4;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) throws IOException {

        FileWriter arqAprovados = new FileWriter("aprovados.txt");
        PrintWriter gravaarqAprovados = new PrintWriter(arqAprovados);
        gravaarqAprovados.println("===========Aprovados============");
        gravaarqAprovados.println("================================");
        gravaarqAprovados.println("Nome || Média");

        FileWriter arqReprovados = new FileWriter("reprovados.txt");
        PrintWriter gravaarqReprovados = new PrintWriter(arqReprovados);
        gravaarqReprovados.println("==========Reprovados============");
        gravaarqReprovados.println("================================");
        gravaarqReprovados.println("Nome || Média");

        Scanner teclado = new Scanner(System.in);

        int freq;
        double media = 0;
        String[] nomes = new String[5];
        double[][] notas = new double[5][4];

        for (int i = 0; i < 5; i++){

            System.out.printf("Insira o nome do aluno: %n");
            nomes[i] = teclado.nextLine();

            for (int j = 0; j < 4; j++){
                System.out.println("Insira a "+(j+1)+"º nota do aluno "+nomes[i]);
                notas[i][j] = teclado.nextDouble();
                media += notas[i][j];
            }

            System.out.println("Insira a frequência do aluno" +nomes[i]);
            freq = teclado.nextInt();
            teclado.nextLine();
            media = media/4;
            if (media >= 7 && freq >= 75){
                gravaarqAprovados.println("================================");
                gravaarqAprovados.print(nomes[i]+" || ");
                gravaarqAprovados.print(media);
                gravaarqAprovados.println("================================");
            }
            else {
                gravaarqReprovados.println("================================");
                gravaarqReprovados.print(nomes[i]+" || ");
                gravaarqReprovados.print(media);
                System.out.println();
                gravaarqReprovados.println("================================");
            }
            media = 0; //Para reiniciar a media a zero para o calculo do proximo aluno
        }
        System.out.println("Arquivos com nomes de aprovados e reprovados salvo");
        teclado.close();
        arqAprovados.close();
        arqReprovados.close();
        gravaarqAprovados.close();
        gravaarqReprovados.close();
    }
}
