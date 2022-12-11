package entities;

import exceptions.SaldoExceptions;

public class ContaCorrente extends Conta implements Tributavel {	
	
	public ContaCorrente(Double saldo, Integer numConta, String nome) {
		super(saldo, numConta, nome);
	}
	
	@Override
	public void saque(Double valor) throws SaldoExceptions {
		Double valorASaque = valor + 0.2;
		super.saque(valorASaque);
	}

	@Override
	public void deposite(Double valor) {
		super.saldo += valor;
		
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
	
}
