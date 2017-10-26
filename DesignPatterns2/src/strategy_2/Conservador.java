package strategy_2;

public class Conservador implements Estrategia {

	@Override
	public double retornaInvestimento(double valor) {		
		return  valor * 0.8;
	}

}
