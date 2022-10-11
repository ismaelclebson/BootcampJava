package secao3_2.sisalucar;

public class Carro {

	int idCarro;
	String placa;
	String fabricante;
	String modelo;
	int ano;
	String cor;
	float valorDiaria;
	
	
	public Carro(int idCarro, String placa, String fabricante, String modelo, int ano, String cor, float valorDiaria) {
		super();
		this.idCarro = idCarro;
		this.placa = placa;
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.ano = ano;
		this.cor = cor;
		this.valorDiaria = valorDiaria;
	}
	
	public Carro(){
		
	}
	
	public static void main(String[] args) {
		
		Carro carro1 = new Carro(1, "AVC-001", "volkswagen", "luxo", 2001, "preto", 99.90f);
		
		System.out.println(carro1.ano);

	}
	
}
