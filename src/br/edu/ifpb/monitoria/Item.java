package br.edu.ifpb.monitoria;

public abstract class Item {

	protected String nome;
	
	public String examinar(){
		return this.nome;
	};
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Item [nome=" + nome + "]";
	}

	
}
