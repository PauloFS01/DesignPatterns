package strategy_2;

public class Arrojado implements Estrategia{

	@Override
	public double retornaInvestimento(double valor) {
		// TODO Auto-generated method stub
		return (verificaRetorno())?0.06:0.3;
	}
	private boolean verificaRetorno() {
		 return new java.util.Random().nextDouble() > 0.5;
	}
}

/*
int chute = random.nextInt(10);
if(chute >= 0 && chute <= 1) return conta.getSaldo() * 0.5;
else if (chute >= 2 && chute <= 4) return conta.getSaldo() * 0.3;
else return conta.getSaldo() * 0.006;
*/