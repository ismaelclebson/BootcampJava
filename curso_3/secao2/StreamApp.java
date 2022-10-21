package secao2;

import java.io.FileInputStream;

public class StreamApp {
	
	public static void byteStream() throws Exception {
		FileInputStream entrada = new FileInputStream("C:\\Users\\Clebson\\eclipse-workspace\\Bootcampjava_curso3\\src\\secao2\\dados.txt");
		int contador = 0;
		while(entrada.read() != -1)
			contador++;
		System.out.println("Numero de caracteres é "+contador);
		entrada.close();
	}
	
	public static void  caracterStream(char letra) throws Exception {
		FileInputStream entrada = new FileInputStream("C:\\Users\\Clebson\\eclipse-workspace\\Bootcampjava_curso3\\src\\secao2\\dados.txt");
		int contador = 0;
		int c;
		while((c = entrada.read()) != -1) {
			if (c == letra)
				contador++;
		}
			
		System.out.println("Numero de vezes que a letra informada foi encontrada é "+contador);
		entrada.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//byteStream();
			System.out.println("Informar a letra a ser encontrada");
			char letra = (char)System.in.read();
			caracterStream(letra);
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
