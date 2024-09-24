package entities;

public class pedidoItem {
	
	private int sequencia;
	private Produto produto;
	private int quantidade;
	private double valorUnit;
	
	
	
	public pedidoItem(int sequencia, Produto produto, int quantidade, double valorUnit) {
		this.sequencia = sequencia;
		this.produto = produto;
		this.quantidade = quantidade;
		this.valorUnit = valorUnit;
	}


	public int getSequencia() {
		return sequencia;
	}


	public void setSequencia(int sequencia) {
		this.sequencia = sequencia;
	}


	public Produto getProduto() {
		return produto;
	}


	public void setProduto(Produto produto) {
		this.produto = produto;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	public double getValorUnit() {
		return valorUnit;
	}


	public void setValorUnit(double valorUnit) {
		this.valorUnit = valorUnit;
	}


	@Override
	public String toString() {
		return "\nSequencia: " + sequencia + "\n" +
			  " Produto: " + produto  +
			  ", quantidade: " + quantidade  +
			  ", Valor da unidade:" + valorUnit + "\n";
	}
}
