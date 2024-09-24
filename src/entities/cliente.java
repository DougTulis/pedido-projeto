package entities;

public class cliente extends endereço {
	
	private int ID;
	private String nome;
	private int idade;
	
	public cliente(int iD, String nome, int idade, String logradouro, int numero, String municipio, String uf) {
		super(logradouro, numero, municipio, uf);
		ID = iD;
		this.nome = nome;
		this.idade = idade;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return nome + "\n" + 
			   "ID do cliente: " + ID + "\n" +
			   "idade:" + idade + "\n";
		 }

}
