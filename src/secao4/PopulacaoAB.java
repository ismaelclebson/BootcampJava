package secao4;

public class PopulacaoAB {

	public static void main(String[] args) {
		
		final double habitantesA = 5000000;
		final double habitantesB = 7000000;
		final double txA = 0.03;
		final double txB = 0.02;
		
		int temp = 0;
		double populacaoA = habitantesA;
		double populacaoB = habitantesB;
		
		
		do {
			populacaoB = populacaoB + populacaoB*txB;
			populacaoA = populacaoA + populacaoA*txA;
			temp++;
		}while(populacaoB >= populacaoA);
		
		System.out.println("A populacao de A levarah "+temp+" anos para superar a populacao de B");

	}

}
