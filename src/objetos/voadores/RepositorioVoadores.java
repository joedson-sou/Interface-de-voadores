package objetos.voadores;

import java.util.ArrayList;
import java.util.List;

public class RepositorioVoadores {
    private List<Voador> voadores = new ArrayList<>();

    public boolean adicionarVoador(Voador voador) {
        return  voadores.add(voador);
    }

    public Voador removerVoador(int posicao) {
        return voadores.remove(posicao);
    }

    public void FazVoar(int posicao) {
        voadores.get(posicao).voar(); #chamada para voar
    }

    public void FazPlanar(int posicao) {
        voadores.get(posicao).planar(); #chamada para planar
    }

    public void FazPousar(int posicao) {
        voadores.get(posicao).pousar(); #chamada para pousar
    }

    public void FazTodosVoarem(){
        for(Voador voador : voadores){
            voador.voar(); #chamada
        }
    }
    public void FazTodosPlanarem(){
        for(Voador voador : voadores){
            voador.planar(); #chamada
        }
    }

    public void FazTodosPousarem(){
        for(Voador voador : voadores){
            voador.pousar(); #chamada
        }
    }

}
