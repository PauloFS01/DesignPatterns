package state;

import strategy_2.Conta;

public class TestaContas {
	public static void main(String[] args) {
		
		Conta conta = new Conta(400);
		System.out.println(conta.getSaldo());
		
		conta.saca(393);
		System.out.println(conta.getSaldo());
		
		/*		  
		conta.estado.saca(conta, 1);
		System.out.println(conta.getSaldo());  // lança uma RuntimeExeption 		
		*/
		
		conta.deposita(100);
		System.out.println(conta.getSaldo());
	}

}
