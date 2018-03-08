package br.edu.ifpb.monitoria;

public class AtaqueADistancia extends Arma {

	private boolean ataque;
	
	public AtaqueADistancia(String nome, int danoMax, int durabilidade,boolean ataque) {
		super(nome, danoMax, durabilidade);
		setAtaque(ataque);
	}

	public boolean isAtaque() {
		return ataque;
	}

	public void setAtaque(boolean ataque) {
		this.ataque = ataque;
	}

	@Override
	public String toString() {
		return super.toString() +" AtaqueADistancia [ataque=" + ataque + "]";
	}

	
}
