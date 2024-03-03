package Repositorio;

import java.util.ArrayList;

import Modelo.TiposDeVeiculo;
import Modelo.Veiculo;

public class Repositorio {

	private ArrayList<Veiculo> veiculos;

	public Repositorio() {
		veiculos = new ArrayList<>();
	}

	public ArrayList<Veiculo> getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(ArrayList<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}
	
	public void adicionarVeiculo(Veiculo veiculo) {
		veiculos.add(veiculo);
	}
	
	public void removerVeiculo(Veiculo veiculo) {
		veiculos.remove(veiculo);
	}
	
	public Veiculo procurarVeiculo(String id) {
		for (Veiculo v : getVeiculos()) {
			if (v.getId().equals(id)) {
				return v;
			}
		}
		return null;
	}
	
	public boolean idExiste(String id) {
		for (Veiculo veiculo : getVeiculos()) {
			if (veiculo.getId().equals(id)) {
				return true;
			}
		}
		return false;
	}
	
	public double diariaDoVeiculo(String id) {
        Veiculo veiculo = procurarVeiculo(id);
        return (veiculo != null) ? veiculo.calculoDiaria() : 0.0;
    }
	
	public int quantidadeDeVeiculos() {
		return veiculos.size();
	}
	
	public ArrayList<Veiculo> veiculosDoTipo(Class<? extends Veiculo> tipo) {
		ArrayList<Veiculo> veiculosDoTipo = new ArrayList<>();
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getClass().equals(tipo)) {
                veiculosDoTipo.add(veiculo);
            }
        }
        veiculosDoTipo.sort(null);
        return veiculosDoTipo;
	}
	
	public Veiculo diariaMaisCara() {
		if (veiculos.isEmpty()) return null;
		Veiculo veiculoComDiariaMaisCara = veiculos.get(0);
		for (Veiculo veiculo : getVeiculos()) {
			if (veiculo.calculoDiaria() > veiculoComDiariaMaisCara.calculoDiaria()) {
				veiculoComDiariaMaisCara = veiculo;
			}
		}
		return veiculoComDiariaMaisCara;
	}
	
	public boolean verificarTipoExistente(Class<? extends Veiculo> tipo) {
	    for (TiposDeVeiculo tipoVeiculo : TiposDeVeiculo.values()) {
	        if (tipoVeiculo.getClasse().equals(tipo)) {
	            return true;
	        }
	    }
	    return false;
	}
	
}
