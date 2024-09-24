package entities;

public class Produto {

	private int ID;
	private String descricao;
	private int estoque;
	private double valor;
	
	public Produto(int iD, String descricao, int estoque, double valor) {
		ID = iD;
		this.descricao = descricao;
		this.estoque = estoque;
		this.valor = valor;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getDecricao() {
		return descricao;
	}

	public void setDecricao(String decricao) {
		this.descricao = decricao;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "\n ID do produto: " + ID + "\n" + 
				" Descricao: " + descricao + "\n" + 
				" Estoque:" + estoque + "\n" + 
				" Valor: " + valor;
	}
}
