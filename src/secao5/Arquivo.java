package secao5;

import java.io.FileWriter;
import java.io.PrintWriter;

public class Arquivo {

	public static void main(String[] args) throws Exception  {

		String[] nomes ={"Clebson","Ismael","Silva"};
		String[] fones ={"9198822-0909","98899-0005","8887-5746"};
		String[] cidades ={"Belém","Ananindeua","Marituba"};
		
		FileWriter arq = new FileWriter("contatos.txt");
		PrintWriter gravaarq = new PrintWriter(arq);
		
		gravaarq.println("================================");
		gravaarq.println("Nomes || Telefones || Cidades   ");
		for (int i = 0; i < nomes.length; i ++) {
			gravaarq.println("================================");
		    gravaarq.print(nomes[i]+" || ");
		    gravaarq.print(fones[i]+" || ");
		    gravaarq.println(cidades[i]);    
		}
		gravaarq.println("================================");
		arq.close();
		gravaarq.close();
	}

}
