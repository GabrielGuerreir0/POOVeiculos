package descriçãoveiculo;

public class Principal {

	public static void main(String[] args) {
		Carro c = new Carro();
		Moto m = new Moto();
		c.CarroDesc("Toyota", "Corola", 2020, "preto", 4);
		m.MotoDesc("Honda", "CBR500R", 2021, "Vermelho", 500);
		c.Descricao();
		m.Descricao();
	}
}
