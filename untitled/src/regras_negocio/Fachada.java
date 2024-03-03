package regras_negocio;

import java.util.ArrayList;

import Modelo.Veiculo;
import Repositorio.Repositorio;

public class Fachada {

	private static Repositorio repositorio = new Repositorio();
	
	public static Repositorio getRepositorio() {
		return repositorio;
	}

	public static void setRepositorio(Repositorio repositorio) {
		Fachada.repositorio = repositorio;
	}

	public static void adicionarVeiculo(Veiculo veiculo) throws Exception {
		if (repositorio.idExiste(veiculo.getId())) {
			throw new Exception("Já existe um veículo cadastrado com esse ID");
		}
		if (repositorio.procurarVeiculo(veiculo.getId()) != null) {
			throw new Exception("Este veículo já foi cadastrado");
		}
		repositorio.adicionarVeiculo(veiculo);
	}
	
	public static void removerVeiculo(Veiculo veiculo) throws Exception {
		if (repositorio.procurarVeiculo(veiculo.getId()) == null) {
			throw new Exception("Este veículo não está cadastrado");
		}
		repositorio.removerVeiculo(veiculo);
	}
	
	public static double valorDaDiariaDoVeiculo(String id) throws Exception {
		if (repositorio.procurarVeiculo(id) == null) {
			throw new Exception("Este veículo não está cadastrado");
		}
		return repositorio.diariaDoVeiculo(id);
	}
	
	public static int quantidadeDeVeiculosCadastrados() {
		return repositorio.quantidadeDeVeiculos();
	}
	
	public static ArrayList<Veiculo> veiculosDoTipo(Class<? extends Veiculo> tipo) throws Exception {
		if (!repositorio.verificarTipoExistente(tipo)) {
			throw new Exception("Este tipo não existe");
		}
		return repositorio.veiculosDoTipo(tipo);
	}
	
	public static Veiculo veiculoComDiariaMaisCara() {
		return repositorio.diariaMaisCara();
	}
	
}
