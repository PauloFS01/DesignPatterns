package observer;

import builder.NotaFiscal;

public class EnviaPorEmail implements AposGerarNota{

	@Override
	public void executa(NotaFiscal notaFiscal) {
		System.out.println("Enviando por e-mail");
	}

}
