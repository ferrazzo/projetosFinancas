package br.com.caelum.financas.teste;


import javax.persistence.EntityManager;

import br.com.caelum.financas.Util.JPAUtil;
import br.com.caelum.financas.modelo.Conta;

public class TestePaulo {
	
	public static void main(String[] args) {
		
		Conta contaTeste = new Conta("Lucas", "Santander", "765", "924");
		Conta contaTeste2 = new Conta("Evandro", "Santander", "765", "926");
		
		
		EntityManager em = new JPAUtil().getEntityManager();
		
		em.getTransaction().begin();
		
		
		em.persist(contaTeste);
		
		em.persist(contaTeste2);
		contaTeste.deposita(1000);
		contaTeste.transfere(500, contaTeste2);
		
		em.getTransaction().commit();
		
		
		em.close();
		

	}
}
