package secao2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Formatter;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ScannerAppv2 {

	public static void main(String[] args) {
	
		try {
				
			Scanner	entrada = new Scanner(new FileReader("C:\\Users\\Clebson\\eclipse-workspace\\Bootcampjava_curso3\\src\\secao2\\numero.txt"));
			double soma = 0;
			String valor;
			while(entrada.hasNext()) { // enquanto tiver elemento no arquivo
				valor = entrada.next();
				soma = soma + Double.parseDouble(valor);
			}
			entrada.close();
			JOptionPane.showMessageDialog(null, "A soma dos valores é "+soma);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
