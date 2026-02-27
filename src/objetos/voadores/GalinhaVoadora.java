package objetos.voadores;

public class GalinhaVoadora implements Voador {

    public void comerMilho(){
        System.out.println("comer milho");

    }

    @Override
    public double voar() {
        System.out.println("Galinha voando");
        return 0;
    }

    @Override
    public void planar() {
        System.out.println("Galinha planando");

    }

    @Override
    public boolean pousar() {
        System.out.println("Galinha pousando\n");
        return true;
    }

    @Override
    public String toString() {
        return "GalinhaVoadora";
    }
}
