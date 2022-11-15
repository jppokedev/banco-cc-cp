package entities;

public class ContaPoupaca extends Conta {

	public ContaPoupaca(Double saldo, Integer numConta, String nome) {
		super(saldo, numConta, nome);
	}
	
	@Override
	public Boolean saque(Double valor) {
		Double valorASaque = valor + 0.1;
		return super.saque(valorASaque);
	}

	@Override
	public void deposite(Double valor) {
		super.saldo += valor;
		
	}
	
}
