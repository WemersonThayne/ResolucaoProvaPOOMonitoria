package br.edu.ifpb.monitoria;

public class Arma extends Item{

	private int danoMax;
	private int durabilidade;
	
	public Arma(String nome,int danoMax, int durabilidade) {
		setDanoMax(danoMax);
		setDurabilidade(durabilidade);
		setNome(nome);
	}

	public int getDanoMax() {
		return danoMax;
	}

	public void setDanoMax(int danoMax) {
		this.danoMax = danoMax;
	}

	public int getDurabilidade() {
		return durabilidade;
	}

	public void setDurabilidade(int durabilidade) {
		this.durabilidade = durabilidade;
	}
	
	public int atacar(){
		return  1;
	}
	
	public boolean usarApenasUmaMao(){
		return true;
	}

	@Override
	public String toString() {
		return super.toString() + " Arma [danoMax=" + danoMax + ", durabilidade=" + durabilidade + "]";
	}
	
	
}
