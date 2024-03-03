package Modelo;
public class Carro extends Veiculo {

    private int autonomia;
    private String motor;
    private String placa;

    public Carro(String id, double valorDeCompra, int autonomia, String motor, String placa) {
        super(id, valorDeCompra);
        this.autonomia = autonomia;
        this.motor = motor;
        this.placa = placa;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public double calculoDiaria() {
        double diaria = (getValorDeCompra() * 0.02);
        return diaria;
    }

    @Override
    public String toString() {
        return "Carro{" + super.toString() +
                ", autonomia=" + autonomia +
                ", motor=" + motor +
                ", placa=" + placa +
                '}';
    }
}
