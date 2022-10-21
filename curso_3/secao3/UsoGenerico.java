package secao3;

public class UsoGenerico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExemploGenerics<Integer> iob = new ExemploGenerics<>(88);
		iob.showType();
		
		ExemploGenerics<String> sob = new ExemploGenerics<>("Clebson");
		sob.showType();
	}

}
