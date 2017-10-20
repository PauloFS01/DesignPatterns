package decorator;

import java.util.ArrayList;
import java.util.List;

public class TestaFiltros {
	public static void main(String[] args) {
		List<Conta> novasContas = criaLista();
		
		FiltroMaisDe100 filtroMaisDe100 = new FiltroMaisDe100();
		FiltroMenorDe500 filtroMenorDe500 = new FiltroMenorDe500();
		
		FiltroMaisDe100 filtroMaisDe100MenorDe500 = new FiltroMaisDe100(filtroMenorDe500);
		FiltroMenorDe500 filtroMenorDe500MaisDe100 = new FiltroMenorDe500(filtroMaisDe100);
		
		imprimeLista(filtroMaisDe100.filtrar(novasContas));
		imprimeLista(filtroMenorDe500.filtrar(novasContas));
		imprimeLista(filtroMaisDe100MenorDe500.filtrar(novasContas));
		imprimeLista(filtroMenorDe500MaisDe100.filtrar(novasContas));
		
		/*
		
		System.out.println("Filtros simples MaisDe100:  " + filtroMaisDe100.filtrar(novasContas) 
		+ " Filtros simples MenorDe500: " + filtroMenorDe500.filtrar(novasContas));
		
		System.out.println("Filtros composto MaisDe100 MenorDe500: " + filtroMaisDe100MenorDe500.filtrar(novasContas) 
				+ " Filtros composto MenorDe500 MaisDe100: " + filtroMenorDe500MaisDe100.filtrar(novasContas));
		
		*/
	}
	
	static List<Conta> criaLista(){
		List<Conta> contas = new ArrayList<>();
		
		Conta conta = new Conta(300);

		Conta conta2 = new Conta(600000);

		Conta conta3 = new Conta(90);

		
		contas.add(conta);
		contas.add(conta2);
		contas.add(conta3);
		
		return contas;	
	}
	
	static void imprimeLista(List<Conta> contas) {
		for(Conta conta: contas) {
			
			System.out.println(conta.getSaldo());
			
		}
	}
	
}
