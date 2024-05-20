package aulaExtra;

public class Professor {

	private String nome;
	private String departamento;
	private String titulacao;
	
	public Professor(String novoNome, String novoDepartamento, String novoTitulacao) {
		this.nome = novoNome;
		this.departamento = novoDepartamento;
		this.titulacao = novoTitulacao;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getDepartamento() {
		return departamento;
	}
	
	public String getTitulacao() {
		return titulacao;
	}
	
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	
	public void setDepartamento(String novoDepartamento) {
		this.departamento = novoDepartamento;
	}
	
	public void setTitulacao(String novoTitulacao) {
		this.titulacao = novoTitulacao;
	}
}
