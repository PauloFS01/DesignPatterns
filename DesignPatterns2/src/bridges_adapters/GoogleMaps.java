package bridges_adapters;

public class GoogleMaps implements Map{

	@Override
	public String devolveMapa(String rua) {

		return "https://maps.google.com.br/" + rua ;
	}

}
