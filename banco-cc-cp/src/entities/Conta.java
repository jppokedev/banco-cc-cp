package entities;

import exceptions.SaldoExceptions;

public abstract class Conta {
	
	protected Double saldo = 0.0;
	private String nome;
	private Integer numConta;
	private static Integer total = 0;
	
	public Conta(Double saldo, Integer numConta, String nome) {
		Conta.total++;
		System.out.println("O total de contas e " + Conta.total);
		this.numConta = numConta;
		this.nome = nome;
		this.saldo = saldo;
		
	}
	
	public abstract void deposite(Double valor);
	
	public void saque (Double valor) throws SaldoExceptions {
		if(this.saldo < valor) {
			throw new SaldoExceptions("SALDO INSUFICIENTE. Saldo atual e de: "+ this.getSaldo() + " Valor que foi tentado sacar e de: "+ valor);
		}
	}
	
	public void tranferir (Double valor, Conta destino) throws SaldoExceptions {
		this.saque(valor);
		destino.deposite(valor);
	}
		
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	public Integer getNumConta() {
		return numConta;
	}
	public void setNumConta(Integer numConta) {
		this.numConta = numConta;
	}
	
	
}
