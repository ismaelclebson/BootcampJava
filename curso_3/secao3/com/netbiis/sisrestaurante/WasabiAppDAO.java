package secao3.com.netbiis.sisrestaurante;

import java.util.LinkedHashSet;

public class WasabiAppDAO<T> implements IDAO<T> {

	@Override
	public void gravarCliente(T entidade) {
		System.out.println("Gravando"+entidade.toString());
		
	}

	@Override
	public void gravarProduto(LinkedHashSet<Produto> listaProdutos) {
		System.out.println("Gravando"+listaProdutos);
		
	}

	@Override
	public void gravarPedido(T entidade) {
		System.out.println("Gravando"+entidade);
		
	}

}
