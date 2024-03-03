package Modelo;
public class Onibus extends Veiculo {

	private String motor;
	private String placa;
	private int quantidadeDePassageiros;
	
	public Onibus(int id, double valorDeCompra, String motor, String placa, int quantidadeDePassageiros) {
		super(id, valorDeCompra);
		this.motor = motor;
		this.placa = placa;
		this.quantidadeDePassageiros = quantidadeDePassageiros;
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

	public int getQuantidadeDePassageiros() {
		return quantidadeDePassageiros;
	}

	public void setQuantidadeDePassageiros(int quantidadeDePassageiros) {
		this.quantidadeDePassageiros = quantidadeDePassageiros;
	}
	
	@Override
    public double calculoDiaria() {
        double diaria = (getValorDeCompra() * 0.04) + (100 * getQuantidadeDePassageiros());
        return diaria;
    }

	@Override
    public String toString() {
        return "Moto{" + super.toString() +
                ", motor=" + motor +
                ", placa=" + placa +
                ", quantidadeDePassageiros=" + quantidadeDePassageiros +
                '}';
    }
	
}
