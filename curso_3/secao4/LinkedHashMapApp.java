package secao4;

import java.util.LinkedHashMap;

public class LinkedHashMapApp {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, String> mapa = new LinkedHashMap<>();
		
		mapa.put(4, "Clebson");
		mapa.put(2, "Bruno");
		mapa.put(3, "Fernanda");
		mapa.put(3, "Caetano");
		mapa.put(1, "Umberto");
		System.out.println(mapa);
		
		
	}

}
