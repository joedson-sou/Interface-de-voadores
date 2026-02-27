package objetos.voadores;

public class Arrara implements Voador{

    String cor;
    int idade;

    public Arrara(String cor, int idade){
        super();
        this.cor = cor;
        this.idade = idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public double voar() {
        velhiceDaArrara(idade);
        System.out.println("Voa a Arrara" + getCor());
        return 0;
    }

    private void velhiceDaArrara(int idade) {
        if(idade < 25){
            System.out.println("Arrara nova");
        }
        if(idade > 25){
            System.out.println("Arrara velha");
        }
    }

    @Override
    public void planar() {
        System.out.println("Plana a Arrara" + getCor());

    }

    @Override
    public boolean pousar() {
        System.out.println("Pousa a Arrara " + getCor() + "\n");
        return true;
    }
}
