package aulaExtra;

public class Aluno {
	private String nome;
	private String matricula;
	private Strging curso;
	
	public Aluno (String novoNome, String novoMatricula, String novoCurso) {
		this.nome = novoNome;
		this.matricula = novoMatricula;
		this.curso = novoCurso;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public String getCurso;

	}
	
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	
	public void setMatricula(String novoMatricula) {
		this.matricula = novoMatricula;
	}
	
	public void setCurso(String novoCurso) {
		this.curso = novoCurso;
	}
}
