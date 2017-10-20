package builder;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class NotaFiscalBuilder {
	
	private String razaoSocial;
    private String cnpj;
    private double valorTotal;
    private double impostos;
    private Calendar data;
    private String observacoes;
    
    public NotaFiscalBuilder() {
        this.data = Calendar.getInstance();
    }
    
    private List<ItemNota> todosItens = new ArrayList<>();
    
    public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
    	this.razaoSocial = razaoSocial;
    	return this;
    }
    
    public NotaFiscalBuilder comCnpj(String cnpj) {
    	this.cnpj = cnpj;
    	return this;
    }
    
    public NotaFiscalBuilder comItem(ItemNota item) {
    	todosItens.add(item);
    	valorTotal += item.getValor();
    	impostos += item.getValor() * 0.05;
    	return this;
    }
    
    public NotaFiscalBuilder comObservacoes(String obs) {
    	this.observacoes = obs;
    	
    	return this;
    }
    
    public NotaFiscalBuilder adicionaData( Calendar data) {
    	this.data = data;
    	return this;
    }
    
    public NotaFiscal constroi() {
    	return new NotaFiscal(razaoSocial, cnpj, valorTotal, impostos, data, observacoes, todosItens);
    }
    
    
    

}
