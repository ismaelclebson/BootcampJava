package secao4;

import java.util.HashMap;

public class HashMapApp {

	public static void main(String[] args) {
		
		HashMap<Integer, String> mapa = new HashMap<>();
		
		mapa.put(1, "Clebson");
		mapa.put(2, "Bruno");
		mapa.put(3, "Fernanda");
		mapa.put(3, "Caetano");
		mapa.put(4, "Umberto");
		System.out.println(mapa);
		
		
	}

}
