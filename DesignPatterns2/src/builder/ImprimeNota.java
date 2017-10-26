package builder;

import java.util.List;

public class ImprimeNota {
	NotaFiscal nota;
	
	public ImprimeNota(NotaFiscal nota) {
		this.nota = nota;
	}
	
	public void imprime() {
		
		System.out.println(nota.getRazaoSocial() 
				+ "\nData de emissao: " +  nota.getDataDeEmissao().getTime() 
				+ "\nValor: " +  nota.getValorBruto());
		itera(nota.itens);
		
	}
	
	
	public void itera(List<ItemNota> item) {
		nota.itens.forEach(i -> System.out.println("Descricao: "  + i.getDescricao() 
				+ "\nValor: " + i.getValor()));
	}

}
