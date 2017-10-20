package templatemethod;

import strategy.Orcamento;

public class IKCV extends TemplateDeImpostoCondiciona{

	@Override
	public boolean tipoTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500 && temItemMaiorQue100ReaisNo(orcamento);
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.1;
	}

	@Override
	public double taxacaoMinima(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}
	private boolean temItemMaiorQue100ReaisNo( Orcamento orcamento){
		return orcamento.getValor() > 100.0;
	}
	

}
