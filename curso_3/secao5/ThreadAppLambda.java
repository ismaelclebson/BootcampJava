package secao5;

public class ThreadAppLambda {

	public static void main(String[] args) {

		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				for (int i=0;i<=1000;i++)
					System.out.println(i);
				
			}
		};
		new Thread(r).start();

	}

}
