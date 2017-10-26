package strategy_2;

import facade_singleton.Facade;

public class Teste {
	public static void main(String[] args) {
		Facade facade = new Facade();
		Conta conta = facade.retornaConta();
		conta.setSaldo(12.3);
		System.out.println(conta.getSaldo());
		
	//	Estrategia  estrategia = facade.retornaArrojado();
		Estrategia  estrategia = facade.retornaConservador();
		
		RealizadorDeInvestimentos realiza = new RealizadorDeInvestimentos(conta, estrategia);
		System.out.println(conta.getSaldo());

	}

}
