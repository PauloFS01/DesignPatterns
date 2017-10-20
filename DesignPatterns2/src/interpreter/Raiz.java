package interpreter;

import visitor.ImpressoraVisitor;
import visitor.Visitor;

public class Raiz implements Expressao{
	Expressao radical;
	
	public Raiz(Expressao dir) {
		this.radical = dir;

	}
	@Override
	public double avalia() {
		return Math.sqrt(this.radical.avalia());
	}
	@Override
	public void aceita(Visitor visitor) {
		// TODO Auto-generated method stub
		
	}


}
