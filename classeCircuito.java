public class ClasseCirculo {
	
	public double raio;
	
	public ClasseCirculo(double novoRaio) {
		this.raio = novoRaio;
	}
	

	
	public double getRaio() {
		return raio;
	}


	
	public void setRaio(double novoRaio) {
		this.raio = novoRaio;
	}
	

	public double calcularArea() {
		return 3.14 * raio * raio;
	}
	

	
}
