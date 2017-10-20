package observer;

import builder.NotaFiscal;

public class Imprime implements AposGerarNota{

	@Override
	public void executa(NotaFiscal notaFiscal) {
		System.out.println("Imprimindo nota");
		
	}

}
