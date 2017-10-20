package observer;

import builder.NotaFiscal;

public class EnviaPorSms implements AposGerarNota{

	@Override
	public void executa(NotaFiscal notaFiscal) {
		System.out.println("Enviando por SMS");
	}
	

}
