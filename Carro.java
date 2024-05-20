package aulaExtra;

public class Carro {
	private String modelo;
	private String marca;
	private String placa;
	private int ano;
	
	public Carro(String novoModelo, String novaMarca, String novaPlaca, int novoAno) {
		this.modelo = novoModelo;
		this.marca = novaMarca;
		this.placa = novaPlaca;
		this.ano = novoAno;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setModelo(String novoModelo) {
		this.modelo = novoModelo;
	}
	
	public void setMarca(String novaMarca) {
		this.marca = novaMarca;
	}
	
	public void setPlaca(String novaPlaca) {
		this.placa = novaPlaca;
	}
	
	public void setAno(int novoAno) {
		this.ano = novoAno;
	}
}
