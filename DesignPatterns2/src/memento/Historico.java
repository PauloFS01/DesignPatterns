package memento;

import java.util.ArrayList;
import java.util.List;

public class Historico {
	
	List <Estado> estados = new ArrayList<>();
	
	public Estado pega(int index){
		return estados.get(index);
	}
	
	public void adiciona(Estado estado){
		estados.add(estado);
	}

}
