package br.com.caelum.financas.teste;

import javax.persistence.EntityManager;
import br.com.caelum.financas.Util.JPAUtil;
import br.com.caelum.financas.modelo.Conta;

public class TesteConta {

	public static void main(String[] args) {
		
		Conta contaAthur = new Conta("Arthur", "Itau", "123", "456");
		
				
		EntityManager em = new JPAUtil().getEntityManager();
		
		em.getTransaction().begin();
		em.persist(contaAthur);
				
		
		em.getTransaction().commit();
		
		
		
		em.close();
		
	}
}
