package decorator;

public abstract class Imposto {
	protected Imposto outroImposto;
	
	public Imposto(Imposto imposto) {
		this.outroImposto = imposto;
	}
	
	public Imposto() {
		this.outroImposto = null;
	}
	
	public abstract double calcula(Orcamento orcamento);
	
	protected double calculaOutroImposto(Orcamento orcamento) {
		if(!(outroImposto == null)) {
			return outroImposto.calcula(orcamento);
		}
		return 0;
	}
	
}
