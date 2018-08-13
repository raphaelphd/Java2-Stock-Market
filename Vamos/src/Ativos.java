
public class Ativos {
	
	private String ativo;
	private double maiorValor;
	private double menorValor;
	private double valor;
	
	
	public Ativos(String ativo, double maiorValor, double menorValor, double valor){
		
		this.ativo = ativo;
		this.maiorValor = maiorValor;
		this.menorValor = menorValor;
		this.valor = valor;

	}
	public Ativos(){
		
	}
	

	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getAtivo() {
		return ativo;
	}
	public void setAtivo(String ativo) {
		this.ativo = ativo;
	}
	public double getMaiorValor() {
		return maiorValor;
	}
	public void setMaiorValor(double maiorValor) {
		this.maiorValor = maiorValor;
	}
	public double getMenorValor() {
		return menorValor;
	}
	public void setMenorValor(double menorValor) {
		this.menorValor = menorValor;
	}

}
