package templatemethod;

import strategy.Imposto;
import strategy.Orcamento;

public abstract class TemplateDeImpostoCondiciona implements Imposto {
	
	@Override
	public double getValor(Orcamento orcamento) {	
		return (tipoTaxacao(orcamento))?maximaTaxacao(orcamento)
				:taxacaoMinima(orcamento);
		
	}

	public abstract boolean tipoTaxacao(Orcamento orcamento);
	public abstract double  maximaTaxacao(Orcamento orcamento);
	public abstract double  taxacaoMinima(Orcamento orcamento);

}
