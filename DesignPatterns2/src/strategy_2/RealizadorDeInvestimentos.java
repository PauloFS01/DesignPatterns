package strategy_2;

public class RealizadorDeInvestimentos {
	public RealizadorDeInvestimentos(Conta conta, Estrategia estrategia) {
		conta.setSaldo(estrategia.retornaInvestimento(conta.getSaldo() * 0.75));
	}

}
