import Modelo.*;
import Gerente.Gerente;

public class Main {
    public static void main(String[] args) {
        try {
            Gerente gerente = new Gerente();

            // Adicionando alguns veículos para teste
            gerente.adicionarVeiculo(new Aviao("AV001", 50000.0, 120, 800));
            gerente.adicionarVeiculo(new Aviao("AV002", 60000.0, 150, 750));
            gerente.adicionarVeiculo(new Aviao("AV003", 70000.0, 180, 700));
            gerente.adicionarVeiculo(new Carro("CAR001", 30000.0, 500, "Motor1", "ABC123"));
            gerente.adicionarVeiculo(new Helicoptero("HEL001", 70000.0, 4, 90));
            gerente.adicionarVeiculo(new Moto("MOTO001", 10000.0, "Motor2", "XYZ456", SistemaDePartida.MANUAL));
            gerente.adicionarVeiculo(new Onibus("ONIBUS001", 80000.0, "Motor3", "DEF789", 50));

            // Testando métodos da gerente
            System.out.println("Quantidade de veículos cadastrados: " + gerente.quantidadeDeVeiculosCadastrados());
            System.out.println("Valor da diária do avião AV001: " + gerente.valorDaDiariaDoVeiculo("AV001"));
            System.out.println("Veículo com diária mais cara: " + gerente.veiculoComDiariaMaisCara());

            // Listando veículos do tipo Avião
            System.out.println("Veículos do tipo Avião:");
            for (Veiculo v : gerente.veiculosDoTipo(Aviao.class)) {
                System.out.println(v);
            }

            // Removendo um veículo
            gerente.removerVeiculo("AV001");
            System.out.println("Quantidade de veículos cadastrados após remoção: " + gerente.quantidadeDeVeiculosCadastrados());

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
