package chainofresponsibility;

public interface Desconto {
	
	
	double calculaDesconto(Orcamento orcamento);
	public void proximoDesconto(Desconto proximo);

}
