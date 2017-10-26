package builder;

public class TesteBuilder {
	public static void main(String[] args) {
		NotaFiscalBuilder builder = new NotaFiscalBuilder();
		

		
		//usando encadeamento de m�todos
		NotaFiscal nota = builder.paraEmpresa("Empresa fict�cia")
		.comCnpj("0093.0939.3939-39!")
		.comItem(new ItemNota("Item teste",123.0))
		.comObservacoes("Nota a titulo de teste")
		.constroi();
		
		 new ImprimeNota(nota).imprime();

	}

}