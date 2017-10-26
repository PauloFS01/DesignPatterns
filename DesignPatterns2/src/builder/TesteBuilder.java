package builder;

public class TesteBuilder {
	public static void main(String[] args) {
		NotaFiscalBuilder builder = new NotaFiscalBuilder();
		

		
		//usando encadeamento de métodos
		NotaFiscal nota = builder.paraEmpresa("Empresa fictícia")
		.comCnpj("0093.0939.3939-39!")
		.comItem(new ItemNota("Item teste",123.0))
		.comObservacoes("Nota a titulo de teste")
		.constroi();
		
		 new ImprimeNota(nota).imprime();

	}

}