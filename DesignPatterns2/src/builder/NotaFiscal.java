package builder;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class NotaFiscal {
	String razaoSocial;
	String CNPJ;
	double valorBruto ;
	double impostos;
	Calendar dataDeEmissao;
	String observa�oes;
	List<ItemNota> itens = new ArrayList<>();
	
	public NotaFiscal(String razaoSocial, String cNPJ, double valorBruto, double impostos, Calendar dataDeEmissao,
			String observa�oes, List<ItemNota> itens) {
		super();
		this.razaoSocial = razaoSocial;
		CNPJ = cNPJ;
		this.valorBruto = valorBruto;
		this.impostos = impostos;
		this.dataDeEmissao = dataDeEmissao;
		this.observa�oes = observa�oes;
		this.itens = itens;
	}
	
	public double getValorBruto() {
		return valorBruto;
	}

	
}