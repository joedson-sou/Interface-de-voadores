package objetos.voadores;

public class Drone implements Voador {

    private String tipo;

    public Drone(String tipo) {
        super();
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public double voar() {
        System.out.println("Drone voando");
        return 0;
    }

    @Override
    public void planar() {
        System.out.println("Drone planando");

    }

    @Override
    public boolean pousar() {
        System.out.println("Drone pousando\n");
        return true;
    }

}
