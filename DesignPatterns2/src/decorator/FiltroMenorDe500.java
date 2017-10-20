package decorator;

public class FiltroMenorDe500 extends Filtro{
	
	public FiltroMenorDe500(Filtro filtro) {
		super(filtro);
	}
	
	public FiltroMenorDe500() {
		super();
	}

	@Override
	public boolean meuFiltro(double valor) {
		
		return (valor < 500000)?true:false;
		
	}

}
