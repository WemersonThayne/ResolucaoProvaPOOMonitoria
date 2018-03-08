package br.edu.ifpb.monitoria;

import java.util.ArrayList;
import java.util.List;

public class Personagem {

	private String nome;
	private int maxHP;
	private int HPAtual;
	private List<Item> itens;
		
	public Personagem(String nome, int maxHP) {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMaxHP() {
		return maxHP;
	}

	public void setMaxHP(int maxHP) {
		this.maxHP = maxHP;
	}

	public int getHPAtual() {
		return HPAtual;
	}

	public void setHPAtual(int hPAtual) {
		HPAtual = hPAtual;
	}

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}
	
	public void equiparArma(Arma a){
		if(!itens.isEmpty()) {
			this.itens.add(a);
		}else {
			this.itens = new ArrayList<>();
			this.itens.add(a);
		}
	}
	
	public void addPocao(Pocao p) {
		if(!itens.isEmpty()) {
			this.itens.add(p);
		}else {
			this.itens = new ArrayList<>();
			this.itens.add(p);
		}
	}
	
	public void recuperarVida() {
		
	}
	
	public void sofrerDano(int dano) throws PersonagemFalecidoException{
		this.HPAtual -=dano;
	}
	
	public String status() {
		return "Personagem [nome=" + nome + ", maxHP=" + maxHP + ", HPAtual=" + HPAtual + ", itens=" + itens + "]";
	}

	
}
