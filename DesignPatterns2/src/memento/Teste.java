package memento;

import java.util.Calendar;

import facade_singleton.Facade;

public class Teste {
	public static void main(String[] args) {
		
		Facade facade = new Facade();
		
		Historico historico = facade.retornaHistorico();
		Contrato contrato = facade.retornaContrato();
		
		historico.adiciona(contrato.salvaEstado());
		
		System.out.println(contrato.getTipo());
		contrato.avanca();
		historico.adiciona(contrato.salvaEstado());
		System.out.println(contrato.getTipo());
		
		contrato.avanca();
		historico.adiciona(contrato.salvaEstado());
		System.out.println(contrato.getTipo());
		
		Estado estado = historico.pega(0);
		contrato.restaura(estado);
		System.out.println(contrato.getTipo());
		
			
	}

}

/*
		Contrato contrato = new Contrato(Calendar.getInstance(),"João da silva", TipoContrato.NOVO);
		historico.adiciona(contrato.salvaEstado());
		
		System.out.println(contrato.getTipo());
		contrato.avanca();
		historico.adiciona(contrato.salvaEstado());
		System.out.println(contrato.getTipo());
		
		contrato.avanca();
		historico.adiciona(contrato.salvaEstado());
		System.out.println(contrato.getTipo());
		
		Estado estado = historico.pega(0);
		contrato.restaura(estado);
		System.out.println(contrato.getTipo());
 */