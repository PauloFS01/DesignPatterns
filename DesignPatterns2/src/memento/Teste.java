package memento;

import java.util.Calendar;

public class Teste {
	public static void main(String[] args) {
		Historico historico = new Historico();
		
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
	}

}
