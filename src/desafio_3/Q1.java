package desafio_3;

public class Q1 {

	
	public static void main(String[] args) {
		
		String alfabeto = "abcdefghijklmnopqrstuvwxyz";
		char[] letras = alfabeto.toCharArray();
		char[] letrascrip = new char[letras.length];
		//System.out.println(letras.length);
		for (int i = 0; i < letras.length; i++)
			if (letras[i] == 122)
				letrascrip[i] = 97;
			else
				letrascrip[i]=(char) (letras[i]+1);
			
		for (int i = 0; i < letrascrip.length; i++)
			System.out.println(letras[i]+" = "+letrascrip[i]);
		//System.out.println(letras.length);
		//System.out.println(letras);
	}

}
