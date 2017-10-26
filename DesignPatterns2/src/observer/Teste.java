package observer;

import builder.ItemNota;
import builder.NotaFiscal;
import facade_singleton.Facade;

public class Teste {

	public static void main(String[] args) {
		Facade facade = new Facade();

		NotaFiscal notaFiscal = facade.retornaNotaFiscal();
		
		

	}
}
