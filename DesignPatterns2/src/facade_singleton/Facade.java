package facade_singleton;

import java.util.Calendar;

import builder.ItemNota;
import builder.NotaFiscal;
import chainofresponsibility.CalculaDesconto;
import chainofresponsibility.Item;
import chainofresponsibility.Orcamento;
import command.Pedido;
import memento.Contrato;
import memento.Estado;
import memento.Historico;
import memento.TipoContrato;
import observer.EnviaPorEmail;
import observer.MultiplicaValor;
import observer.NotaFiscalBuilder;
import observer.SalvaNoBanco;
import strategy_2.Arrojado;
import strategy_2.Conservador;
import strategy_2.Conta;
import strategy_2.Estrategia;

public class Facade {
	
	public Contrato retornaContrato() {
		return new Contrato(Calendar.getInstance(),"Cliente teste", TipoContrato.NOVO);
		
	}
	
	public Estado retornaEstado() {
		return new Estado();
	}
	
	public Historico retornaHistorico() {
		return new Historico();
	}
	
	public Orcamento retornaOrcamento() {
		Orcamento orcamento = new Orcamento(501);
		orcamento.adicionaItem(new Item("CANETA", 250.0));
		orcamento.adicionaItem(new Item("LAPIS", 250.0));
		return orcamento;
		
	}
	
	public CalculaDesconto retornaCalculaDesconto() {
		return new CalculaDesconto();
	}
	
	public Pedido retornaPedido() {
		
		Pedido pedido = new Pedido();		
		pedido.setCliente("Cliente teste")
		.setValor(12.5);
		
		return pedido;
	}
	
	public NotaFiscalBuilder retornaNotaFiscalBuilder() {
		return new NotaFiscalBuilder(new SalvaNoBanco(), new EnviaPorEmail(),
				new MultiplicaValor(3));
	}
	
	public NotaFiscal retornaNotaFiscal() {
		NotaFiscalBuilder builder = retornaNotaFiscalBuilder();
		NotaFiscal notaFiscal =  builder.paraEmpresa("Empresa teste").comCnpj("293.3389.394/0003-37")
				.comItem(new ItemNota("item 1", 127.30)).comObservacoes("Teste padrão").constroi();
		return notaFiscal;
	}
	
	public Conta retornaConta() {
		return new Conta(12.3);
	}
	
	public Estrategia retornaArrojado() {
		return new Arrojado();
	}
	
	public Estrategia retornaConservador() {
		return new Conservador();
	}

}
