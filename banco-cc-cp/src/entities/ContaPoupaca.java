package entities;

import exceptions.SaldoExceptions;

public class ContaPoupaca extends Conta {

	public ContaPoupaca(Double saldo, Integer numConta, String nome) {
		super(saldo, numConta, nome);
	}
	
	@Override
	public void saque(Double valor) throws SaldoExceptions {
		Double valorASaque = valor + 0.1;
		super.saque(valorASaque);
	}

	@Override
	public void deposite(Double valor) {
		super.saldo += valor;
		
	}
	
}
