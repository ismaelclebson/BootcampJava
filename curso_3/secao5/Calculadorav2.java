package secao5;

public class Calculadorav2 {

	public static void main(String[] args) {
		
		Calculadorav2 obj = new Calculadorav2();
		IMath somar = (a,b)-> a+b;
		IMath subtrair = (a,b)-> a-b;
		IMath multiplicar = (a,b)-> a*b;
		IMath dividir = (a,b)-> a/b;
		IMath exponenciacao = (a,b)-> Math.pow(a, b);
		IMath radiciacao = (a,b)-> Math.pow(a, 1/b);
		
		System.out.println(obj.execOperecao(5, 3, somar));
		System.out.println(obj.execOperecao(5, 3, subtrair));
		System.out.println(obj.execOperecao(5, 3, multiplicar));
		System.out.println(obj.execOperecao(5, 3, dividir));
		System.out.println(obj.execOperecao(5, 3, exponenciacao));
		System.out.println(obj.execOperecao(5, 3, radiciacao));
	}

	public double execOperecao(double a, double b, IMath op) {
		return op.operacao(a, b);
	}
}
