package Modelo;
public abstract class Veiculo {
    
    private int id;
    private double valorDeCompra;

    public Veiculo(int id, double valorDeCompra) {
        this.id = id;
        this.valorDeCompra = valorDeCompra;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValorDeCompra() {
        return valorDeCompra;
    }

    public void setValorDeCompra(double valorDeCompra) {
        this.valorDeCompra = valorDeCompra;
    }

    public double calculoDiaria() {
        //TODO: implementar nas subclasses
    	return 0;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "id=" + id +
                ", valorDeCompra=" + valorDeCompra +
                '}';
    }

}
