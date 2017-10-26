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
 Quando compomos comportamento, atrav�s de classes que recebem objetos do mesmo tipo que elas mesmas 
 (nesse caso, ISS que � um Imposto, recebe em seu construtor outro Imposto) para fazerem parte de seu 
 comportamento, de uma maneira que seu uso � definido a partir do que se passou para a instancia��o 
 dos objetos, � o que caracteriza o Design Pattern chamado Decorator.
 
 */