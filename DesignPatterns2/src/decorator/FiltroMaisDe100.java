package decorator;

public class FiltroMaisDe100 extends Filtro {
	
	public FiltroMaisDe100(Filtro filtro) {
		super(filtro);
	}
	
	public FiltroMaisDe100() {
		super();
	}

	@Override
	public boolean meuFiltro(double valor) {

		return (valor > 100)? true:false;
		
	}

	

}
