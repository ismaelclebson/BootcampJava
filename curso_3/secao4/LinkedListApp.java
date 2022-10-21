package secao4;

import java.util.LinkedList;

public class LinkedListApp {
	
	public static void main(String[] args) {

		LinkedList<String> lista = new LinkedList<>();
		lista.add("Vermelho");
		lista.add("Verde");
		lista.add("Verde");
		lista.add("Amarelo");
		lista.removeFirst();
		lista.removeLast();
		System.out.println(lista);
	}


}
