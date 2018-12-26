package br.com.caelum.financas.teste;

import javax.persistence.EntityManager;

import br.com.caelum.financas.Util.JPAUtil;
import br.com.caelum.financas.modelo.Conta;

public class TestaBuscaNoBanco {
	
	public static void main(String[] args) {
		
		
		
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		
		Conta conta = em.find(Conta.class, 1);
		System.out.println("O titular da conta é " + conta.getTitular());
		System.out.println("A agencia da conta é " + conta.getAgencia());
		
		
		em.getTransaction().commit();
			
		
		
		
	}
	
}
