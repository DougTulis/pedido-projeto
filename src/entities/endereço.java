package entities;

public class endereço {
	
	private String logradouro;
	private int numero;
	private String municipio;
	private String uf;
	
	public endereço(String logradouro, int numero, String municipio, String uf) {
		this.logradouro = logradouro;
		this.numero = numero;
		this.municipio = municipio;
		this.uf = uf;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	@Override
	public String toString() {
		return "Logradouro:" + logradouro + "\n" + 
				"numero: " + numero + "\n" +
				"municipio: " + municipio + "\n" + 
				"uf:" + uf + "\n";
	}
	
	

}
