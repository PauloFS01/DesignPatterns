package facade_singleton;

public class Singleton {
	
	private Servico servico;
	
	public Servico getServico() {
		if(servico == new Servico()) {
			
		}
		return servico;
	}

}
