package chainofresponsibility;

public class DescontoMaisDecincoItens implements Desconto {
	private Desconto proximo;

	@Override
	public double calculaDesconto(Orcamento orcamento) {
        if(orcamento.getItens().size() > 5) {
            return orcamento.getValor() * 0.1;
          }
          else {
            return proximo.calculaDesconto(orcamento);
          }
	}

	@Override
	public void proximoDesconto(Desconto proximo) {
		this.proximo = proximo;
		
	}

}
