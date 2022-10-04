package secao4;


public class sequencia {

	public static void main(String[] args) {
		int i, n, n9=0, n10=0, n100=0, n10000=0;
		
		n = 1;
		
		for(i=2;i<=10000;i++) {
			n = n+3;
			if (i == 9)
				n9 = n;
			else if (i == 10)
				n10 = n;
			else if (i == 100)
				n100 = n;
			else if (i == 10000)
				n10000 = n;
		}
		System.out.println("S9 = "+n9);
		System.out.println("S10 = "+n10);
		System.out.println("S100 = "+n100);
		System.out.println("S10000 = "+n10000);

	}

}
