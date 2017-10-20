package templatemethod;


import strategy.Orcamento;

public class ICPP extends TemplateDeImpostoCondiciona{

	@Override
	public boolean tipoTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500;
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.07;
	}

	@Override
	public double taxacaoMinima(Orcamento orcamento) {
		return orcamento.getValor() * 0.05;
	}



}
