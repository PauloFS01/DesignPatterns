package decorator;

import java.util.ArrayList;
import java.util.List;

public abstract class Filtro {
	Filtro filtro;
	
	public Filtro(Filtro filtro) {
		this.filtro = filtro;
	}
	
	public Filtro() {
		this.filtro = null;
	}
	
	public List<Conta> filtrar(List<Conta> contas){
		List<Conta> contasFiltradas = new ArrayList<>();
		for(Conta conta : contas)
			if(meuFiltro(conta.getSaldo()) && proximoFiltro(conta.getSaldo())) {
				contasFiltradas.add(conta);
			}
		return contasFiltradas;
	}
	
	public boolean proximoFiltro(double valor) {
		if(this.filtro == null) {
			return true;
		}else {
			return filtro.meuFiltro(valor);
		}
	}
	
	public abstract boolean meuFiltro(double valor);

}
