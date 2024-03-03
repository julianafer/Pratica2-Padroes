package Modelo;
public class Helicoptero extends Veiculo {
	
	private int quantidadeDeRotores;
	private int tempoDeVoo; // em minutos
	
	public Helicoptero(int id, double valorDeCompra, int quantidadeDeRotores, int tempoDeVoo) {
		super(id, valorDeCompra);
		this.quantidadeDeRotores = quantidadeDeRotores;
		this.tempoDeVoo = tempoDeVoo;
	}

	public int getQuantidadeDeRotores() {
		return quantidadeDeRotores;
	}

	public void setQuantidadeDeRotores(int quantidadeDeRotores) {
		this.quantidadeDeRotores = quantidadeDeRotores;
	}

	public int getTempoDeVoo() {
		return tempoDeVoo;
	}

	public void setTempoDeVoo(int tempoDeVoo) {
		this.tempoDeVoo = tempoDeVoo;
	}
	
	@Override
    public double calculoDiaria() {
        double diaria = (getValorDeCompra() * 0.1) * getQuantidadeDeRotores();
        return diaria;
    }

	@Override
    public String toString() {
        return "Helicoptero{" + super.toString() +
                ", quantidadeDeRotores=" + quantidadeDeRotores +
                ", tempoDeVoo=" + tempoDeVoo +
                '}';
    }

}
