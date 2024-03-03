import Modelo.*;
import regras_negocio.*;

public class Main {
    public static void main(String[] args) {
        try {
            // Criando alguns veículos para teste
            Aviao aviao = new Aviao("AV001", 50000.0, 120, 800);
            Carro carro = new Carro("CAR001", 30000.0, 500, "Motor1", "ABC123");
            Helicoptero helicoptero = new Helicoptero("HEL001", 70000.0, 4, 90);
            
            // Adicionando os veículos ao repositório
            Fachada.adicionarVeiculo(aviao);
            Fachada.adicionarVeiculo(carro);
            Fachada.adicionarVeiculo(helicoptero);
            
            // Testando métodos da fachada
            System.out.println("Quantidade de veículos cadastrados: " + Fachada.quantidadeDeVeiculosCadastrados());
            System.out.println("Valor da diária do avião AV001: " + Fachada.valorDaDiariaDoVeiculo("AV001"));
            System.out.println("Veículo com diária mais cara: " + Fachada.veiculoComDiariaMaisCara());

            // Listando veículos do tipo Avião
            System.out.println("Veículos do tipo Avião:");
            for (Veiculo v : Fachada.veiculosDoTipo(Aviao.class)) {
                System.out.println(v);
            }

            // Removendo um veículo
            Fachada.removerVeiculo(aviao);
            System.out.println("Quantidade de veículos cadastrados após remoção: " + Fachada.quantidadeDeVeiculosCadastrados());

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
