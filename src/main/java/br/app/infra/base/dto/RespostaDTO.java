package br.app.infra.base.dto;

import br.app.infra.base.exception.Mensagem;
import br.app.infra.base.interfaces.DTO;

public class RespostaDTO implements DTO {

	private Mensagem mensagem;
	private String respostaMensagem;

	public Mensagem getMensagem() {
		return mensagem;
	}

	public void setMensagem(Mensagem mensagem) {
		this.mensagem = mensagem;
	}

	public String getRespostaMensagem() {
		return respostaMensagem;
	}

	public void setRespostaMensagem(String respostaMensagem) {
		this.respostaMensagem = respostaMensagem;
	}

}
