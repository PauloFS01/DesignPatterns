package bridges_adapters;

public class Teste {
	public static void main(String[] args) {
		//usando padr�o Bridges para ligar a aplica��o � servi�os externos.
		GoogleMaps viaGoogle = new GoogleMaps();
		Maplink viaMaplink =  new Maplink();
		
		//usa  padr�o adapter para melhorar a usuabilidade de uma outra interface.
		Relogio horaAgora = new Relogio();
		
		System.out.println("Rota via Google: " + viaGoogle.devolveMapa("enderre�o"));
		System.out.println("Rota via Google: " + viaMaplink.devolveMapa("enderre�o"));
		
		System.out.println("Hora agora: " + horaAgora.hoje());

	}
	
	
	

}
