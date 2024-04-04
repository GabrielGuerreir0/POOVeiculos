package descriçãoveiculo;

public class Moto {
	String marca;
	String modelo;
	String cor;
	int ano;
	int cilindradas;
	
	public void MotoDesc(String mar,String mod, int fab, String co, int cilin) {
		marca = mar;
		modelo = mod;
		cor = co;
		ano = fab;
		cilindradas = cilin;
	}
	
	public void Descricao() {
		System.out.println("Marca: " + marca + ", Modelo: " + modelo +", Ano: " + ano + ", Cor: " + cor + ", Cilindradas: " + cilindradas);
	}
}
