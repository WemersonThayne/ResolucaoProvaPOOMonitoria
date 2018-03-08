package br.edu.ifpb.monitoria;

public class Pocao extends Item implements IUsavel{

	private int HPRestaurado;
	public Pocao(String nome, int hp) {
		setNome(nome);
		setHPRestaurado(hp);
	}
	public int getHPRestaurado() {
		return HPRestaurado;
	}
	public void setHPRestaurado(int hPRestaurado) {
		HPRestaurado = hPRestaurado;
	}
	@Override
	public String usar() {
		return this.nome + this.HPRestaurado;
	}
	@Override
	public String toString() {
		return super.toString()+" Pocao [HPRestaurado=" + HPRestaurado + "]";
	}
	
	
}
