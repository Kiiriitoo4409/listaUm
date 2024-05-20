package aulaExtra:

public class Pessoa {
	private String nome;
	private int idade;
	private double altura;
	
	public Pessoa(String novoNome, int novaIdade, double novaAltura) {
		this.nome = novoNome;
		this.idade = novaIdade;
		this.altura = novaAltura;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void SetNome(String novoNome) {
		this.nome = novoNome;
	}

	public void SetIdade(int novaIdade) {
		this.idade = novaIdade;
	}
	
	public void SetAltura(double novaAltura) {
		this.altura = novaAltura;
		
	}
       
       public String toString( ) {
       return "Nome: " + this.nome + "\n Idade: " + this.idade + "anos \n Altura: " + this.altura + "m";
       }
}
