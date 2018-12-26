package br.com.caelum.financas.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Conta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String titular;
	private String banco;
	private String agencia;
	private String numero;
	private double saldo;

	
	
	public Conta (String titular, String banco, String agencia, String numero) {

		this.titular = titular;
		this.banco = banco;
		this.agencia = agencia;
		this.numero = numero;
		
		System.out.println("Conta criada com sucesso!");
		System.out.println(this.titular);
		System.out.println(this.banco);
		System.out.println(this.numero);
		
	}
	

	public double deposita(double valor) {
		System.out.println("Depósito realizado com sucesso");
		return this.saldo = valor;
	}

	public boolean saca(double valor) {
		if (valor <= this.saldo) {
		this.saldo =- valor;
		System.out.println("Saque realizado com sucesso");
		return true;
		}else {
			System.out.println("Saldo insuficiente");
			return false;
		}
	}

	public boolean transfere(double valor, Conta contaDestino) {
		if (valor >= 0) {
			this.saldo -= valor;
			contaDestino.deposita(valor);
			System.out.println("Transferência realizada com sucesso na conta " + this.titular);
			return true;
		} else
			return false;
	}

	public void getSaldo() {
		System.out.println("O saldo da conta é " + this.saldo);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

}
