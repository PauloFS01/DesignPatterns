package interpreter;

import visitor.Visitor;

public interface Expressao {
	
	public double avalia();
	void aceita(Visitor visitor);
}
