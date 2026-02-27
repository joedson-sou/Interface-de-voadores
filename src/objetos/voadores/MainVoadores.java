package objetos.voadores;

import java.util.Random;

public class MainVoadores {
    public static void main(String[] args) {
        RepositorioVoadores rep = new RepositorioVoadores();
        receberVoador(rep);
        imprimiVoadores(rep);
    }

    private static void imprimiVoadores(RepositorioVoadores rep) {
        for (int i = 0; i < 10; i++) {
            rep.FazVoar(i); #chamada do metodo voar
            rep.FazPlanar(i); #chamada do metodo planar
            rep.FazPousar(i); #chamada do metodo pousar
        }

    }


    private static void receberVoador(RepositorioVoadores rep) {

        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            int op = r.nextInt(1, 4);

            switch (op) {
                case 1:
                    rep.adicionarVoador(new GalinhaVoadora());

                    break;
                case 2:
                    rep.adicionarVoador(new Drone("Drone"));
                    break;
                case 3:
                    rep.adicionarVoador(new Arrara("Azul",r.nextInt(1,51)));

            }

        }
    }
}
