package br.edu.ifpb.monitoria;

public class CorpoACorpo extends Arma {

	private String luta;
	
	public CorpoACorpo(String nome, int danoMax, int durabilidade,String luta) {
		super(nome, danoMax, durabilidade);
		setLuta(luta);
	}

	public String getLuta() {
		return luta;
	}

	public void setLuta(String luta) {
		this.luta = luta;
	}

	@Override
	public String toString() {
		return super.toString()+" CorpoACorpo [luta=" + luta + "]";
	}
	
	
}
