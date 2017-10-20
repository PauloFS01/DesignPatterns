package chainofresponsibility;

public class DescontoMaisDeQuinhentos implements Desconto{

	private Desconto proximo;
	
	@Override
	public double calculaDesconto(Orcamento orcamento) {
		if(orcamento.getValor() > 500) {
			return orcamento.getValor() * 0.07;
		}
		return 0;
	}

	@Override
	public void proximoDesconto(Desconto proximo) {
		this.proximo = proximo;
		
	}

}
