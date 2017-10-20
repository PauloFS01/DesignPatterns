package chainofresponsibility;

public class SemDesconto implements Desconto{

	@Override
	public double calculaDesconto(Orcamento orcamento) {

		return 0;
	}

	@Override
	public void proximoDesconto(Desconto proximo) {
		// TODO Auto-generated method stub
		
	}

}
