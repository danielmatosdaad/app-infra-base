package br.app.infra.base.dto;

import java.util.EnumSet;
import java.util.Iterator;

public enum TipoOperacaoFiltroDTO {

	IGUAL("igual"), DIFERENTE("diferente"), INICIA_COM("iniciacom"), TERMINA_COM("terminacom"), CONTEM("contem"), ENTRE("entre");

	private TipoOperacaoFiltroDTO(String value) {

		this.value = value;
	}

	private String value;

	public static TipoOperacaoFiltroDTO getOperacao(String operacao) {

		if (operacao == null) {
			return IGUAL;
		}
		EnumSet<TipoOperacaoFiltroDTO> enums = EnumSet.allOf(TipoOperacaoFiltroDTO.class);

		Iterator<TipoOperacaoFiltroDTO> iteratorEnum = enums.iterator();
		while (iteratorEnum.hasNext()) {
			TipoOperacaoFiltroDTO tipoOperacaoDTO = iteratorEnum.next();
			if (tipoOperacaoDTO.getValue().equals(operacao)) {

				return tipoOperacaoDTO;
			}
		}
		return IGUAL;
	}

	public String getValue() {
		return value;
	}

}
