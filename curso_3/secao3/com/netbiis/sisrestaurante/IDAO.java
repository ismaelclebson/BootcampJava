package secao3.com.netbiis.sisrestaurante;

import java.util.LinkedHashSet;

public interface IDAO<T> {
 public void gravarCliente(T entidade);
 //public void gravarProduto(T entidade[]);
 public void gravarPedido(T entidade);
 public void gravarProduto(LinkedHashSet<Produto> listaProdutos);

}
