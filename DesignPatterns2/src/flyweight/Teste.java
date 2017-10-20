package flyweight;

import java.util.Arrays;
import java.util.List;

public class Teste {
	public static void main(String[] args) {
		NotasMusicais notas = new NotasMusicais();
		
		List<Nota> doReMi = Arrays.asList(
				
				notas.pega("re#"),
				notas.pega("do"),
				notas.pega("do#"),
				notas.pega("re"),
				notas.pega("do#"),
				notas.pega("do")
			
		);
		
		Piano piano = new Piano();
	    piano.toca(doReMi);
		
	}
	
	

}
