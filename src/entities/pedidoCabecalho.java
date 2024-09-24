package entities;

import java.time.LocalDate;
import java.util.List;

public class pedidoCabecalho {
	
	private int id;
	private LocalDate data;
	private cliente cliente;
	private double valorTotal;
	private List<pedidoItem> item;
	 
	
	public pedidoCabecalho(int id, LocalDate data, entities.cliente cliente, double valorTotal, List<pedidoItem> item) {
		this.id = id;
		this.data = data;
		this.cliente = cliente;
		this.valorTotal = valorTotal;
		this.item = item;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public cliente getCliente() {
		return cliente;
	}

	public void setCliente(cliente cliente) {
		this.cliente = cliente;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public List<pedidoItem> getItem() {
		return item;
	}

	public void setItem(List<pedidoItem> item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "ID:"+ id + "\n" + 
	           "Data:" + data + "\n" +
	           "Nome do cliente:" + cliente.getNome() + "\n" +
	           "Cidade do cliente: " + cliente.getMunicipio() + "\n"+
	           "Estado do cliente: " + cliente.getUf() + "\n" +
	           "Numero da residência: " + cliente.getNumero() + "\n" +
	           "Logradouro do cliente: " + cliente.getLogradouro() + "\n" +
	           "valorTotal: " + valorTotal + "\n" +
	           "item:" + item + "\n";
	
	}


}
