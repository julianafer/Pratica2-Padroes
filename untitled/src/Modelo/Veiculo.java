package Modelo;
public abstract class Veiculo {
    
    private String id;
    private double valorDeCompra;

    public Veiculo(String id, double valorDeCompra) {
        this.id = id;
        this.valorDeCompra = valorDeCompra;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getValorDeCompra() {
        return valorDeCompra;
    }

    public void setValorDeCompra(double valorDeCompra) {
        this.valorDeCompra = valorDeCompra;
    }

    public abstract double calculoDiaria();

    @Override
    public String toString() {
        return "Veiculo{" +
                "id=" + id +
                ", valorDeCompra=" + valorDeCompra +
                '}';
    }

}
