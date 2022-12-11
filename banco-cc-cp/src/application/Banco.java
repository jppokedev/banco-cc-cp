package application;

import entities.ContaCorrente;
import entities.ContaPoupaca;
import exceptions.SaldoExceptions;

public class Banco {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(0.0, 111, "Armando");
		cc.deposite(200.0);
		
		ContaPoupaca cp = new ContaPoupaca(0.0, 222, "Armando");
		cp.deposite(300.0);
		try {
			cc.tranferir(25.0, cp);
		} catch (SaldoExceptions ex) {
			ex.getMessage();
		}
		
		System.out.println();
		try {
			cp.saque(400.0);
		} catch (SaldoExceptions ex) {
			System.out.println("EX :"+ ex.getMessage());	
		}
		
		System.out.println();
		System.out.println("Valor conta corrente: " + cc.getSaldo());
		System.out.println("Valor conta poupança: " + cp.getSaldo());
		

	}

}
