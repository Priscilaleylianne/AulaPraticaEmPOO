package herancaSegundo;

public class Caminhao extends Veiculo {
	private int eixos;
	
	public Caminhao(String placa, int ano, int eixos) {
		super(placa, ano);
		this.setEixos(eixos);
	}
	
	public Caminhao() {
	}

	public int getEixos() {
		return eixos;
	}

	public void setEixos(int eixos) {
		this.eixos = eixos;
	}
	
	public void exibirDados() {
		System.out.println("A Placa do veiculo e "+ placa + "e ano de fabricacao e "+ ano + 
				", a quantidade de eixos e " + eixos);
	}
}
