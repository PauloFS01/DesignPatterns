package decorator;

public class TestaImpostos {
	
	//impostos
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(500);
		
		ISS issNormal = new ISS();
		ICMS IcmsMaisIss = new ICMS(issNormal);
		
		System.out.println("ISS: " + issNormal.calcula(orcamento) + "\nICMS Com ISS: " + IcmsMaisIss.calcula(orcamento));
		
	}
	
}

/*
 Quando compomos comportamento, através de classes que recebem objetos do mesmo tipo que elas mesmas 
 (nesse caso, ISS que é um Imposto, recebe em seu construtor outro Imposto) para fazerem parte de seu 
 comportamento, de uma maneira que seu uso é definido a partir do que se passou para a instanciação 
 dos objetos, é o que caracteriza o Design Pattern chamado Decorator.
 
 */