package observer;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import builder.ItemNota;
import builder.NotaFiscal;

public class NotaFiscalBuilder {

	private String razaoSocial;
    private String cnpj;
    private double valorTotal;
    private double impostos;
    private Calendar data;
    private String observacoes;
    private List<ItemNota> todosItens;
    private List<AposGerarNota> todasAcoes;
    
    public NotaFiscalBuilder(AposGerarNota... acao) {
        this.data = Calendar.getInstance();
        this.todasAcoes = new ArrayList<>();
        this.todosItens = new ArrayList<>();
        
        for(int i =0; i < acao.length; i++)
        	this.todasAcoes.add(acao[i]);
    }
    
    public void adicionaAcao(AposGerarNota... acao) {
    	for(int i =0; i < acao.length; i++)
    	this.todasAcoes.add(acao[i]);
    }
    /*
     public void adicionaAcao(AposGerarNota... acao) {
    	for(int i =0; i < acao.length; i++)
    	this.todasAcoes.add(acao[i]);
    }
     * */
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
    	
    	NotaFiscal notaFiscal = new NotaFiscal(razaoSocial, cnpj, valorTotal, impostos, data, observacoes, todosItens);
    	
    	for (AposGerarNota acao : todasAcoes) {
    		acao.executa(notaFiscal);
    	}
    	
    	return notaFiscal;	
    }
}
