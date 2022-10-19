package secao2;

import java.io.FileInputStream;

public class StreamApp {
	
	public static void byteStream() throws Exception {
		FileInputStream entrada = new FileInputStream("C:\\Users\\clebson.silva.REDE\\eclipse-workspace\\Bootcampjava_curso3\\src\\secao2\\dados.txt");
		int contador = 0;
		while(entrada.read() != -1)
			contador++;
		System.out.println("Numero de caracteres é "+contador);
		entrada.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			byteStream();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
