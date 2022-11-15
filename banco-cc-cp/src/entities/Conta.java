package entities;

public class Conta {

	private String nome;
	private Double saldo = 0.0;
	private Integer numConta;
	private static Integer total = 0;
	
	public Conta(Double saldo, Integer numConta, String nome) {
		Conta.total++;
		System.out.println("O total de contas e " + Conta.total);
		this.numConta = numConta;
		this.nome = nome;
		this.saldo = saldo;
		
	}
	
	public void deposite(Double valor) {
		this.saldo += valor;
	}
	
	public Boolean saque (Double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}else {
			return false;
		}
	}	
	
	public Boolean tranferir (Double valor, Conta destino) {
		if (this.saque(valor)){
			destino.deposite(valor);
			return true;
		}else {
			return false;
		}
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
