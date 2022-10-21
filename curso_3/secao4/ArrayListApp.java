package secao4;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListApp {

	public static void main(String[] args) {

		ArrayList<String> lista = new ArrayList<>();
		lista.add("Vermelho");
		lista.add("Verde");
		lista.add("Verde");
		lista.add("Amarelo");
		Collections.sort(lista);
		System.out.println(lista);
	}

}
