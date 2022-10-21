package secao4;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapApp {

	public static void main(String[] args) {
		
		Map<Integer, String> mapa = new TreeMap<>();
		
		mapa.put(4, "Clebson");
		mapa.put(2, "Bruno");
		mapa.put(3, "Fernanda");
		mapa.put(3, "Caetano");
		mapa.put(1, "Umberto");
		System.out.println(mapa);
		
		
	}

}
