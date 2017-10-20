package decorator;

public class ISS extends Imposto{

	public ISS(Imposto imposto) {
		super(imposto);
	}
	
	public ISS() {
		super();		
	}
	
	 public double calcula(Orcamento orcamento) {
		 return orcamento.getValor() * 0.06 + calculaOutroImposto(orcamento);
	 }

}
