package com.fipe.mapper;

import com.fipe.database.model.Ano;
import com.fipe.model.AnoModel;

public class AnoModelMapper {
    public static AnoModel anoToAnoModel(Ano ano) {
        return AnoModel.builder()
                .codigoAno(ano.getCodigoAno())
                .nomeAno(ano.getNomeAno())
                .tipoVeiculo(ano.getTipoVeiculo())
                .build();
    }
}
