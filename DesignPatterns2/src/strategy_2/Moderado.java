package strategy_2;

public class Moderado implements Estrategia{

	@Override
	public double retornaInvestimento(double valor) {
		//(Express�o) ? ValorTrue : ValorFalse
		return (verificaRetorno())?2.5:0.7;
	}
	
	private boolean verificaRetorno() {
		 return new java.util.Random().nextDouble() > 0.5;
	}

}
