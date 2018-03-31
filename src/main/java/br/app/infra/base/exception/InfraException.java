package br.app.infra.base.exception;

public class InfraException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Mensagem mensagem;

	public InfraException(Mensagem mensagem, Exception e) {
		super(e);
		this.mensagem = mensagem;
	}

	public Mensagem getMensagem() {
		return mensagem;
	}

}
