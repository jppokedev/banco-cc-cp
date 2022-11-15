package application;

import entities.ContaCorrente;
import entities.ContaPoupaca;

public class Banco {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(0.0, 111, "Armando");
		cc.deposite(200.0);
		
		ContaPoupaca cp = new ContaPoupaca(0.0, 222, "Armando");
		cp.deposite(300.0);
		
		cc.tranferir(25.0, cp);
		
		System.out.println("Valor conta corrente: " + cc.getSaldo());
		System.out.println("Valor conta poupança: " + cp.getSaldo());
		

	}

}
