package observer;

import builder.NotaFiscal;

public class SalvaNoBanco implements AposGerarNota {

	@Override
	public void executa(NotaFiscal notaFiscal) {
		System.out.println("Salvando Nota");
		
	}

}
