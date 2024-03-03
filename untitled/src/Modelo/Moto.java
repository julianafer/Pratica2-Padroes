package Modelo;
public class Moto extends Veiculo {

	private String motor;
	private String placa;
	private SistemaDePartida sistemaDePartida;
	
	public Moto(int id, double valorDeCompra, String motor, String placa, SistemaDePartida sistemaDePartida) {
		super(id, valorDeCompra);
		this.motor = motor;
		this.placa = placa;
		this.sistemaDePartida = sistemaDePartida;
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

	public SistemaDePartida getSistemaDePartida() {
		return sistemaDePartida;
	}

	public void setSistemaDePartida(SistemaDePartida sistemaDePartida) {
		this.sistemaDePartida = sistemaDePartida;
	}
	
	@Override
    public double calculoDiaria() {
        double diaria = (getValorDeCompra() * 0.02) + ((getSistemaDePartida() == SistemaDePartida.eletrico) ? 20 : 5);
        return diaria;
    }

	@Override
    public String toString() {
        return "Moto{" + super.toString() +
                ", motor=" + motor +
                ", placa=" + placa +
                ", sistemaDePartida=" + sistemaDePartida +
                '}';
    }
	
}
