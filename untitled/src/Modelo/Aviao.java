package Modelo;
public class Aviao extends Veiculo {

    private int tempoDeVoo; // em minutos
    private int velocidadeDeCruzeiro; // em Km/H

    public Aviao(String id, double valorDeCompra, int tempoDeVoo, int velocidadeDeCruzeiro) {
        super(id, valorDeCompra);
        this.tempoDeVoo = tempoDeVoo;
        this.velocidadeDeCruzeiro = velocidadeDeCruzeiro;
    }

    public int getTempoDeVoo() {
        return tempoDeVoo;
    }

    public void setTempoDeVoo(int tempoDeVoo) {
        this.tempoDeVoo = tempoDeVoo;
    }

    public int getVelocidadeDeCruzeiro() {
        return velocidadeDeCruzeiro;
    }

    public void setVelocidadeDeCruzeiro(int velocidadeDeCruzeiro) {
        this.velocidadeDeCruzeiro = velocidadeDeCruzeiro;
    }

    @Override
    public double calculoDiaria() {
        double diaria = (getValorDeCompra() * 0.2) + (1000 * getVelocidadeDeCruzeiro());
        return diaria;
    }

    @Override
    public String toString() {
        return "Aviao{" + super.toString() +
                ", tempoDeVoo=" + tempoDeVoo +
                ", velocidadeDeCruzeiro=" + velocidadeDeCruzeiro +
                '}';
    }
}
