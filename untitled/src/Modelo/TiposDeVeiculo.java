package Modelo;

public enum TiposDeVeiculo {
	AVIAO(Aviao.class),
    CARRO(Carro.class),
    HELICOPTERO(Helicoptero.class),
    MOTO(Moto.class),
    ONIBUS(Onibus.class);

    private final Class<? extends Veiculo> classe;

    TiposDeVeiculo(Class<? extends Veiculo> classe) {
        this.classe = classe;
    }

    public Class<? extends Veiculo> getClasse() {
        return classe;
    }
}
