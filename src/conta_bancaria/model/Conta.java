package conta_bancaria.model;

import java.text.NumberFormat;

public class Conta {

	// atributos da classe
	private int numero, agencia, tipo;
	private String titular;
	private float saldo;
	
	//método construtor
	public Conta(int numero, int agencia, int tipo, String titular, float saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.tipo = tipo;
		this.titular = titular;
		this.saldo = saldo;
	}

	//	método get set
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	// Métodos Bancários
	public boolean sacar(float valor) {
		if (this.saldo < valor) {
			System.out.println("\nSaldo é insuficiente");
			return false;
		}

		this.saldo -= valor;
		return true;
	}

	public void depositar(float valor) {
		this.saldo += valor;
	}
	
	//Método para visualizar
	public void visualizar() {
		
		NumberFormat nfMoeda = NumberFormat.getCurrencyInstance();
		
		String tipo = "";
		
		switch(this.tipo) {
		case 1 -> tipo = "Conta Corrente";
		case 2 -> tipo = "Conta Poupança";
		default -> tipo = "Inválido";
		}
		
		
		
		
		System.out.println("*****************************************************");
		System.out.println("\t\tDADOS DA CONTA                           ");
		System.out.println("*****************************************************");
		System.out.println("\tNúmero da conta: " + this.numero + "                           ");
		System.out.println("\tNúmero da agencia: " + this.agencia + "\t\t");
		System.out.println("\tNúmero da conta: " + tipo);
		System.out.println("\tNúmero da titular: " + this.titular);
		System.out.println("\tSaldo da Conta:  " + this.saldo);

		
	}
	

}
