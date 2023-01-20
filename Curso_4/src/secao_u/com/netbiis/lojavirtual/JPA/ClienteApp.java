package secao_u.com.netbiis.lojavirtual.JPA;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class ClienteApp {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaApp"); 
		EntityManager em = emf.createEntityManager(); 
		EntityTransaction tx = em.getTransaction(); 

		tx.begin();

		Cliente cliente = em.find(Cliente.class,"000.000.000-00");
		cliente.setEmail("oque@gmail.com");
		/**/

		
		TypedQuery<Cliente> clienteQuery = em.createQuery("from Cliente", Cliente.class);
        List<Cliente> clientes = clienteQuery.getResultList();
        clientes.forEach(System.out::println);
        
        
        Cliente antonio = new Cliente("570.618.272-80","antogno Thyago Ronald", "thyagoronald@gmail.com");
		
        /* deletar cliente
		Cliente cli = em.find(Cliente.class, "570.618.272-99");
		System.out.println(cli);

        em.remove(cli); //retorna erro :/
        /**/
    	
    	tx.commit();
    	
		
	}

}