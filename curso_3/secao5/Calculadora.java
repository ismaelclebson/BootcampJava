package secao5;

public class Calculadora implements Formula{

	public static void main(String[] args) {
		IMatematica obj = new IMatematica() {
			
			@Override
			public int subtrair(int a, int b) {
				// TODO Auto-generated method stub
				return (a+b);
			}
			
			@Override
			public int somar(int a, int b) {
				// TODO Auto-generated method stub
				return (a-b);
			}
			
			@Override
			public int multiplicar(int a, int b) {
				// TODO Auto-generated method stub
				return (a*b);
			}
			
			@Override
			public int dividir(int a, int b){
				return (a/b);
			}

			@Override
			public double exponenciacao(double a, double b) {
				// TODO Auto-generated method stub
				return Math.pow(a, b);
			}

			@Override
			public double radiciacao(double a, double b) {
				// TODO Auto-generated method stub
				return Math.pow(a, 1/b);
			}
		};
		
		System.out.println(obj.getClass());
		System.out.println(obj.somar(5, 5));
		System.out.println(obj.subtrair(8, 3));
		System.out.println(obj.multiplicar(9, 6));
		System.out.println(obj.dividir(30, 5));
		System.out.println(obj.exponenciacao(3, 5));
		System.out.println(obj.radiciacao(30, 5));

	}

	@Override
	public double calcular() {
		// TODO Auto-generated method stub
		return 0;
	}

}
