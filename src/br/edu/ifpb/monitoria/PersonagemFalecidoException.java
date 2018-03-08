package br.edu.ifpb.monitoria;

public class PersonagemFalecidoException extends Exception {

	private static final long serialVersionUID = 1L;
	private String msg;
	public PersonagemFalecidoException() {
			msg = "Personagem faleceu. Tente voltar ao último save";
	}

}
