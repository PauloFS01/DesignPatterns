package bridges_adapters;

public class Maplink implements Map {

	@Override
	public String devolveMapa(String rua) {
		return "MapLink" + rua;
	}

}
