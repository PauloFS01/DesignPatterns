package strategy;

public class ICCC implements Imposto{

	@Override
	public double getValor(Orcamento orcamento) {
		return retornaValor(orcamento.getValor());
	}
	
	
	public double retornaValor(double valor) {
		if(valor <= 100.0)
			return valor * 0.005;
		if(valor > 1000|| valor <= 3000) 
			return valor  * 0.007;
		
		return valor * 0.008;
	}
	


}
