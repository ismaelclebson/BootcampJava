package desafio_3;

public class Q2 {

	
	public static void main(String[] args) {
		
		//String alfabeto = "abcdefghijklmnopqrstuvwxyz";
		String alfabeto = "cat";
		char[] letras = alfabeto.toCharArray();
		char[] letrascrip = new char[letras.length];
		int cont=1, i=0;
		//System.out.println(letras.length);
		for (i = 0, cont=1; i < letras.length; i++, cont++)
			if (letras[i]+cont >= 122)
				letrascrip[i] = (char) (letras[i]-25+cont);
			else
				letrascrip[i]=(char) (letras[i]+cont);
			//cont += 1;
		System.out.println(letrascrip);	
		//for (i = 0; i < letrascrip.length; i++)
			//System.out.println(letras[i]+" = "+letrascrip[i]);
		//System.out.println(letras.length);
		//System.out.println(letras);
	}

}
