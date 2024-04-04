package descriçãoveiculo;

public class Carro {

	String marca;
	String modelo;
	String cor;
	int ano;
	int numero_portas;
	
	public void CarroDesc(String mar,String mod, int fab, String co, int np) {
		marca = mar;
		modelo = mod;
		cor = co;
		ano = fab;
		numero_portas = np;
	}
	
	public void Descricao() {
		System.out.println("Marca: " + marca + ", Modelo: " + modelo +", Ano: " + ano + ", Cor: " + cor + ", Portas: " + numero_portas);
	}
}
