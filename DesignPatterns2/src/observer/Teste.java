package observer;

import builder.NotaFiscal;
import builder.ItemNota;

public class Teste {

	public static void main(String[] args) {

		NotaFiscalBuilder builder = new NotaFiscalBuilder(new SalvaNoBanco(), new EnviaPorEmail(),
				new MultiplicaValor(3));

		NotaFiscal notaFiscal = builder.paraEmpresa("PFS Corp").comCnpj("293.3389.394/0003-37")
				.comItem(new ItemNota("item 1", 127.30)).comObservacoes("Nada a declarar").constroi();

	}
}
