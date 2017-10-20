package interpreter;

import visitor.Visitor;

public class Numero implements Expressao{
	
	double num;
	
	public Numero(double num) {
		this.num = num;
	}
	
	public double avalia() {
		return this.num;
	}
	

	public double getNum() {
		return num;
	}

	@Override
	public void aceita(Visitor visitor) {
		visitor.visitaNumero(this);
		
	}

}
