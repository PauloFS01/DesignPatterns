package command;

import java.util.ArrayList;
import java.util.List;

public class FilaDeAcoes {

    private List<Comando> comandos;

    public FilaDeAcoes() {
        comandos = new ArrayList<Comando>();
    }

    public void adiciona(Comando comando) {
        comandos.add(comando);
    }

    public void processa() {
        for(Comando comando : comandos) {
 //           comando.executa();
        }
    }
}
