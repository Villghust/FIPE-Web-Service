package com.fipe.contract.v1.mapper;

import com.fipe.contract.v1.model.request.AnoRequest;
import com.fipe.contract.v1.model.response.AnoResponse;
import com.fipe.database.model.Marca;
import com.fipe.database.model.TipoVeiculo;
import com.fipe.model.AnoModel;

public class AnoMapper {

    public static AnoResponse mapperToContract(AnoModel anoModel) {
        return AnoResponse.builder()
                .codigo(anoModel.getCodigoAno())
                .nome(anoModel.getNomeAno())
                .build();
    }

    public static AnoModel mapperToModel(AnoRequest anoRequest) {
        return AnoModel.builder()
                .build();
    }
}

// TODO Ano 1 - mapperToModel