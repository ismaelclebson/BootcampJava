package secao4;

import java.util.ArrayList;

public class NoteBook {
	
	static ArrayList<String> anotacoes;

	public static void main(String[] args) {

		anotacoes = new ArrayList<>();
		anotacoes.add("Comprar pão");
		anotacoes.add("Vender Carro");
		anotacoes.add("Encontro às 11:30");
		
		long t1 = System.currentTimeMillis();
		for (int i =3; i<1003; i++)
			anotacoes.add("Texto_"+i);
		long t2 = System.currentTimeMillis();
		System.out.println((t2-t1));
		
		System.out.println(anotacoes);

	}

}
