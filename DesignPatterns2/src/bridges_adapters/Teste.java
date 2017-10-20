package bridges_adapters;

public class Teste {
	public static void main(String[] args) {
		//usando padrão Bridges para ligar a aplicação à serviços externos.
		GoogleMaps viaGoogle = new GoogleMaps();
		Maplink viaMaplink =  new Maplink();
		
		//usa  padrão adapter para melhorar a usuabilidade de uma outra interface.
		Relogio horaAgora = new Relogio();
		
		System.out.println("Rota via Google: " + viaGoogle.devolveMapa("enderreço"));
		System.out.println("Rota via Google: " + viaMaplink.devolveMapa("enderreço"));
		
		System.out.println("Hora agora: " + horaAgora.hoje());

	}
	
	
	

}
