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
        voadores.get(posicao).voar();
    }

    public void FazPlanar(int posicao) {
        voadores.get(posicao).planar();
    }

    public void FazPousar(int posicao) {
        voadores.get(posicao).pousar();
    }

    public void FazTodosVoarem(){
        for(Voador voador : voadores){
            voador.voar();
        }
    }
    public void FazTodosPlanarem(){
        for(Voador voador : voadores){
            voador.planar();
        }
    }

    public void FazTodosPousarem(){
        for(Voador voador : voadores){
            voador.pousar();
        }
    }

}
