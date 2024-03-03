package Gerente;

import Modelo.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Gerente {

    private ArrayList<Veiculo> veiculos;

    public Gerente() {
        veiculos = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo veiculo) throws Exception {
        if (idExiste(veiculo.getId())) {
            throw new Exception("Já existe um veículo cadastrado com esse ID");
        }
        veiculos.add(veiculo);
    }

    public void removerVeiculo(String id) throws Exception {
        Veiculo veiculo = procurarVeiculo(id);
        if (veiculo == null) {
            throw new Exception("Este veículo não está cadastrado");
        }
        veiculos.remove(veiculo);
    }

    public double valorDaDiariaDoVeiculo(String id) throws Exception {
        Veiculo veiculo = procurarVeiculo(id);
        if (veiculo == null) {
            throw new Exception("Este veículo não está cadastrado");
        }
        return veiculo.calculoDiaria();
    }

    public int quantidadeDeVeiculosCadastrados() {
        return veiculos.size();
    }

    public ArrayList<Veiculo> veiculosDoTipo(Class<? extends Veiculo> tipo) {
        ArrayList<Veiculo> veiculosDoTipo = new ArrayList<>();
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getClass().equals(tipo)) {
                veiculosDoTipo.add(veiculo);
            }
        }
        veiculosDoTipo.sort(Comparator.comparing(v -> v.getId()));
        return veiculosDoTipo;
    }

    public Veiculo veiculoComDiariaMaisCara() {
        return Collections.max(veiculos, (v1, v2) -> Double.compare(v1.calculoDiaria(), v2.calculoDiaria()));
    }

    private Veiculo procurarVeiculo(String id) {
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getId().equals(id)) {
                return veiculo;
            }
        }
        return null;
    }

    private boolean idExiste(String id) {
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }
}