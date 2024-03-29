package br.com.covid.brazil.api.util;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum RotasEnum {

    ACTUATOR("/actuator/health"),
    OBTER_DADOS_COVID_BRASIL_IO("/api/v1/covid/externo"),
    PERSISTIR_DADOS_COVID_BRASIL_IO("/api/v1/covid"),
    LISTAR_TODAS_CONSULTAS("/api/v1/covid"),
    LISTAR_CONSULTA_BY_ID("/api/v1/covid/%d"),
    DELETE_CONSULTA_BY_ID("/api/v1/covid/%d");

    private final String url;
}