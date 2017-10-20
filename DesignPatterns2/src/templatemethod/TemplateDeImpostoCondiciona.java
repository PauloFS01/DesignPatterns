package templatemethod;

import strategy.Imposto;
import strategy.Orcamento;

public abstract class TemplateDeImpostoCondiciona implements Imposto {
	
	@Override
	public double getValor(Orcamento orcamento) {
		if(tipoTaxacao(orcamento)) {
			return maximaTaxacao(orcamento);
		}else {
			return taxacaoMinima(orcamento);
		}
	}

	public abstract boolean tipoTaxacao(Orcamento orcamento);
	public abstract double  maximaTaxacao(Orcamento orcamento);
	public abstract double  taxacaoMinima(Orcamento orcamento);

}
