package br.app.infra.base.dto;

import java.util.Map;

import br.app.infra.base.interfaces.DTO;


public class FiltroDTO extends EnvioDTO implements DTO {

	private Map<String, String> campoValores;

	private TipoOperacaoFiltroDTO tipoOperacao;

	public FiltroDTO() {

	}

	public FiltroDTO(Map<String, String> campoValores, TipoOperacaoFiltroDTO tipoOperacao) {

		this.campoValores = campoValores;
		this.tipoOperacao = tipoOperacao;
	}

	public Map<String, String> getCampoValores() {
		return campoValores;
	}

	public TipoOperacaoFiltroDTO getTipoOperacao() {
		return tipoOperacao;
	}

}
