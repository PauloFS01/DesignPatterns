package observer;

import builder.NotaFiscal;

public class MultiplicaValor implements AposGerarNota{
	private double fator;
	
	public MultiplicaValor(double fator) {
		this.fator = fator;
	}

	@Override
	public void executa(NotaFiscal notaFiscal) {
		System.out.println(notaFiscal.getValorBruto() * fator);
		
	}

}
